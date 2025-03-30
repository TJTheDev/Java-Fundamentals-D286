import java.util.Scanner;

public class DebtMeasure {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      Debt debt1 = new Debt();
            
      double totalDebt = scnr.nextDouble();
      double totalAssets = scnr.nextDouble();      
            
      debt1.setDR(totalDebt, totalAssets);      
    
      System.out.printf("The Company's total debt is in the amount of $%,.2f, and total assets are in the amount of $%,.2f, which gives a debt ratio of %.2f.\n", totalDebt, totalAssets, debt1.getDR());      
   }
}