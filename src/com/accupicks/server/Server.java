/*
 * Sport score predicition software
 * Written by Ronnie Muller and Stephan Malan
 */
package com.accupicks.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Server {

    List<ConnectionHandler> connectionsList = new ArrayList<>();
    final int MAX_CONNECTIONS = 100;
    final int PORT = 25760;
    final int PORT2 = 25761;
    private Socket s;

    public Server() {
        connect();
    }

    public void connect() {
        try {
            System.out.println("Server> Trying to set up commandline server on port " + PORT);
            ServerSocket ss = new ServerSocket(PORT);
            System.out.println("Server> Set up commandline server on port " + PORT);
            System.out.println("Server> Trying to set up object server on port " + PORT2);
            ServerSocket ss2 = new ServerSocket(PORT2);
            System.out.println("Server> Set up object server on port " + PORT2);
            while (true) {
                while (connectionsList.size() < MAX_CONNECTIONS) {
                    System.out.println("Server> Waiting for client connection " + connectionsList.size() + 1);
                    s = ss.accept();
                    s.setKeepAlive(true);
                    connectionsList.add(new ConnectionHandler(s, connectionsList.size() + 1));
                    connectionsList.get(connectionsList.size() - 1).start();
                    System.out.println("Server> Connection established client " + connectionsList.size() + " on " + s.getInetAddress() + ":" + s.getPort());
                }
            }
        } catch (IOException ex) {
            System.out.println("Server> " + ex);
        }
    }

    public class ConnectionHandler extends Thread {

        private Socket s;
        private int connectionNum;
        private BufferedReader br;
        private PrintStream ps;

        public ConnectionHandler(Socket s, int connectionNum) {
            this.s = s;
            this.connectionNum = connectionNum;
            try {
                br = new BufferedReader(new InputStreamReader(s.getInputStream()));
                ps = new PrintStream(s.getOutputStream());
            } catch (IOException ex) {
                System.out.println("Server> Connection " + connectionNum + "> " + ex);
            }
        }

        @Override
        public void run() {
            Boolean getAuth = true;
            while (getAuth) {
                send("auth");
                String userPass = getReply();
                if (userPass.contains(":") && userPass.split(":").length == 2) {
                    if (userPass.split(":")[0].matches("^[a-zA-Z0-9]*$") && userPass.split(":")[1].matches("^[a-zA-Z0-9]*$")) {
                        //TODO retrieve from database
                        if (userPass.equals("admin:admin")) {
                            send("test");
                        }
                    }
                }
            }
            String userPass;

        }

        public String getReply() {
            try {
                while (!br.ready());
                return br.readLine();
            } catch (IOException ex) {
                System.out.println("Server> Connection " + connectionNum + "> " + ex);
            }
            return null;
        }

        public void send(String data) {
            ps.println();
            ps.flush();
        }

        public void closeConnection() {
            connectionsList.remove(connectionNum);
            updateConnectionList();
            this.stop();
        }

        public void updateConnectionNum(int connectionNum) {
            this.connectionNum = connectionNum;
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
