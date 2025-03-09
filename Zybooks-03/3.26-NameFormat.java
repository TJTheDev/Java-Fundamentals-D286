/*
Many documents use a specific format for a person's name. Write a program whose input is:

firstName middleName lastName

and whose output is:

lastName, firstInitial.middleInitial.

Ex: If the input is:

Pat Silly Doe
the output is:

Doe, P.S.
If the input has the form:

firstName lastName

the output is:

lastName, firstInitial.

Ex: If the input is:

Julia Clark
the output is:

Clark, J.
*/
import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String firstName = scnr.next();
      String secondName = scnr.next();
      String thirdName = "";
      boolean failed = false;
      try {
      thirdName = scnr.next();
      } catch (Exception e) {
         failed = true;
      }
      
      if (failed) {
         System.out.print(secondName + ", ");
         System.out.print(firstName.charAt(0) + ".");
         System.out.println("");
      } else {
         System.out.print(thirdName + ", ");
         System.out.print(firstName.charAt(0) + ".");
         System.out.println(secondName.charAt(0) + ".");
      }
   }
}
