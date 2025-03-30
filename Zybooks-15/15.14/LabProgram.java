import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int height = scnr.nextInt();

      for (int row = height; row >= 1; row--) {
         for (int star = 1; star <= row; star++) {
            System.out.print("* ");
         }
         System.out.println();
      }
   }
}
