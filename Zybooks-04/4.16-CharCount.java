/*
Write a program whose input is a character and a string, and whose output indicates the number of times the character appears in the string. The output should include the input character and use the plural form, n's, if the number of times the characters appears is not exactly 1.

Ex: If the input is:

n Monday
the output is:

1 n
Ex: If the input is:

z Today is Monday
the output is:

0 z's
Ex: If the input is:

n It's a sunny day
the output is:

2 n's
Case matters.

Ex: If the input is:

n Nobody
the output is:

0 n's
n is different than N.
*/
import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int x = 1;
      int count = 0;
      String hit = scnr.next();
      String phrase = scnr.nextLine();
      scnr.close();
      while (x <= phrase.length()) {
         // System.out.println(phrase.substring(x - 1, x));
         // System.out.println(phrase.substring(x - 1, x).contains(hit));
         if (phrase.substring(x - 1, x).contains(hit)){
            count++;
            }
         x++;
         }
         if (count == 1) {
            System.out.println(count + " " + hit + "");
            } 
            
         else {
            System.out.println(count + " " + hit + "'s");
            }
      // System.out.println(phrase.contains(hit));
      // System.out.println(phrase.length());
      // System.out.println(phrase.substring(0, 1));
   }
}
