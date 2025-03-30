import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      int num = scnr.nextInt();

      if (num >= 0 && num <= 9) {
         System.out.println("1 digit");
      }
      else if (num <= 99) {
         System.out.println("2 digits");
      }
      else if (num <= 999) {
         System.out.println("3 digits");
      }
      else if (num <= 9999) {
         System.out.println("4 digits");
      }
   }
}
