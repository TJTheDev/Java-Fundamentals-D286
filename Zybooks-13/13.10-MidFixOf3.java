/*
The midfix of 3 is the middle 3 characters of a string. Given a String input, output the middle three characters of that string. Assume the word length is always odd and at least three characters.

Hint: Use the String method substring().

Ex: If the input is:

xxxtoyxxx
the output is:

Midfix: toy
*/

import java.util.*;

public class LabProgram {
   public static void main(String[] args) {
      
      Scanner scnr = new Scanner(System.in);
      String input = scnr.nextLine();
      int num = (int) Math.floor(input.length() / 2);
     // int num = (int) Math.floor(Math.sqrt(input.length()));
      
      System.out.print("Midfix: ");
      System.out.print(input.charAt(num - 1));
      System.out.print(input.charAt(num));
      System.out.print(input.charAt(num + 1));
     // System.out.println(num);
      
      // for (int x = 0; x < input.length(); x++){
      //    System.out.print(input.charAt(x));
      // }
      System.out.println("");
   }
}