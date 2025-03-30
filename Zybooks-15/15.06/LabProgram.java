import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String input = scnr.nextLine();

      // Remove spaces for palindrome check
      String cleaned = input.replaceAll(" ", "");

      // Reverse the cleaned string
      String reversed = "";
      for (int i = cleaned.length() - 1; i >= 0; i--) {
         reversed += cleaned.charAt(i);
      }

      if (cleaned.equals(reversed)) {
         System.out.println("palindrome: " + input);
      } else {
         System.out.println("not a palindrome: " + input);
      }
   }
}
