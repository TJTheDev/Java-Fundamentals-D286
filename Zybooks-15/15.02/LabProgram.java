import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String input = scnr.nextLine();
      boolean isAllDigits = true;

      for (int i = 0; i < input.length(); i++) {
         if (!Character.isDigit(input.charAt(i))) {
            isAllDigits = false;
            break;
         }
      }

      if (isAllDigits) {
         System.out.println("Yes");
      } else {
         System.out.println("No");
      }
   }
}
