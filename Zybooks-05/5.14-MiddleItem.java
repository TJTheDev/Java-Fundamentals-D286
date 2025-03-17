/*
Given a sorted list of integers, output the middle integer. A negative number indicates the end of the input (the negative number is not a part of the sorted list). Assume the number of integers is always odd.

Ex: If the input is:

2 3 4 8 11 -1 
the output is:

Middle item: 4
The maximum number of list values for any test case should not exceed 9. If exceeded, output "Too many numbers".

Hint: First read the data into an array. Then, based on the array's size, find the middle item.
*/
import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int[] userValues = new int[9];  // Set of data specified by the user
      int loop = 0;
      int input = 0;
      boolean outputMSG = false;
      
      while (true) {
         if (scnr.hasNext()){
            input = scnr.nextInt();
            loop++;
            if (loop < 8) {
               userValues[loop] = input;  
            }
            }
         if (loop > 10) {
            System.out.println("Too many numbers");
            break;
            }
         
         if (input < 0) {
            System.out.println("Middle item: " + userValues[loop / 2]);
            break;
            }
         }
   }
}
