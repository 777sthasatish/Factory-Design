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
public class ElectricLeadGuitar extends Guitar{

    @Override
    public void playGuitar() {
        System.out.println(getName() + " " + "is a" + " " + getType() + " " + "which is a electric guitar and it's playing");
    }
    
}
