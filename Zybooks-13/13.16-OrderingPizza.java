/*
A local pizza shop is selling a large pizza for $9.99. Given the number of pizzas to order as input, output the subtotal for the pizzas, and then output the total after applying a sales tax of 6%.

Output each floating-point value with two digits after the decimal point, which can be achieved as follows:
System.out.printf("Subtotal: %.2f\n", yourValue);

Ex: If the input is:

3
the output is:

Subtotal: $29.97
Total due: $31.77
*/

import java.util.Scanner;

public class LabProgram {
   
   public static void main(String[] args) {
      
      Scanner scnr = new Scanner(System.in);
      
      int input = scnr.nextInt();
      double cost = 9.99 * input;

      System.out.printf("Subtotal: $%.2f\n", cost);
      System.out.printf("Total due: $%.2f\n", (cost) + (cost * .06));
   }
}
