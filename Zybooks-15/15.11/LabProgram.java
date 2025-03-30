import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      double balance = scnr.nextDouble();
      double payment = scnr.nextDouble();
      double interestRate = scnr.nextDouble();
      int months = 0;

      while (balance > 0) {
         balance = balance + (balance * interestRate); // Apply interest
         balance = balance - payment; // Apply payment
         months++;
         
         // If balance is paid off after one payment, don't let it go negative
         if (balance < 0) {
            balance = 0;
         }
      }

      if (months == 1) {
         System.out.println("1 payment");
      } else {
         System.out.println(months + " payments");
      }
   }
}

