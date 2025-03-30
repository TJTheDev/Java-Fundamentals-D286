import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      String str1 = scnr.next();
      String str2 = scnr.next();

      if (str1.length() > str2.length()) {
         System.out.println(str1);
      } else {
         System.out.println(str2);
      }
   }
}

