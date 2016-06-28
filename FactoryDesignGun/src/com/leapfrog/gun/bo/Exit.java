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
public class Exit extends Gun{

    @Override
    public void fire() {
        System.exit(0);
    }
    
}
