import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String userText;
      int count = 0;

      userText = scnr.nextLine();  // Gets entire line, including spaces. 

      for (int i = 0; i < userText.length(); i++) {
         char ch = userText.charAt(i);
         if (ch != ' ' && ch != '.' && ch != '!' && ch != ',') {
            count++;
         }
      }

      System.out.println(count);
   }
}
