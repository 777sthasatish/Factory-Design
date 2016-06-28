/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.gun.bo;

import java.util.Scanner;

/**
 *
 * @author Satish
 */
public class GunMenu {

    public void Menu() {
        System.out.println("===================");
        System.out.println("1. Assault Rifle");
        System.out.println("2. Machine Gun");
        System.out.println("3. Pistols");
        System.out.println("4. SMG");
        System.out.println("5. Shotgun");
        System.out.println("6. Exit");
        System.out.println("===================");
        while (true) {
            System.out.println("Enter the gun type");
            Scanner sc = new Scanner(System.in);
            String key = sc.nextLine();
            Gun g = GunFactory.get(key);
            if (key.equalsIgnoreCase("Assault Rifle")) {
                g.setName("AK-47");
                g.setFireRate("600rounds/min");
                g.setMuzzleVelocity("715m/s");
                g.fire();
            } else if (key.equalsIgnoreCase("Machine Gun")) {
                g.setName("M2-Browning");
                g.setFireRate("450rounds/min");
                g.setMuzzleVelocity("886m/s");
                g.fire();
            } else if (key.equalsIgnoreCase("Pistols")) {
                g.setName(".44 Magnum");
                g.setFireRate("200rounds/min");
                g.setMuzzleVelocity("300m/s");
                g.fire();
            } else if (key.equalsIgnoreCase("SMG")) {
                g.setName("UZI");
                g.setFireRate("600rounds/min");
                g.setMuzzleVelocity("400m/s");
                g.fire();
            } else if (key.equalsIgnoreCase("Shotgun")) {
                g.setName("Sawed-off");
                g.setFireRate("50rounds/min");
                g.setMuzzleVelocity("250m/s");
                g.fire();
            } 
            else if (key.equalsIgnoreCase("Exit")) {
                g.fire();
            } else {
                System.out.println("Not found");
            }
        }
    }
}
