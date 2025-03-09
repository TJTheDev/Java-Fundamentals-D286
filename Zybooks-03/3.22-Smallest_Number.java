/*
Write a program whose inputs are three integers, and whose output is the smallest of the three values.

Ex: If the input is:

7 15 3
the output is:

3
*/
import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      
      Scanner scnr = new Scanner(System.in);
      
      int int1 = scnr.nextInt();
      int int2 = scnr.nextInt();
      int int3 = scnr.nextInt();
      
      if (int1 <= int2 && int1 <= int3) {
         System.out.println(int1);
      } else if (int2 <= int1 && int2 <= int3) {
         System.out.println(int2);
      } else { 
         System.out.println(int3);
      }
      
   }
}
