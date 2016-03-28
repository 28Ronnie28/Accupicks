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
import java.util.logging.Level;
import java.util.logging.Logger;

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
        sendString("Auth:" + username + ":" + password);
        return getReply().equals("Authed");
    }
    
    public Client getClient() {
        sendString("GetClient");
        client = (Client) getObject();
        return client;
    }
    
    public String getReply() {
        try {
            while (ois.available() <= 0);
            return ois.readUTF();
        } catch (IOException ex) {
            System.out.println("Client> " + ex);
        }
        return "";
    }
    
    public Object getObject() {
        try {
            while (ois.available() <= 0);
            return ois.readObject();
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
