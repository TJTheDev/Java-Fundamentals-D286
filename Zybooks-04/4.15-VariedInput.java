/*
Statistics are often calculated with varying amounts of input data. Write a program that takes any number of non-negative integers as input, and outputs the max and average. A negative integer ends the input and is not included in the statistics. Assume the input contains at least one non-negative integer.

Output the average with two digits after the decimal point followed by a newline, which can be achieved as follows:
System.out.printf("%.2f\n", average);

Ex: When the input is:

15 20 0 3 -1
the output is:

20 9.50
*/
import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      double average = 0;
      int max = 0;
      int count = 0;
      
      Scanner scnr = new Scanner(System.in);
      int number = number = scnr.nextInt();
      
      while (number >= 0) {
         if (number > max) {
            max = number;
         }
         if (number >= 0) {
            average += number;
            count++;
            number = scnr.nextInt();
         }
         
      }
      average = average / count;
      System.out.print(max + " ");
      System.out.printf("%.2f\n", average);
   }
}
