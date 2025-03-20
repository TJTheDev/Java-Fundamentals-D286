/*
Given the number of people attending a pizza party, output the number of needed pizzas and total cost. For the calculation, assume that people eat 2 slices on average and each pizza has 12 slices and costs $14.95.

Output each floating-point value with two digits after the decimal point, which can be achieved as follows:
System.out.printf("Cost: $%.2f\n", cost);

Ex: If the input is:

4
the output is:

Pizzas: 1
Cost: $14.95
Hint: Use the ceil() method to round up the number of pizzas so that enough pizzas are ordered.
*/

import java.util.*;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      int input = scnr.nextInt();
      input = input * 2;
      int pizzas = 1;
      
      if (input == 0) {
         pizzas = 0;   
      }
      
      while (input > 12) {
         input = input - 12;
         pizzas++;
      }
      
      System.out.println("Pizzas: " + pizzas);
      System.out.printf("Cost: $%.2f\n", pizzas * 14.95);
   }
}
