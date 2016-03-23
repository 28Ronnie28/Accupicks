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

    public Client(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }
    
    public String getName() {
        return name;
    }
    
}
