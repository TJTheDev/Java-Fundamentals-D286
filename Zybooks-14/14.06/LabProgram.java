import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      int num1 = scnr.nextInt();
      int num2 = scnr.nextInt();
      int num3 = scnr.nextInt();

      int max = num1;

      if (num2 > max) {
         max = num2;
      }
      if (num3 > max) {
         max = num3;
      }

      System.out.println(max);
   }
}
