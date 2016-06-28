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
public class GunFactory {
    public static Gun get(String key)
    {
        if(key.equalsIgnoreCase("Assault Rifle"))
        {
            return new AssaultRifle();
        }  
        else if(key.equalsIgnoreCase("Machine Gun"))
        {
            return new MachineGun();
        }  
        else if(key.equalsIgnoreCase("Pistol"))
        {
            return new Pistols();
        } 
        else if(key.equalsIgnoreCase("SMG"))
        {
            return new SMG();
        } 
        else if(key.equalsIgnoreCase("Shotgun"))
        {
            return new Shotgun();
        } 
        else if(key.equalsIgnoreCase("Exit"))
        {
            return new Exit();
        }
        return null;
    }
    
}
