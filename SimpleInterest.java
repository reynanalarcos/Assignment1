/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.reynalarcos.learnjava;

import java.util.Scanner;

/**
 *
 * @author lucifer
 */
public class SimpleInterest {
    public static void main (String args[]){
      float principle, rate, time, simple_interest;
      System.out.println("Required packages have been imported");
      Scanner my_scanner = new Scanner(System.in);
      System.out.println("A my_scanner object has been defined ");
      System.out.print("Enter a Principle number : ");
      principle = my_scanner.nextInt();
      System.out.print("Enter a Interest rate : ");
      rate = my_scanner.nextInt();
      System.out.print("Enter a Time period in years : ");
      time = my_scanner.nextInt();
      simple_interest = (principle*rate*time)/100;
      System.out.println("The Simple Interest is : " + simple_interest);
   }
}
