import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      double totalSales = 0.0;

      // Repeat for 3 orders
      for (int i = 1; i <= 3; i++) {
         double pricePerSqFt = scnr.nextDouble();
         int width = scnr.nextInt();
         int length = scnr.nextInt();

         int area = width * length;
         double carpetCost = pricePerSqFt * area * 1.2; // 20% extra
         double laborCost = area * 0.75;
         double tax = (carpetCost + laborCost) * 0.07;
         double orderTotal = carpetCost + laborCost + tax;

         totalSales += orderTotal;

         System.out.printf("Order #%d\n", i);
         System.out.printf("Room: %d sq ft\n", area);
         System.out.printf("Carpet: $%.2f\n", carpetCost);
         System.out.printf("Labor: $%.2f\n", laborCost);
         System.out.printf("Tax: $%.2f\n", tax);
         System.out.printf("Cost: $%.2f\n", orderTotal);

         if (i < 3) {
            System.out.println(); // blank line between orders
         }
      }

      System.out.printf("\nTotal Sales: $%.2f\n", totalSales);
   }
}
