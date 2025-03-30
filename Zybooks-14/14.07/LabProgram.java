import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      int a = scnr.nextInt();
      int b = scnr.nextInt();
      int c = scnr.nextInt();

      int median;

      if ((a >= b && a <= c) || (a <= b && a >= c)) {
         median = a;
      } else if ((b >= a && b <= c) || (b <= a && b >= c)) {
         median = b;
      } else {
         median = c;
      }

      System.out.println(median);
   }
}
