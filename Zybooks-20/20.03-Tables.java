/*
Write a program that calculates the number of full tables for a wedding event, based on the number of expected guests. Each full table will seat 10 wedding guests.

Collect one integer input and assign it to the variable guests. Using integer division, calculate the total number of tables that will be filled. The variable tableSize has been declared and initialized and the variables guests and tablesFilled have been declared in the template code.

Output the number of tables filled, ending with a newline. Ensure your program output matches the example formatting below and works for a variety of input values.

If the input is:

340
the output is:

Tables filled: 34
Alternatively, if the input is:

349
the output is:

Tables filled: 34
*/

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int tableSize=10, guests, tablesFilled;
      
      guests = scnr.nextInt();
      tablesFilled = guests / tableSize;
      System.out.println("Tables filled: " + tablesFilled);
      
   }
}