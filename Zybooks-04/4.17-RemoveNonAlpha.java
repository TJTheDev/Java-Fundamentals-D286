/*
Write a program that removes all non alpha characters from the given input.

Ex: If the input is:

-Hello, 1 world$!
the output is:

Helloworld
*/

// First Try when I didn't know the syntax for regEx:
// import java.util.Scanner;

// public class LabProgram {
//    public static void main(String[] args) {
//       Scanner scnr = new Scanner(System.in);
//       String input = scnr.nextLine().trim();
//       scnr.close();
//       int x = 1;
//       int numberRemove = 0;
//       String z = "";
      
//       while (numberRemove <=9) {
//          input = input.replaceAll(Integer.toString(numberRemove),"");
//          numberRemove++;
//          }
      
//       input = input.replaceAll(" ","");
      
//       while (x <= input.length()) {
//          z = input.substring(x-1, x);
//          if (
//             z.equalsIgnoreCase("a") || 
//             z.equalsIgnoreCase("b") || 
//             z.equalsIgnoreCase("c") || 
//             z.equalsIgnoreCase("d") || 
//             z.equalsIgnoreCase("e") || 
//             z.equalsIgnoreCase("f") || 
//             z.equalsIgnoreCase("g") || 
//             z.equalsIgnoreCase("h") || 
//             z.equalsIgnoreCase("i") || 
//             z.equalsIgnoreCase("j") || 
//             z.equalsIgnoreCase("k") || 
//             z.equalsIgnoreCase("l") || 
//             z.equalsIgnoreCase("m") || 
//             z.equalsIgnoreCase("n") || 
//             z.equalsIgnoreCase("o") || 
//             z.equalsIgnoreCase("p") || 
//             z.equalsIgnoreCase("q") || 
//             z.equalsIgnoreCase("r") || 
//             z.equalsIgnoreCase("s") || 
//             z.equalsIgnoreCase("t") || 
//             z.equalsIgnoreCase("u") || 
//             z.equalsIgnoreCase("v") || 
//             z.equalsIgnoreCase("w") || 
//             z.equalsIgnoreCase("x") || 
//             z.equalsIgnoreCase("y") || 
//             z.equalsIgnoreCase("z") ) {
//                System.out.print(z);
//          }
//          x++;
//          }
//          System.out.println();
//    }
// }

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String input = scnr.nextLine();
      scnr.close();

      // Use regex to remove all non-alphabetic characters
      input = input.replaceAll("[^a-zA-Z]", "");

      // Print cleaned output
      System.out.println(input);
   }
}