import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      int wages = scnr.nextInt();
      int interest = scnr.nextInt();
      int unemployment = scnr.nextInt();
      int status = scnr.nextInt();
      int withheld = scnr.nextInt();

      int agi = wages + interest + unemployment;
      System.out.printf("AGI: $%,d\n", agi);

      if (agi > 120000) {
         System.out.println("Error: Income too high to use this form");
         return;
      }

      // Step 2: Determine deduction
      if (status != 1 && status != 2) {
         status = 1;
      }

      int deduction = (status == 1) ? 12000 : 24000;
      System.out.printf("Deduction: $%,d\n", deduction);

      int taxableIncome = agi - deduction;
      if (taxableIncome < 0) {
         taxableIncome = 0;
      }
      System.out.printf("Taxable income: $%,d\n", taxableIncome);

      // Step 3: Calculate federal tax
      double tax = 0.0;
      if (status == 1) { // Single
         if (taxableIncome <= 10000) {
            tax = 0.10 * taxableIncome;
         } else if (taxableIncome <= 40000) {
            tax = 1000 + 0.12 * (taxableIncome - 10000);
         } else if (taxableIncome <= 85000) {
            tax = 4600 + 0.22 * (taxableIncome - 40000);
         } else {
            tax = 14500 + 0.24 * (taxableIncome - 85000);
         }
      } else { // Married
         if (taxableIncome <= 20000) {
            tax = 0.10 * taxableIncome;
         } else if (taxableIncome <= 80000) {
            tax = 2000 + 0.12 * (taxableIncome - 20000);
         } else {
            tax = 9200 + 0.22 * (taxableIncome - 80000);
         }
      }

      long roundedTax = Math.round(tax);
      System.out.printf("Federal tax: $%,d\n", roundedTax);

      // Step 4: Compare tax owed with withheld amount
      long taxDue = roundedTax - withheld;

      if (taxDue > 0) {
         System.out.printf("Tax due: $%,d\n", taxDue);
      } else {
         System.out.printf("Tax refund: $%,d\n", Math.abs(taxDue));
      }
   }
}
