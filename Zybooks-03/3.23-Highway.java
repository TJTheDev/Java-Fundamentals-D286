/*
Primary U.S. interstate highways are numbered 1-99. Odd numbers (like the 5 or 95) go north/south, and evens (like the 10 or 90) go east/west. Auxiliary highways are numbered 100-999, and service the primary highway indicated by the rightmost two digits. Thus, I-405 services I-5, and I-290 services I-90. Note: 200 is not a valid auxiliary highway because 00 is not a valid primary highway number.

Given a highway number, indicate whether it is a primary or auxiliary highway. If auxiliary, indicate what primary highway it serves. Also indicate if the (primary) highway runs north/south or east/west.

Ex: If the input is:

90
the output is:

I-90 is primary, going east/west.
Ex: If the input is:

290
the output is:

I-290 is auxiliary, serving I-90, going east/west.
Ex: If the input is:

0
or any number not between 1 and 999, the output is:

0 is not a valid interstate highway number. 
Ex: If the input is:

200
the output is:

200 is not a valid interstate highway number. 
*/
import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in); 
      int highwayNumber;

      highwayNumber = scnr.nextInt();
      
      int primaryNumber = (highwayNumber % 100);
      
      String direction = (primaryNumber % 2 == 0) ? "east/west." : "north/south.";
      
      if (highwayNumber < 1 || highwayNumber > 999 || primaryNumber < 1) {
         System.out.println(highwayNumber + " is not a valid interstate highway number.");
      } else if (highwayNumber <= 99) {
         System.out.println("I-" + highwayNumber + " is primary, going " + direction);
      } else {
         System.out.println("I-" + highwayNumber + " is auxiliary, serving I-" + primaryNumber + ", going " + direction);
      }
      
   }
}

