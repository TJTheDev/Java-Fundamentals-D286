import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      // Read coefficients for both equations
      int a = scnr.nextInt();
      int b = scnr.nextInt();
      int c = scnr.nextInt();

      int d = scnr.nextInt();
      int e = scnr.nextInt();
      int f = scnr.nextInt();

      boolean found = false;

      for (int x = -10; x <= 10; x++) {
         for (int y = -10; y <= 10; y++) {
            if ((a * x + b * y == c) && (d * x + e * y == f)) {
               System.out.println("x = " + x + ", y = " + y);
               found = true;
               break;
            }
         }
         if (found) {
            break;
         }
      }

      if (!found) {
         System.out.println("There is no solution");
      }
   }
}
