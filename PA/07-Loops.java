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

      int sum = 0;
      int smallest = Integer.MAX_VALUE;  // Initialize to a large value to find the smallest
      int input;

      // Collect inputs
      while (true) {
         input = scnr.nextInt();
         
         // End collection if negative number is entered
         if (input < 0) {
            break;
         }
         
         // Add the input to the sum
         sum += input;

         // Check if this is the smallest number so far
         if (input < smallest) {
            smallest = input;
         }
      }

      // Output the smallest number and the sum
      System.out.println("Smallest: " + smallest);
      System.out.println("Sum: " + sum);
   }
}
