/*
 * Sport score predicition software
 * Written by Ronnie Muller and Stephan Malan
 */
package com.accupicks.server;

import com.shared.Client;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Server {

    List<ConnectionHandler> connectionsList = new ArrayList<>();
    final int MAX_CONNECTIONS = 100;
    final int PORT = 25760;
    private Socket s;
    private ClientListner cl = new ClientListner();
    private ServerCommandListner scl = new ServerCommandListner();
    private Connection con;
    private Statement stmt;

    public Server() {
        cl.start();
        scl.start();
    }

    //Thread to listen to input from user into server console
    public class ServerCommandListner extends Thread {

        public ServerCommandListner() {
        }

        @Override
        public void run() {
            while (true) {
                Scanner scn = new Scanner(System.in);
                while (scn.hasNextLine()) {
                    String command = scn.nextLine();
                    if (command.equals("/exit")) {
                        System.out.println("Server> Shutting down server");
                        System.exit(0);
                    } else if (command.equals("/connection -list")) {
                        if (connectionsList.isEmpty()) {
                            System.out.println("Server> No connections found");
                        } else {
                            System.out.println("Server> Current connections:");
                            for (ConnectionHandler ch : connectionsList) {
                                if (ch.getClient() == null) {
                                    System.out.println("\tConnection " + ch.getConnectionNum() + ": Unauthorised - " + ch.getSocket().getInetAddress().getHostAddress() + ":" + ch.getSocket().getLocalPort());
                                } else {
                                    System.out.println("\tConnection " + ch.getConnectionNum() + ": " + ch.getClient().getName() + " - " + ch.getSocket().getInetAddress().getHostAddress() + ":" + ch.getSocket().getLocalPort());
                                }
                            }
                        }
                    } else if (command.startsWith("/connection")) {

                    } else if (command.startsWith("/help")) {

                    } else if (command.startsWith("")) {

                    } else if (command.startsWith("")) {

                    } else if (command.startsWith("")) {

                    } else if (command.startsWith("")) {

                    } else {
                        System.out.println("Server> Unknown command: '" + command + "'");
                    }
                }
            }
        }
    }

    //Thread to listen for new clients and instantiate new connections with them
    public class ClientListner extends Thread {

        public ClientListner() {
        }

        @Override
        public void run() {
            try {
                System.out.println("Server> Trying to set up server on port " + PORT);
                ServerSocket ss = new ServerSocket(PORT);
                System.out.println("Server> Set up server on port " + PORT);
                while (true) {
                    while (connectionsList.size() < MAX_CONNECTIONS) {
                        System.out.println("Server> Waiting for client connection " + (connectionsList.size() + 1));
                        s = ss.accept();
                        s.setKeepAlive(true);
                        connectionsList.add(new ConnectionHandler(s, connectionsList.size() + 1));
                        connectionsList.get(connectionsList.size() - 1).start();
                        System.out.println("Server> Connection established client " + connectionsList.size() + " on " + s.getInetAddress().getHostAddress() + ":" + s.getPort());
                    }
                }
            } catch (IOException ex) {
                System.out.println("Server> " + ex);
            }
        }
    }

    //Thread to control communication between client and server
    public class ConnectionHandler extends Thread {

        private Socket s;
        private int connectionNum;
        private ObjectInputStream ois;
        private ObjectOutputStream oos;
        private Client client;
        private Boolean authorised = false;
        private Email email = new Email();

        public ConnectionHandler(Socket s, int connectionNum) {
            this.s = s;
            this.connectionNum = connectionNum;
            try {
                oos = new ObjectOutputStream(s.getOutputStream());
                ois = new ObjectInputStream(s.getInputStream());
            } catch (IOException ex) {
                System.out.println("Server> Connection " + connectionNum + "> " + ex);
            }
        }

        @Override
        public void run() {
            while (true) {
                String command = getReply().trim();
                if (command.startsWith("Auth:")) {
                    String userPass = command.substring(5);
                    if (userPass.contains(":") && userPass.split(":").length == 2) {
                        if (userPass.split(":")[0].matches("^[a-zA-Z0-9]*$") && userPass.split(":")[1].matches("^[a-zA-Z0-9]*$")) {
                            //TODO retrieve from database
                            if (userPass.equals("admin:admin")) {
                                authorised = true;
                                client = new Client(1, "admin", "admin", "swooosh.apps@gmail.com");
                                System.out.println("Server> Connection " + connectionNum + "> Authorised connection with " + client.getName());
                                send("Authed");
                            }
                        }
                    }
                } else if (authorised && command.equals("GetClient")) {
                    sendObject(client);
                    System.out.println("Server> Connection " + connectionNum + "> Sent client info to client");
                } else if (command.startsWith("ValidateUsername:")) {
                    //TODO retrieve from database
                    if (command.split(":").length > 1 && command.split(":")[1].equals("admin")) {
                        send("true");
                        System.out.println("Server> Connection " + connectionNum + "> Valid username: '" + command.split(":")[1] + "'");
                    } else {
                        send("false");
                        System.out.println("Server> Connection " + connectionNum + "> Invalid username: '" + command.split(":")[1] + "'");
                    }
                } else if (command.startsWith("SendPassword:")) {
                    //TODO retrieve from database
                    if (email.emailPassword("admin", "stephanmalan.rob@gmail.com", "admin", connectionNum) == 1) {
                        send("true");
                        System.out.println("Server> Connection " + connectionNum + "> Sent email");
                    } else {
                        send("false");
                        System.out.println("Server> Connection " + connectionNum + "> Failed to send email");
                    }
                } else {
                    System.out.println("Server> Connection " + connectionNum + "> Unknown command from client: " + command + "'");
                }
            }
        }

        public String getReply() {
            try {
                while (ois.available() <= 0);
                return ois.readUTF();
            } catch (IOException ex) {
                System.out.println("Server> Connection " + connectionNum + "> " + ex);
            }
            return null;
        }

        public void send(String data) {
            try {
                oos.writeUTF(data);
                oos.flush();
            } catch (IOException ex) {
                System.out.println("Server> Connection " + connectionNum + "> " + ex);
            }
        }

        public void sendObject(Object object) {
            try {
                oos.writeObject(object);
                oos.flush();
            } catch (IOException ex) {
                System.out.println("Server> Connection " + connectionNum + "> " + ex);
            }
        }

        public void closeConnection() {
            connectionsList.remove(connectionNum);
            updateConnectionList();
            this.stop();
        }

        public void updateConnectionNum(int connectionNum) {
            this.connectionNum = connectionNum;
        }

        public Client getClient() {
            return client;
        }

        public int getConnectionNum() {
            return connectionNum;
        }

        public Socket getSocket() {
            return s;
        }
    }

    public void connect() {
        try {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:C:/Users/Stephan/temp.db");
            stmt = con.createStatement();
            System.out.println("Client> Connected to database");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Client> " + ex);
        }
    }
    
    public void updateConnectionList() {
        int count = 1;
        for (ConnectionHandler ch : connectionsList) {
            ch.updateConnectionNum(count);
            count++;
        }
    }

    public static void main(String[] args) {
        new Server();
    }

}
