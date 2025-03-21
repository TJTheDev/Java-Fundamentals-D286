/*
Write a program that creates an array to hold three values of type double. The program should collect the three double values as input and store them in the array. Then calculate the average value of the array.

Output the array values and calculated average value, ending with a newline. Ensure your program output matches the example formatting below and works for a variety of input values.

If the input is:

10.0
10.5
11.0
the output is:

Array items: 10.0, 10.5, 11.0
Average: 10.5
*/

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double[] nums = new double[3];
      int x = 0;
      
      System.out.print("Array items: ");
      while (x < 3) {
         nums[x] = scnr.nextDouble();
         if (x == 2) {
            System.out.println(nums[x]);
         } else {
         System.out.print(nums[x] + ", ");}
         x++;
      }
      System.out.println("Average: " + (nums[0] + nums[1] + nums[2]) / 3);
      
   }
}