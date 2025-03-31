import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int[] values = new int[20];

      int numValues = scnr.nextInt();

      // Read input values into array
      for (int i = 0; i < numValues; i++) {
         values[i] = scnr.nextInt();
      }

      // Check if the array is a palindrome
      boolean isPalindrome = true;
      for (int i = 0; i < numValues / 2; i++) {
         if (values[i] != values[numValues - 1 - i]) {
            isPalindrome = false;
            break;
         }
      }

      if (isPalindrome) {
         System.out.println("yes");
      } else {
         System.out.println("no");
      }
   }
}
