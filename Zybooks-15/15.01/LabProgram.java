import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String word;
      int number;

      while (true) {
         word = scnr.next();
         number = scnr.nextInt();

         if (word.equals("quit")) {
            break;
         }

         System.out.println("Eating " + number + " " + word + " a day keeps you happy and healthy.");
      }
   }
}
