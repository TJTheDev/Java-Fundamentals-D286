/*
The Fibonacci sequence begins with 0 and then 1 follows. All subsequent values are the sum of the previous two, for example: 0, 1, 1, 2, 3, 5, 8, 13. Complete the fibonacci() method, which has an index, n (starting at 0), as a parameter and returns the nth value in the sequence. Any negative index values should return -1.

Ex: If the input is:

7
the output is:

fibonacci(7) is 13
Note: Use a for loop and DO NOT use recursion.
*/

import java.util.Scanner;

public class LabProgram {
   
   public static int fibonacci(int n) {
      
      int last = 0;
      int hold = 0;
      int output = 0;
      
      if (n < 0) {
         return -1;   
      }
      
      for (int i = 0; i < n - 1; i++){
         if (output == 0 && n > 0){
            output = 1;
            hold = output;
            output = output + last;
            last = hold;
         } else {
            hold = output;
            output = output + last;
            last = hold;
         }
      }
      
      return output;
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int startNum = scnr.nextInt();
      System.out.println("fibonacci(" + startNum + ") is " + fibonacci(startNum));
   }
}