/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.calc.bo;

/**
 *
 * @author Satish
 */
public class MathFactory {
    public static MathCommand get(String key)
    {
        if(key.equalsIgnoreCase("1"))
        {
            return new Add();
        }
        else if(key.equalsIgnoreCase("2"))
        {
            return new Sub();
        }
        else if(key.equalsIgnoreCase("3"))
        {
            return new Div();
        }
        else if(key.equalsIgnoreCase("4"))
        {
            return new Mult();
        }
        else if(key.equalsIgnoreCase("5"))
        {
            return new Power();
        }  
        else if(key.equalsIgnoreCase("6"))
        {
            return new ExitCommand();
        } 
        return null;
        
    }
    
}
