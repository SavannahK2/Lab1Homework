/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab1hwk;

import java.util.Scanner;

/**
 *
 * @author 0786954
 */
public class CookieCalories {
    public static void main(String[] args) {
 
        //set up input
    Scanner sc = new Scanner(System.in);
 
    //set up print out question
    System.out.print("Please enter how many cookies you ate: ");
 
    //gather input
    int cookieCount = sc.nextInt();
 
    //calculations
    int servingSize = 40/10;
    int caloriesPerCookie = 300/servingSize;
    int totalCalories = cookieCount * caloriesPerCookie;
 
    //display the results
    System.out.println("The total calories you consumed is: " + totalCalories);
    }
}
