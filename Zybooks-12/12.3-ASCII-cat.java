/*
Program Specifications Pictures made from keyboard characters are known as ASCII art and can be quite intricate. ASCII Art Archive provides examples. Write a program that reads a cat name (string) and outputs the drawing using System.out.println().

Note: a backslash \ in a string acts as an escape character, such as with a newline \n. So, to print a single backslash, include two backslashes next to each other. Ex: The following prints a single backslash: System.out.print("\\");


Note: This program is designed for incremental development. Complete each step and submit for grading before starting the next step. Only a portion of tests pass after each step to confirm progress.

Ex: If the input is:

Mittens
the output is

      /\_/\
 /\  / o o \
//\\ \~(*)~/
`  \/   ^ /
   | \|| ||
   \ '|| ||
    \)()-())
My cat Mittens
Step 1 (2 pts). Write output statements for the first two lines of the figure. Hint: The first line starts with 6 blank spaces before the first slash symbol. Submit for grading to confirm 1 test passes.

Step 2 (2 pts). Write two more output statements for the next two lines. Hint: The third line starts a slash symbol. Submit for grading to confirm 2 tests pass.

Step 3 (2 pts). Write three more output statements to complete the figure without the text label. Submit for grading to confirm 3 tests pass.

Step 4 (4 pts). Read from input the cat name (string). Output the cat name in the format shown. Submit for grading to confirm all tests pass.
*/

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String catName = scnr.nextLine();

      System.out.println("      /\\_/\\");
      System.out.println(" /\\  / o o \\");
      System.out.println("//\\\\ \\~(*)~/");
      System.out.println("`  \\/   ^ /");
      System.out.println("   | \\|| ||");
      System.out.println("   \\ '|| ||");
      System.out.println("    \\)()-())");
      System.out.println("My cat " + catName);
   }
}
