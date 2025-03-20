/*
Given a floating-point number (double) as input, output the square root of the given number. Use the appropriate Math class method to perform the operation.

Ex: If the input is:

9.0
the output is:

Sqrt: 3.0
*/

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      double input = scnr.nextDouble();

      System.out.println("Sqrt: " + Math.sqrt(input));
   }
}
