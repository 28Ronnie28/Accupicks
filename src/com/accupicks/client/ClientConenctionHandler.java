/*
 * Sport score preditcion software
 * by Ronnie Muller & Stephan Malan
 */
package com.accupicks.client;

import com.shared.Client;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ClientConenctionHandler{

    private ObjectInputStream ois;
    private ObjectOutputStream oos;
    private Socket s;
    private final String IP_ADDRESS = "127.0.0.1";
    private final int PORT = 25760;
    private Client client;
    
    public ClientConenctionHandler() {
    }
    
    public Boolean connect() {
        try {
            System.out.println("Client> Trying to connect to server on " + IP_ADDRESS + ":" + PORT);
            s = new Socket(IP_ADDRESS, PORT);
            System.out.println("Client> Successfully connected to server");
            ois = new ObjectInputStream(s.getInputStream());
            oos = new ObjectOutputStream(s.getOutputStream());
            return true;
        } catch (IOException ex) {
            System.out.println("Client> " + ex);
        }
        return false;
    }

    public Boolean authorise(String username, String password) {
        System.out.println("Auth:" + username + ":" + password);
        sendString("Auth:" + username + ":" + password);
        return getReply().equals("Authed");
    }
    
    public Client getClient() {
        sendString("GetClient");
        client = (Client) getObject();
        return client;
    }
    
    public int forgotPassword(String username) {
        //result == -2) unknown error
        // result == -1) username not found
        // result == 0) email not sent
        // result == 1  successful
        if (validUsername(username)) {
            System.out.println("Client> Valid username: '" + username + "'");
            sendString("SendPassword:" + username);
            if (getReply().equals("true")) {
                System.out.println("Client> Sent password");
                return 1;
            } else {
                System.out.println("Client> Failed to send password");
                return 0;
            }
        } else {
            System.out.println("Client> Invalid username: '" + username + "'");
            return -1;
        }
    }
    
    public Boolean validUsername(String username) {
        sendString("ValidateUsername:" + username);
        return getReply().equals("true");
    }
    
    public String getReply() {
        try {
            while (ois.available() <= 0);
            return ois.readUTF().trim();
        } catch (IOException ex) {
            System.out.println("Client> " + ex);
        }
        return "";
    }
    
    public Object getObject() {
        try {
            Object object;
            while ((object = ois.readObject()) == null);
            return object;
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("Client> " + ex);
        }
        return null;
    }
    
    public void sendString(String data) {
        try {
            oos.writeUTF(data);
            oos.flush();
        } catch (IOException ex) {
            System.out.println("Client> " + ex);
        }
    }
    
}
