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

      // Swap first and last values
      int temp = userValues[0];
      userValues[0] = userValues[numValues - 1];
      userValues[numValues - 1] = temp;

      // Output the modified array
      for (int i = 0; i < numValues; i++) {
         System.out.print(userValues[i] + " ");
      }
      System.out.println(); // End with newline
   }
}
