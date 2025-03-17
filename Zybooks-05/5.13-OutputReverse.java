/*
Write a program that reads a list of integers and outputs those integers in reverse. The input begins with an integer indicating the number of integers that follow. For coding simplicity, follow each output integer by a comma, including the last one. Assume that the list will always contain fewer than 20 integers.

Ex: If the input is:

5 2 4 6 8 10
the output is:

10,8,6,4,2,
To achieve the above, first read the integers into an array. Then output the array in reverse.
*/

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int[] userList = new int[20];   // List of numElement integers specified by the user
      int numElements;                // Number of integers in user's list
      // Add more variables as needed

      numElements = scnr.nextInt();   // Input begins with number of integers that follow
      
      int output = numElements;
      
      for (int x = 0; x < numElements; x++) {
         userList[x] = scnr.nextInt();
         // System.out.print(userList[x] + ", ");
         }
      while (output >= 1) {
         System.out.print(userList[output - 1] + ",");
         output --;
      }
      System.out.println();
   }
}
