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
public class AssaultRifle extends Gun{
    @Override
    public void fire() {
        System.out.println(getName() + " " + "is a Assault Rifle having fire rate of" + " " + getFireRate() + " " + "with a muzzle velocity of" + " "+ getMuzzleVelocity());
    }    
}
