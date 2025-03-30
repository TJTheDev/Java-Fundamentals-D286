import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      int num1 = scnr.nextInt();
      int num2 = scnr.nextInt();

      if (num1 >= num2) {
         System.out.println(num1);
      } else {
         System.out.println(num2);
      }
   }
}
