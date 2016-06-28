/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.fdg.bo;

import java.util.Scanner;

/**
 *
 * @author Satish
 */
public class GuitarMenu {

    public void Menu() {
        System.out.println("===================");
        System.out.println("1. Acoustic Guitar");
        System.out.println("2. Electric Lead Guitar");
        System.out.println("3. Exit");
        System.out.println("===================");
        while (true) {
            System.out.println("Enter the guitar type");
            Scanner sc = new Scanner(System.in);
            String choice = sc.nextLine();
            Guitar g = GuitarFactory.get(choice);
            if (choice.equalsIgnoreCase("Acoustic Guitar")) {
                g.setName("Gibson SJ200");
                g.setType("Steel String Acoustic Guitar");
                g.playGuitar();
            } else if (choice.equalsIgnoreCase("Electric Lead Guitar")) {
                g.setName("Paul Reed Smith");
                g.setType("Solid Body Guitar");
                g.playGuitar();
            } 
            else if (choice.equalsIgnoreCase("Exit")) {
                System.exit(0);
            } else {
                System.out.println("Not Found");
            }
        }
    }
}
