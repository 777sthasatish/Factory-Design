/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.fdd.bo;

/**
 *
 * @author Satish
 */
public class MySQL extends Database{

    @Override
    public void insert() {
        System.out.println("MySQL is a database developed by" + " " + getDeveloper() + " " + "of type" + " " + getType() +" "+ "and is inserting");
    }
    
}
