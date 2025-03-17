/*
The program contains syntax and logic errors. Fix the syntax errors in the Develop mode until the program executes. Then fix the logic errors.

Error messages are often long and technical. Do not expect the messages to make much sense when starting to learn a programming language. Use the messages as hints to locate the portion of the program that causes an error.

One error often causes additional errors further along in the program. For this exercise, fix the first error reported. Then try to run the program again. Repeat until all the compile-time errors have been corrected.

The correct output of the program is:

Sides: 12 10
Perimeter: 44
End the last output with a newline.
*/

public class Kite {
   public static void main(String [] args) {
      int longSide = 12;
      int shortSide = 10;
      int perimeter = 2 * (longSide + shortSide);

      System.out.println("Sides: " + longSide + " " + shortSide);
      System.out.println("Perimeter: " + perimeter);
   }
}
