/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.fdd.bo;

/**
 *
 * @author Satish
 */
public abstract class Database {
    private String developer;
    private String type;
    public Database()
    {
        
    }

    public Database(String developer, String type) {
        this.developer = developer;
        this.type = type;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public abstract void insert();
    
}
