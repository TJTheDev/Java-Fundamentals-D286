import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      String str1 = scnr.next();
      String str2 = scnr.next();
      int matchCount = 0;

      // Loop over the shortest length
      int minLength = Math.min(str1.length(), str2.length());

      for (int i = 0; i < minLength; i++) {
         if (str1.charAt(i) == str2.charAt(i)) {
            matchCount++;
         }
      }

      // Output with correct grammar
      if (matchCount == 1) {
         System.out.println("1 character matches");
      } else {
         System.out.println(matchCount + " characters match");
      }
   }
}
