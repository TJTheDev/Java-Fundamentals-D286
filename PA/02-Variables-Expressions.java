/*
Write a program that collects two integer inputs and assigns them to the variables starting_num and multiplier. Multiply starting_num by multiplier and output the result. Repeat this process two more times, each time multiplying the previous result by multiplier. The three product outputs should be separated by a whitespace character, ending with a newline.

If the input is:
2
5

the output when starting_num = 2 is:
10 50 250

*/
import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      // Collect two integer inputs
      int starting_num = scnr.nextInt();
      int multiplier = scnr.nextInt();

      // Calculate and output results
      int result1 = starting_num * multiplier;
      int result2 = result1 * multiplier;
      int result3 = result2 * multiplier;

      // Print the results separated by whitespace and end with a newline
      System.out.println(result1 + " " + result2 + " " + result3);
   }
}