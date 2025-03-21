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
   public static boolean showResults(Random rand){
      int randomNum = rand.nextInt(2);
      return (randomNum == 1);
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      Random rand = new Random(2); // Seed used in develop mode
      int runs = scnr.nextInt();
      
      while (runs > 0) {
         System.out.println(showResults(rand));
         runs --;   
      }
      
   }
}