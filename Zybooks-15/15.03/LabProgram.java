import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String password = scnr.nextLine();
      StringBuilder modified = new StringBuilder();

      for (int i = 0; i < password.length(); i++) {
         char ch = password.charAt(i);
         switch (ch) {
            case 'i':
               modified.append('1');
               break;
            case 'a':
               modified.append('@');
               break;
            case 'm':
               modified.append('M');
               break;
            case 'B':
               modified.append('8');
               break;
            case 's':
               modified.append('$');
               break;
            default:
               modified.append(ch);
         }
      }

      modified.append('!');
      System.out.println(modified.toString());
   }
}
