/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laba_3;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a, b: ");
        double a = in.nextDouble();
        double b = in.nextDouble();
        System.out.println("Summa: " + (a+b));
        System.out.println("Raznost: " + (a-b));
        System.out.println("Mult: " + (a*b));
        
        
        
    }
    
}
