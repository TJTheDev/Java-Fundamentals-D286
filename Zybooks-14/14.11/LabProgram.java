import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      double a = scnr.nextDouble();
      double b = scnr.nextDouble();
      double epsilon = scnr.nextDouble();

      double diff = Math.abs(a - b);

      if (diff < 0.001) {
         System.out.println("equal");
      }
      else if (diff < epsilon) {
         System.out.println("close enough");
      }
      else {
         System.out.println("not close");
      }
   }
}
