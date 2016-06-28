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
public class GuitarFactory {
    public static Guitar get(String key)
    {
        if(key.equalsIgnoreCase("Acoustic Guitar"))
        {
            return new AcousticGuitar();
        }
        else if(key.equalsIgnoreCase("Electric Lead Guitar"))
        {
            return new ElectricLeadGuitar();
        }       
        else
        {
            return null;
        }
    }
}
