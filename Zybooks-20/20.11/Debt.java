public class Debt {
   private double debtRatio;
   
   private void calculateDR(double totalDebt, double totalAssets) {
      debtRatio = totalDebt / totalAssets;
   }
   
   public double getDR() {
      return debtRatio;   
   }
   
   public void setDR(double totalDebt, double totalAssets) {
      calculateDR(totalDebt, totalAssets);
   }
    
 }