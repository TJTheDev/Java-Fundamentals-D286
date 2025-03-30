import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      int num = scnr.nextInt();
      int max = num;

      while (num >= 0) {
         if (num > max) {
            max = num;
         }
         num = scnr.nextInt();
      }

      System.out.println(max);
   }
}
