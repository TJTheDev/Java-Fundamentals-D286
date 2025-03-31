import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      int[] values = new int[20]; // Fewer than 20 integers
      int numValues = scnr.nextInt();

      // Read in the list
      for (int i = 0; i < numValues; i++) {
         values[i] = scnr.nextInt();
      }

      // Read lower and upper bounds
      int lowerBound = scnr.nextInt();
      int upperBound = scnr.nextInt();

      // Output numbers within the bounds
      for (int i = 0; i < numValues; i++) {
         if (values[i] >= lowerBound && values[i] <= upperBound) {
            System.out.print(values[i] + ",");
         }
      }

      System.out.println(); // End with a newline
   }
}
