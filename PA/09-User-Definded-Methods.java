/*
Define a method named "showResults" with one parameter. The parameter should reference a random object rand. The showResults() method should generate a random integer of 0 or 1 using the random object reference rand. If the random number generated is equal to 1, return "true". If the random number generated is equal to 0, return "false".

In the main() method template, the rand variable has already been assigned a random object with a seed value of 2. Write a program that collects one integer value as input, assumed to be greater than 0. Use a loop to call the showResults() method a number of times equal to the integer input. e.g., If 3 is entered as input, then showResults() will be called 3 times, each time returning "true" or "false".

Output the returned Boolean values on separate lines, ending with a newline.

If the input is:
3

the output with a random object seed value of 2 is:
true
false
true
*/
import java.util.Scanner;
import java.util.Random;

public class LabProgram {

   // Define the showResults method that generates random values
   public static String showResults(Random rand) {
      // Generate a random number, either 0 or 1
      int result = rand.nextInt(2); // nextInt(2) returns 0 or 1
      
      // Return "true" for 1, "false" for 0
      if (result == 1) {
         return "true";
      } else {
         return "false";
      }
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      Random rand = new Random(2); // Seed used in development mode

      // Collect the integer input
      int numTimes = scnr.nextInt();
      
      // Loop numTimes times to call showResults and print the output
      for (int i = 0; i < numTimes; i++) {
         // Call showResults and print the result
         System.out.println(showResults(rand));
      }
   }
}
