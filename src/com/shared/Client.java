/*
 * Sport score preditcion software
 * by Ronnie Muller & Stephan Malan
 */
package com.shared;

import java.io.Serializable;

public class Client implements Serializable{

private int id;
private String name;
private String password;
private String email;

    public Client(int id, String name, String password, String email) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
    }
    
    public String getName() {
        return name;
    }
    
}
