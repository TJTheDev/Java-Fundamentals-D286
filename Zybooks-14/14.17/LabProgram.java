import java.util.Scanner;

public class LabProgram {
   public static void main(String args[]) {
      Scanner scnr = new Scanner(System.in);
      String phoneNumber;
      
      phoneNumber = scnr.nextLine();
      
      String areaCode = phoneNumber.substring(0, 3);
      String prefix = phoneNumber.substring(3, 6);
      String lineNumber = phoneNumber.substring(6, 10);
      
      System.out.print("(" + areaCode + ") " + prefix + "-" + lineNumber);
   }
}
