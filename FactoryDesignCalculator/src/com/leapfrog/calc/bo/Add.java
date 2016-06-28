/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.calc.bo;

/**
 *
 * @author Satish
 */
public class Add extends MathCommand{

    @Override
    public double calc(double num1, double num2) {
        double total=num1+num2;
        return total;
    }
    
}
