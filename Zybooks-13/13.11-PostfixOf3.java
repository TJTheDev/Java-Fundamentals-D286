/*
The postfix of 3 is the last 3 characters of a String. Given a String input, output the last three characters of that string. Assume the String will always have at least three characters.

Hint: Use the String method substring().

Ex: If the input is:

chicken
the output is:

Postfix: ken
*/

import java.util.Scanner;
import java.util.*;

public class LabProgram {
   public static void main(String[] args) {

      Scanner scnr = new Scanner(System.in);
      
      String input = scnr.next();
      
      System.out.print("Postfix: ");
      System.out.print(input.charAt(input.length() - 3));
      System.out.print(input.charAt(input.length() - 2));
      System.out.println(input.charAt(input.length() - 1));
   }
}