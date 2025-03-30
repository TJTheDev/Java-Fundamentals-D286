import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int num = scnr.nextInt();

      if (num < 11 || num > 100) {
         System.out.println("Input must be 11-100");
      } else {
         while (true) {
            System.out.print(num + " ");
            int tens = num / 10;
            int ones = num % 10;
            if (tens == ones) {
               break;
            }
            num--;
         }
         System.out.println(); // for ending newline
      }
   }
}

