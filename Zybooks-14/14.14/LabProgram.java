import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      String phrase1 = scnr.nextLine();
      String phrase2 = scnr.nextLine();

      if (phrase1.equals(phrase2)) {
         System.out.println("Both phrases match");
      }
      else if (phrase2.indexOf(phrase1) != -1) {
         System.out.println(phrase1 + " is found within " + phrase2);
      }
      else if (phrase1.indexOf(phrase2) != -1) {
         System.out.println(phrase2 + " is found within " + phrase1);
      }
      else {
         System.out.println("No matches");
      }
   }
}
