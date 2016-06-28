/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.gun.bo;

/**
 *
 * @author Satish
 */
public abstract class Gun {
    private String name;
    private String fireRate;
    private String muzzleVelocity;
    public Gun()
    {
        System.out.println("Constructor Hit");
    }
    
    public Gun(String name, String fireRate, String muzzleVelocity)
    {
        this.name=name;
        this.fireRate=fireRate;
        this.muzzleVelocity=muzzleVelocity;
    }
    
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    public void setFireRate(String fireRate)
    {
        this.fireRate=fireRate;
    }
    public String getFireRate()
    {
        return fireRate;
    }
    public void setMuzzleVelocity(String muzzleVelocity)
    {
        this.muzzleVelocity=muzzleVelocity;
    }
    public String getMuzzleVelocity()
    {
        return muzzleVelocity;
    }
    public abstract void fire();        
}
