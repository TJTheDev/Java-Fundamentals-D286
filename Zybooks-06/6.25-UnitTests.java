/*
Auto-graded programming assignments may use a Unit test to test small parts of a program. Unlike a Compare output test, which evaluates your program's output for specific input values, a Unit test evaluates individual methods to determines if each method:

is named correctly and has the correct parameters and return type
calculates and returns the correct value (or prints the correct output)
This example lab uses multiple unit tests to test the kiloToPounds() function.

Complete a program that takes a weight in kilograms as input, converts the weight to pounds, and then outputs the weight in pounds. 1 kilogram = 2.204 pounds (lbs).

Ex: If the input is:

10
the output is:

22.040000000000003 lbs
Note: Your program must define the method
public static double kiloToPounds(double kilos)

The program below has an error in the kiloToPounds() method.

Try submitting the program for grading (click "Submit mode", then "Submit for grading"). Notice that the first two test cases fail, but the third test case passes. The first test case fails because the program outputs the result from the kiloToPounds() function, which has an error. The second test case uses a Unit test to test the kiloToPounds() function, which fails.

Change the kiloToPounds() method to multiply the variable kilos by 2.204, instead of dividing. The return statement should be: return (kilos * 2.204); Submit again. Now the test cases should all pass.

Note: A common error is to mistype a function name with the incorrect capitalization. Function names are case sensitive, so if a lab program asks for a kiloToPounds() function, a KiloToPounds() function that works for you in develop mode will result in a failed unit test (the unit test will not be able to find kiloToPounds()).
*/

import java.util.Scanner;

public class Main {
   
   public static double kiloToPounds(double kilos) {
      // This statement intentionally has an error. 
      return (kilos * 2.204);
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      double kilos;
      double pounds;
      
      kilos = scnr.nextDouble();
      
      pounds = kiloToPounds(kilos);
      System.out.println(pounds + " lbs");
   }
}