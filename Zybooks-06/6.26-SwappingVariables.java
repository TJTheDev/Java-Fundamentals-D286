/*
Define a method named swapValues that takes an array of four integers as a parameter, swaps array elements at indices 0 and 1, and swaps array elements at indices 2 and 3. Then write a main program that reads four integers from input and stores the integers in an array in positions 0 to 3. The main program should call function swapValues() to swap array's values and print the swapped values on a single line separated with spaces.

Ex: If the input is:

3 8 2 4
function swapValues() returns and the main program outputs:

8 3 4 2
The program must define and call a method:
public static void swapValues(int[] values)
*/

import java.util.Scanner;

public class LabProgram {
   
   public static void swapValues(int[] values){
      
      int temp = 0;
      
      for (int i = 0; i < 2; i++) {
              if (i == 0) {temp = values[1]; values[1] = values[0]; values[0] = temp;}
         else if (i == 1) {temp = values[2]; values[2] = values[3]; values[3] = temp;}
         
         // else if (i == 1) {values[0] = temp;}
         // else if (i == 2) {values[3] + " ");}
         // else if (i == 3) {System.out.println(values[2]);}
      }
      
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      int[] values = new int[4];
      
      for (int i = 0; i < 4; i++) {
         values[i] = scnr.nextInt();
      }
      
      swapValues(values);
      
      
      System.out.print(values[0] + " ");
      System.out.print(values[1] + " ");
      System.out.print(values[2] + " ");
      System.out.println(values[3]);

   }
}