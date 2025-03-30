import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      int low = scnr.nextInt();
      int high = scnr.nextInt();
      int x = scnr.nextInt();
      int count = 0;

      for (int i = low; i <= high; i++) {
         if (i % x == 0) {
            count++;
         }
      }

      System.out.println(count);
   }
}
