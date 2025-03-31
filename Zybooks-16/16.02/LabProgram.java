import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int[] values = new int[20];

      int numValues = scnr.nextInt(); // Read number of integers

      // Read all values into array
      for (int i = 0; i < numValues; i++) {
         values[i] = scnr.nextInt();
      }

      // Initialize smallest and second smallest
      int smallest, secondSmallest;
      if (values[0] < values[1]) {
         smallest = values[0];
         secondSmallest = values[1];
      } else {
         smallest = values[1];
         secondSmallest = values[0];
      }

      // Loop to find two smallest numbers
      for (int i = 2; i < numValues; i++) {
         if (values[i] < smallest) {
            secondSmallest = smallest;
            smallest = values[i];
         } else if (values[i] < secondSmallest) {
            secondSmallest = values[i];
         }
      }

      System.out.println(smallest + " and " + secondSmallest);
   }
}
