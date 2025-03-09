/*
Write a program whose input is two integers, and whose output is the first integer and subsequent increments of 5 as long as the value is less than or equal to the second integer. End with a newline.

Ex: If the input is:

-15 10
the output is:

-15 -10 -5 0 5 10
Ex: If the second integer is less than the first as in:

20 5
the output is:

Second integer can't be less than the first.
For coding simplicity, output a space after every integer, including the last.
*/
import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int number1 = scnr.nextInt();
      int number2 = scnr.nextInt();
      
      if (number1 > number2) {System.out.print("Second integer can't be less than the first.");}
      
      while (number1 <= number2) {System.out.print(number1 + " "); number1+= 5;}
      
      System.out.println();
   }
}