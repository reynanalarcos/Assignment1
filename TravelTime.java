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
public class TravelTime {
    public static void main (String args[]){
      float distance, speed, time;
      System.out.println("Required packages have been imported");
      Scanner my_scanner = new Scanner(System.in);
      System.out.println("A my_scanner object has been defined ");
      
      System.out.print("Enter a Distance (km) : ");
      distance = my_scanner.nextInt();
      
      System.out.print("Enter a Speed (km/hr) : ");
      speed = my_scanner.nextInt();
      
      time = distance/speed;
      System.out.println("The Simple Interest is : " +time);
   }
}