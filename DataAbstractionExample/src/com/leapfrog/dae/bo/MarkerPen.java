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
public class MarkerPen extends Pen{

    @Override
    public void write() {
        System.out.println(getName() + " " + "is marker pen of model" + " "+getModel() + " "+ "is writing");
    }
    
}
