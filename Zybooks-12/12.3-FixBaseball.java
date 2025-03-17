/*
The program contains syntax and logic errors. Fix the syntax errors in the Develop mode until the program executes. Then fix the logic errors.

Error messages are often long and technical. Do not expect the messages to make much sense when starting to learn a programming language. Use the messages as hints to locate the portion of the program that causes an error.

One error often causes additional errors further along in the program. For this exercise, fix the first error reported. Then try to run the program again. Repeat until all the compile-time errors have been corrected.

Hint: Pay attention to the one or two special lines that must appear at the beginning of the program. Unless those lines are included and are correct, the compiler will not be able to make sense of the code.

Ex: the If input is:

2 3 4
the output is:

Last night the Dodgers scored 2, 
the Yankees scored 3, and
the Cubs scored 4.
End the last output with a newline.
*/

import java.util.Scanner;
public class Baseball {
   public static void main(String [] args) {

      Scanner scnr = new Scanner(System.in);
      int dodgers = scnr.nextInt();
      int yankees = scnr.nextInt();
      int cubs = scnr.nextInt();

      System.out.println("Last night the Dodgers scored " +  dodgers + ", ");
      System.out.println("the Yankees scored " + yankees + ", and");
      System.out.println("the Cubs scored " + cubs + ".");
   }
}