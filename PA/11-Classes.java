/*
Debt ratio is a ratio of total debt to total assets, calculated using the formula:
Total Debt / Total Assets

The DebtMeasure.java file contains existing code that collects input for totalDebt and totalAssets, then passes the inputs into the Debt object's setDR() method. The code then returns the debtRatio using the Debt object's getDR() method.

Write code in the Debt class of Debt.java that has the following field and methods:

debtRatio: private field of type double

calculateDR: a private helper method with two parameter variables of type double for totalDebt and totalAssets

The calculateDR method should calculate the debt ratio and assign the results to the debtRatio field.
Use the method signature private void calculateDR(double totalDebt, double totalAssets).
getDR: public accessor method that returns the debtRatio field value

setDR: public mutator method that passes the inputs, totalDebt and totalAssets, to the Debt class

Ensure your program output matches the example formatting below and works for a variety of input values.

If the input is:
250000
300000

the output when 250000 is the total debt and 300000 is the total assets is:
The Company's total debt is in the amount of $250,000.00, and total assets are in the amount of $300,000.00, which gives a debt ratio of 0.83.
Note: Use the printf() function for the print statement in this activity.
*/
public class Debt {
   // Private field to store the debt ratio
   private double debtRatio;

   // Private helper method to calculate and assign the debt ratio
   private void calculateDR(double totalDebt, double totalAssets) {
      if (totalAssets != 0) { // Avoid division by zero
         debtRatio = totalDebt / totalAssets;
      } else {
         debtRatio = 0; // Set to 0 if totalAssets is 0
      }
   }

   // Public accessor method to get the debt ratio
   public double getDR() {
      return debtRatio;
   }

   // Public mutator method to set the debt ratio
   public void setDR(double totalDebt, double totalAssets) {
      calculateDR(totalDebt, totalAssets);
   }
}
