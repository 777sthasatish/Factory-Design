/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.dae.bo;

/**
 *
 * @author Satish
 */
public abstract class Pen {
    private String name;
    private String model;
    
    public Pen()
    {
        System.out.println("Default Constructor Hit");
    }
    
    public Pen(String name, String model)
    {
        this.name=name;
        this.model=model;
    }
    
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    public void setModel(String model)
    {
        this.model=model;                
    }
    public String getModel()
    {
        return model;
    }
    public abstract void write();
                
}
