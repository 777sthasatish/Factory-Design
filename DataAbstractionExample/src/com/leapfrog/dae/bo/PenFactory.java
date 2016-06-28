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
public class PenFactory {
    public static Pen get(String key)
    {
        if(key.equalsIgnoreCase("Ball pen"))
        {
            return new BallPen();
        }
        else if(key.equalsIgnoreCase("Fountain pen"))
        {
            return new FountainPen();
        }
        else if(key.equalsIgnoreCase("Marker pen"))
        {
            return new MarkerPen();
        }
        return null;
    }
        
}
