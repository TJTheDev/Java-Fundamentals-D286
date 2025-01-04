/*
While the zyLab platform can be used without training, a bit of training may help some students avoid common issues.

The assignment is to get an integer from input, and output that integer squared, ending with newline. (Note: This assignment is configured to have students programming directly in the zyBook. Instructors may instead require students to upload a file). Below is a program that's been nearly completed for you.

Click "Run program". The output is wrong. Sometimes a program lacking input will produce wrong output (as in this case), or no output. Remember to always pre-enter needed input.
Type 2 in the input box, then click "Run program", and note the output is 4.
Type 3 in the input box instead, run, and note the output is 6.
When students are done developing their program, they can submit the program for automated grading.

Click the "Submit mode" tab
Click "Submit for grading".
The first test case failed (as did all test cases, but focus on the first test case first). The highlighted arrow symbol means an ending newline was expected but is missing from your program's output.
Matching output exactly, even whitespace, is often required. Change the program to output an ending newline.

Click on "Develop mode", and change the output statement to output a newline: System.out.println(userNumSquared);. Type 2 in the input box and run.
Click on "Submit mode", click "Submit for grading", and observe that now the first test case passes and 1 point was earned.
The last two test cases failed, due to a bug, yielding only 1 of 3 possible points. Fix that bug.

Click on "Develop mode", change the program to use * rather than +, and try running with input 2 (output is 4) and 3 (output is now 9, not 6 as before).
Click on "Submit mode" again, and click "Submit for grading". Observe that all test cases are passed, and you've earned 3 of 3 points.
*/
import java.util.Scanner;

public class NumSquared {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int userNum;
      int userNumSquared;
      
      userNum = scnr.nextInt();
      
      userNumSquared = userNum * userNum;   // Fixed Bug
      
      System.out.println(userNumSquared);   // Fixed Output formatting issue
   }z
}