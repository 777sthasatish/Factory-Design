/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.fdg.bo;

/**
 *
 * @author Satish
 */
public abstract class Guitar {
    private String name;
    private String type;
    
    public Guitar()
    {
        System.out.println("Constructor Hit");
    }
    
    public Guitar(String name, String type)
    {
        this.name=name;
        this.type=type;
    }
    
    public void setName(String name)
    {
        this.name=name;        
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setType(String type)
    {
        this.type=type;
    }
    
    public String getType()
    {
        return type;
    }
    
    public abstract void playGuitar();
    
}
