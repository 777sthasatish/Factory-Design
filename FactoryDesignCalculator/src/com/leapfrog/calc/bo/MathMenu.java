/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.calc.bo;

import java.util.Scanner;

/**
 *
 * @author Satish
 */
public class MathMenu {

    private double x, y;

    public void menu() {
        System.out.println("=================");
        System.out.println("1.Add");
        System.out.println("2.Subtract");
        System.out.println("3.Divide");
        System.out.println("4.Multiply");
        System.out.println("5.Power");
        System.out.println("6.Exit");
        System.out.println("=================");
    }

    public void result() {
        while (true) {
            menu();
            Scanner input = new Scanner(System.in);
            System.out.println("Please Enter you choice[1-6]");
            String choice = input.next();
            MathCommand mc = MathFactory.get(choice);
            System.out.println("Please enter the first number");
            x = input.nextDouble();
            System.out.println("Please enter the second number");
            y = input.nextDouble();
            double total = 0;
            if (mc != null) {
                total = mc.calc(x, y);
                System.out.println("total is:" + total);
            }
        }

    }
}
