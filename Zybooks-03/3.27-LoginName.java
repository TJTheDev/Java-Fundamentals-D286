/*
Write a program that creates a login name for a user, given the user's first name, last name, and a four-digit integer as input. Output the login name, which is made up of the first six letters of the first name, followed by the first letter of the last name, an underscore (_), and then the last digit of the number (use the % operator). If the first name has less than six letters, then use all letters of the first name.

Ex: If the input is:

Michael Jordan 1991
the output is:

Your login name: MichaeJ_1
Ex: If the input is:

Nicole Smith 2024
the output is:

Your login name: NicoleS_4
*/
import java.util.Scanner;

public class LabProgram {

   public static void main(String[] args) {

      Scanner scnr = new Scanner(System.in);
      
      String firstName = scnr.next();
      String secondName = scnr.next();
      int number = scnr.nextInt();
      
      System.out.print("Your login name: ");
      
      if (firstName.length() > 6) {
          System.out.print(firstName.substring(0, 6));
      } else {
          System.out.print(firstName);
      }
      
      System.out.println(secondName.charAt(0) + "_" + number % 10);
      
   }
}