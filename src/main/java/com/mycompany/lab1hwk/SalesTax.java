/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab1hwk;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class SalesTax {
    public static void main(String[] args) {
        // Constants
      final double StateTaxRate = 0.04;  // State tax rate
      final double CountyTaxRate = 0.02; // County tax rate
      
      // Variables
      double purchase;         // Amount of purchase
      double stateTax;         // Amount of state sales tax
      double countyTax;        // Amount of county sales tax
      double totalTax;         // Total sales tax
      double totalCost;        // Total cost of the purchase
      
      // Createkeyboard input.
      Scanner keyboard = new Scanner(System.in);
             
      // Get the amount of the purchase.
      System.out.print("Enter the purchase amount here please: ");
      purchase = keyboard.nextDouble();
      String purchaseNumberAsString = keyboard.nextLine();
    
      // Calculations
      DecimalFormat df= new DecimalFormat("#.##");
      df.setRoundingMode(RoundingMode.CEILING);
      stateTax = purchase * StateTaxRate;
      countyTax = purchase * CountyTaxRate;
      totalTax = stateTax + countyTax;
      totalCost = purchase + totalTax;
      
      // Display the results.
      System.out.println("Purchase amount: $" + df.format(purchase));
      System.out.println("State tax: $" + df.format(stateTax));
      System.out.println("County tax: $" + df.format(countyTax));
      System.out.println("Total tax: $" + df.format(totalTax));
      System.out.println("Total cost: $" + df.format(totalCost));
    }
}
