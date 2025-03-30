import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      int a = scnr.nextInt();
      int b = scnr.nextInt();
      int c = scnr.nextInt();
      int d = scnr.nextInt();

      int count = 0;

      if (a % 2 != 0) count++;
      if (b % 2 != 0) count++;
      if (c % 2 != 0) count++;
      if (d % 2 != 0) count++;

      System.out.println(count);
   }
}
