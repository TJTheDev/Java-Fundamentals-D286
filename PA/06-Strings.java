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
      
      // Collect full name as input
      String fullName = scnr.nextLine();
      
      // Split the input string into parts
      String[] nameParts = fullName.split(" ");
      
      // Check if there is a middle name
      if (nameParts.length == 3) {
         // If there is a middle name, format as lastInitial., firstName middleInitial.
         String firstName = nameParts[0];
         String middleName = nameParts[1];
         String lastName = nameParts[2];
         char lastInitial = lastName.charAt(0);
         char middleInitial = middleName.charAt(0);
         
         // Corrected line: concatenate the strings with the "+" operator
         System.out.println(lastInitial + "., " + firstName + " " + middleInitial + ".");
      } else if (nameParts.length == 2) {
         // If there is no middle name, format as lastInitial., firstName
         String firstName = nameParts[0];
         String lastName = nameParts[1];
         char lastInitial = lastName.charAt(0);
         
         // Corrected line: concatenate the strings with the "+" operator
         System.out.println(lastInitial + "., " + firstName);
      }
   }
}
