/*
A number is divisible by 3 if the sum of its digits is divisible by 3. For example, 153 is divisible by 3 because 1 + 5 + 3 = 9 and 9 is divisible by 3.

Write a program that collects three integer inputs representing the place values of a three-digit number. Determines whether the sum of the digits is divisible by 3. If any integer entered is a negative value, output Invalid input!

Output a formatted message identifying if the three-digit number is divisible by 3, ending with a newline. Ensure your program output matches the example formatting below and works for a variety of input values.

If the input is:

1
5
3
the output is:

153 is divisible by 3!
Alternatively, if the input is:

1
0
4
the output is:

104 is not divisible by 3!
Alternatively, if the input is:

1
-5
3
the output is:

Invalid input!
*/

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int num1 = scnr.nextInt();
      int num2 = scnr.nextInt();
      int num3 = scnr.nextInt();
      int total = (num1 * 100 ) + (num2 * 10) + num3;
      boolean output = (total % 3 == 0);
      
      if (num1 < 0 || num2 < 0 || num3 < 0) {
         System.out.println("Invalid input!");
      } else {
         if (output) {System.out.println(total + " is divisible by 3!");}
         if (!output){System.out.println(total + " is not divisible by 3!");}
         }
      
   }
}