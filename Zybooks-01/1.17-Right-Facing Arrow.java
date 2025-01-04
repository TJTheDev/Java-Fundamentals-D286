/*
Given two input integers for an arrowhead and arrow body, print a right-facing arrow.

Ex: If the input is:

0 1
the output is:

     1
     11
00000111
000001111
00000111
     11
     1
*/
import java.util.Scanner;

public class LabProgram {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // Read the characters for the arrow body and arrowhead
        int baseChar = scnr.nextInt(); // Arrow body
        int headChar = scnr.nextInt(); // Arrowhead
        
        // Print the arrowhead
        System.out.println("     " + headChar);
        System.out.println("     " + ("" + headChar).repeat(2)); // HeadChar repeated 2 times

        // Print the arrow body
        System.out.println(("" + baseChar).repeat(5) + ("" + headChar).repeat(3)); // Base 5, Head 3
        System.out.println(("" + baseChar).repeat(5) + ("" + headChar).repeat(4)); // Base 5, Head 4
        System.out.println(("" + baseChar).repeat(5) + ("" + headChar).repeat(3)); // Base 5, Head 3

        // Print the bottom of the arrowhead
        System.out.println("     " + ("" + headChar).repeat(2)); // HeadChar repeated 2 times
        System.out.println("     " + headChar);
        
        // Old way
        //  System.out.println("     " + headChar);
        //  System.out.println("     " + headChar + headChar);
        //  System.out.println("" + baseChar + baseChar + baseChar + baseChar + baseChar + headChar + headChar + headChar); 
        //  System.out.println("" + baseChar + baseChar + baseChar + baseChar + baseChar + headChar + headChar + headChar + headChar); 
        //  System.out.println("" + baseChar + baseChar + baseChar + baseChar + baseChar + headChar + headChar + headChar); 
        //  System.out.println("     " + headChar + headChar);
        //  System.out.println("     " + headChar);
    }
}