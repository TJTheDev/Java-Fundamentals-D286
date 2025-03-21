/*
Write a program that collects any number of non-negative integer inputs and calculates the sum of the values. A negative integer should end the input collection and is not part of the sum.

Output the smallest non-negative value and the sum of the non-negative input values, ending with a newline. Ensure your program output matches the example formatting below and works for a variety of input values.

If the input is:

15
20
0
3
-1
the output is:

Smallest: 0
Sum: 38
*/

import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int numIn = scnr.nextInt();
      int sum = 0;
      int smallest = numIn;
      
      while (numIn >= 0) {
         if (numIn >= 0) {
            sum = sum + numIn;
         }
         if (numIn < smallest) {
               smallest = numIn;   
            }
         numIn = scnr.nextInt();
      }
      
      System.out.println("Smallest: " + smallest);
      System.out.println("Sum: " + sum);
      
   }
}