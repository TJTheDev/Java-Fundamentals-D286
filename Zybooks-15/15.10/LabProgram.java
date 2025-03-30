import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int n = scnr.nextInt();
      int count = 0;

      while (n != 1) {
         System.out.print(n + "\t");
         count++;

         if (count % 10 == 0) {
            System.out.println();
         }

         if (n % 2 == 0) {
            n = n / 2;
         } else {
            n = 3 * n + 1;
         }
      }

      // Print the final 1
      System.out.println(n);
   }
}
