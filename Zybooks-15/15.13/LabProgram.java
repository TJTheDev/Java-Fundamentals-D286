import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int height = scnr.nextInt();

      for (int row = 1; row <= height; row++) {
         // Print spaces
         for (int space = 1; space <= height - row; space++) {
            System.out.print("  ");
         }

         // Print asterisks with a space
         for (int star = 1; star <= row; star++) {
            System.out.print("* ");
         }

         System.out.println(); // Newline after each row
      }
   }
}
