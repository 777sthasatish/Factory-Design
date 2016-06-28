/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.fdd.bo;

import java.util.Scanner;

/**
 *
 * @author Satish
 */
public class DatabaseMenu {

    public void Menu() {
        System.out.println("===================");
        System.out.println("1. Oracle");
        System.out.println("2. MySQL");
        System.out.println("3. SQLServer");
        System.out.println("4. Exit");
        System.out.println("===================");
        
        while (true) {
            System.out.println("Enter the Database type");
            Scanner input = new Scanner(System.in);
            String key = input.nextLine();
            Database db = DatabaseFactory.get(key);
            if (key.equalsIgnoreCase("Oracle")) {
                db.setDeveloper("Oracle Corporation");
                db.setType("ODBMS");
                db.insert();
            } else if (key.equalsIgnoreCase("MySQL")) {
                db.setDeveloper("Oracle Corporation");
                db.setType("RDBMS");
                db.insert();
            } else if (key.equalsIgnoreCase("SQL Server")) {
                db.setDeveloper("Microsoft Corporation");
                db.setType("RDBMS");
                db.insert();
            } 
            else if (key.equalsIgnoreCase("Exit")) {
                System.exit(0);
            } 
            else {
                System.out.println("Not Found");
            }
        }
    }

}
