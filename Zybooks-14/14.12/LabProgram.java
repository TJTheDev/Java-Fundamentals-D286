import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      String timeOfDay = scnr.next();
      int age = scnr.nextInt();

      if (age < 4) {
         System.out.println("free");
      }
      else if (timeOfDay.equals("day")) {
         System.out.println("$8");
      }
      else if (timeOfDay.equals("night")) {
         if (age <= 16) {
            System.out.println("$12");
         }
         else if (age <= 54) {
            System.out.println("$15");
         }
         else {
            System.out.println("$13");
         }
      }
   }
}
