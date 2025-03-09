/*
Write a program that takes in a line of text as input, and outputs that line of text in reverse. The program repeats, ending when the user enters "Done", "done", or "d" for the line of text.

Ex: If the input is:

Hello there
Hey
done
the output is:

ereht olleH
yeH
*/
import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      boolean run = true;
      String input = "";
      String stringOut = "";
      Scanner scnr = new Scanner(System.in);
      while (run && scnr.hasNext()) {
         input = scnr.nextLine();
         if (input.equals("d") || input.equalsIgnoreCase("done")) {
            run = false;
            } 
         else {
            int stringRev = 0;
            stringOut = "";
            while (stringRev < input.length()) {
               stringOut = input.charAt(stringRev) + stringOut;
               stringRev ++;
               }
               System.out.println(stringOut);
            }
         } 
   }
}
