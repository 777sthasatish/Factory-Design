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
public class DatabaseFactory {
    public static Database get(String key)
    {
        if(key.equalsIgnoreCase("Oracle"))
        {
            return new Oracle();
        }
        else if(key.equalsIgnoreCase("MySQL"))
        {
            return new MySQL();
        }
        else if(key.equalsIgnoreCase("SQL Server"))
        {
            return new SQLServer();
        }
        else
            return null;
    } 
               
}
