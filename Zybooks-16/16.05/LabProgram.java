import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int[] userValues = new int[20];   // List of integers from input
      
      int numValues = scnr.nextInt();

      // Read values into array
      for (int i = 0; i < numValues; i++) {
         userValues[i] = scnr.nextInt();
      }

      // Save the last element
      int last = userValues[numValues - 1];

      // Shift elements to the right
      for (int i = numValues - 1; i > 0; i--) {
         userValues[i] = userValues[i - 1];
      }

      // Put the last element at the first position
      userValues[0] = last;

      // Output the modified array
      for (int i = 0; i < numValues; i++) {
         System.out.print(userValues[i] + " ");
      }
      System.out.println(); // End with newline
   }
}
