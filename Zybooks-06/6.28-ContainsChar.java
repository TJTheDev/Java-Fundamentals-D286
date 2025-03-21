/*
Write a program that reads an integer, a list of words, and a character. The integer signifies how many words are in the list. The output of the program is every word in the list that contains the character at least once. For coding simplicity, follow each output word by a comma, even the last one. Add a newline to the end of the last output. Assume at least one word in the list will contain the given character. Assume that the list of words will always contain fewer than 20 words.

Ex: If the input is:

4 hello zoo sleep drizzle z
then the output is:

zoo,drizzle,
To achieve the above, first read the list into an array. Keep in mind that the character 'a' is not equal to the character 'A'.
*/

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      int i = 0;
      int x = 0;
      String[] arrayList = new String[scnr.nextInt()];
      
      for (i = 0; i < arrayList.length; i++) {
         arrayList[i] = scnr.next();
      }
      
      char last = scnr.next().charAt(0);
      
      for (i = 0; i < arrayList.length; i++) {
         for (x = 0; x < arrayList[i].length(); x++) {
            
            if (last == (arrayList[i].charAt(x))){
               System.out.print(arrayList[i] + ",");
               break;
            }
         }
      }
      System.out.println();
      
   }
}
