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
public class Div extends MathCommand{

    @Override
    public double calc(double num1, double num2) {
        return num1/num2;
    }
    
}
