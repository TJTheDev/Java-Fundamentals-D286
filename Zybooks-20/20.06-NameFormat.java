/*
Write a program that collects a full name as one string input.

Format and output the name as shown below:

lastInitial., firstName middleInitial.

If no middle name was provided, format and output the name as shown below:

lastInitial., firstName

If the input is:

Pat Silly Doe
the output is:

D., Pat S.
Alternatively, if the input is:

Julia Clark
the output is:

C., Julia
*/

import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      String first = scnr.next();
      String second = scnr.next();
      String third = "";
      boolean threeNames = false;
      
      if (scnr.hasNext()) {
         third = scnr.next();
         threeNames = true;
         }
         
      if (threeNames) {
         System.out.println(third.charAt(0) + "., " + first + " " + second.charAt(0) + ".");
      } else {
         System.out.println(second.charAt(0) + "., " + first);
      }
      
   }
}