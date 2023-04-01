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
public class YieldToMaturity {
    public static void main (String args[]){
      float c, f, p, n, ytm;
      System.out.println("Required packages have been imported");
      Scanner my_scanner = new Scanner(System.in);
      System.out.println("A my_scanner object has been defined ");
      
      System.out.print("Enter a Coupon/Interest Payment : ");
      c = my_scanner.nextInt();
      
      System.out.print("Enter a Face Value : ");
      f = my_scanner.nextInt();
      
      System.out.print("Enter a Price : ");
      p = my_scanner.nextInt();
      
      System.out.print("Enter a years of maturity : ");
      n = my_scanner.nextInt();

      ytm = (c+((f-p)/n)/((f+p)/2));
      System.out.println("The Simple Interest is : " + ytm);
   }
}
