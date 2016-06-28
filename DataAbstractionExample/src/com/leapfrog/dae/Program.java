/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.dae;

import com.leapfrog.dae.bo.Pen;
import com.leapfrog.dae.bo.PenFactory;

/**
 *
 * @author Satish
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Pen p=PenFactory.get("fountain pen");
        if(p!=null)
        {
        p.setName("Max Writer");
        p.setModel("4545-989");
        p.write();
        }
        else
        {
            System.out.println("Not Found");
        }
        
    }
    
}
