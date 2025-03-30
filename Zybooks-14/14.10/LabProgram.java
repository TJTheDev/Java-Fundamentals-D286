import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      char a = scnr.next().charAt(0);
      char b = scnr.next().charAt(0);
      char c = scnr.next().charAt(0);
      char temp;

      // Simple bubble sort logic for 3 values
      if (a > b) {
         temp = a;
         a = b;
         b = temp;
      }

      if (a > c) {
         temp = a;
         a = c;
         c = temp;
      }

      if (b > c) {
         temp = b;
         b = c;
         c = temp;
      }

      System.out.println(a + " " + b + " " + c);
   }
}
