/*
 * Sport score preditcion software
 * by Ronnie Muller & Stephan Malan
 */
package com.accupicks.server;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseHandler {

    private Connection con;
    private Statement stmt;
    private ResultSet rs;

    public Boolean connect() {
        try {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:C:/Users/Stephan/temp.db");
            System.out.println("Server> Connected to database");
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Server> " + ex);
            return false;
        }
    }
    
    public Boolean setResultSet(String sql, int connectionNum) {
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);
            return true;
        } catch (SQLException ex) {
            System.out.println("Server> Connection " + connectionNum + "> " + ex);
            return false;
        }
    }

    public int usernameExists(String username, int connectionNum) {
        // return 1 admin
        // return 0 client
        // return -1 error
        try {
            while (rs.next()) {
                if (rs.getString("username").equals(username)) {
                    if (rs.getString("type").equals("admin")) {
                        return 1;
                    } else {
                        return 0;
                    }
                }
            }
        } catch (SQLException ex) {
            System.out.println("Server> Connection " + connectionNum + "> " + ex);
        }
        return -1;
    }
}
