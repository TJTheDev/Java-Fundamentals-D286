/*
Write a program that creates an array to hold three values of type double. The program should collect the three double values as input and store them in the array. Then calculate the average value of the array.

Output the array values and calculated average value, ending with a newline. Ensure your program output matches the example formatting below and works for a variety of input values.

If the input is:
10.0
10.5
11.0

the output is:
Array items: 10.0, 10.5, 11.0
Average: 10.5
*/
import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      // Create an array to hold three double values
      double[] values = new double[3];

      // Collect the three double values
      for (int i = 0; i < 3; i++) {
         values[i] = scnr.nextDouble();
      }

      // Calculate the average of the array values
      double sum = 0;
      for (double value : values) {
         sum += value;
      }
      double average = sum / values.length;

      // Output the array values and the average
      System.out.print("Array items: ");
      for (int i = 0; i < values.length; i++) {
         System.out.print(values[i]);
         if (i < values.length - 1) {
            System.out.print(", ");
         }
      }
      System.out.println();
      System.out.println("Average: " + average);
   }
}
