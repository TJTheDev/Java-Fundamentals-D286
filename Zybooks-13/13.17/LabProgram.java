import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      // Step 1 - Read inputs
      double wallHeight = scnr.nextDouble();
      double wallWidth = scnr.nextDouble();
      double paintCostPerCan = scnr.nextDouble();

      // Calculate wall area
      double area = wallHeight * wallWidth;
      System.out.printf("Wall area: %.1f sq ft\n", area);

      // Step 2 - Paint needed
      double paintNeeded = area / 350.0;
      System.out.printf("Paint needed: %.3f gallons\n", paintNeeded);

      // Step 3 - Cans needed
      int cansNeeded = (int) Math.ceil(paintNeeded);
      System.out.printf("Cans needed: %d can(s)\n", cansNeeded);

      // Step 4 - Paint cost, tax, total
      double paintCost = cansNeeded * paintCostPerCan;
      double salesTax = paintCost * 0.07;
      double totalCost = paintCost + salesTax;

      System.out.printf("Paint cost: $%.2f\n", paintCost);
      System.out.printf("Sales tax: $%.2f\n", salesTax);
      System.out.printf("Total cost: $%.2f\n", totalCost);
   }
}
