/*
The program (Pluto.java) contains syntax and logic errors. Fix the syntax errors in the Develop mode until the program executes. Then fix the logic errors.

Error messages are often long and technical. Do not expect the messages to make much sense when starting to learn a programming language. Use the messages as hints to locate the portion of the program that causes an error.

One error often causes additional errors further along in the program. For this exercise, fix the first error reported. Then try to run the program again. Repeat until all the compile-time errors have been corrected.

The correct output of the program is:

Is Pluto a planet?
Some people think so, but others don't.
The Moon's mass is 6 times Pluto's.
Not much of a planet, is it?
End the last output with a newline.
*/

public class Pluto {
public static void main(String [] args) {
   int proportion = 6;

   System.out.println("Is Pluto a planet?");
   System.out.print("Some people think so, ");
   System.out.println("but others don't.");
   System.out.println("The Moon's mass is " + proportion + " times Pluto's.");
   System.out.println("Not much of a planet, is it?");
   
   }
}