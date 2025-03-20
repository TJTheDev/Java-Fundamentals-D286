/*
The prefix of 3 is the first 3 characters of a String. Given a String input, output the first three characters of that string. Assume the String will always have at least three characters.

Hint: Use the String method substring().

Ex: If the input is:

chicken
the output is:

Prefix: chi
*/

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {

      Scanner scnr = new Scanner(System.in);
      
      String input = scnr.next();
      
      System.out.print("Prefix: ");
      System.out.print(input.charAt(0));
      System.out.print(input.charAt(1));
      System.out.println(input.charAt(2));
      
   }
}