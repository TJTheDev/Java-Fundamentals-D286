import java.util.*;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double weekendTotal = 0.0;

      // Friday
      int peopleFri = scnr.nextInt();
      double slicesPerPersonFri = scnr.nextDouble();
      double costPerPizzaFri = scnr.nextDouble();
      weekendTotal += printParty("Friday Night Party", peopleFri, slicesPerPersonFri, costPerPizzaFri);

      // Saturday
      int peopleSat = scnr.nextInt();
      double slicesPerPersonSat = scnr.nextDouble();
      double costPerPizzaSat = scnr.nextDouble();
      System.out.println(); // Blank line between parties
      weekendTotal += printParty("Saturday Night Party", peopleSat, slicesPerPersonSat, costPerPizzaSat);

      // Sunday
      int peopleSun = scnr.nextInt();
      double slicesPerPersonSun = scnr.nextDouble();
      double costPerPizzaSun = scnr.nextDouble();
      System.out.println(); // Blank line between parties
      weekendTotal += printParty("Sunday Night Party", peopleSun, slicesPerPersonSun, costPerPizzaSun);

      // Add a final blank line before the Weekend Total
      System.out.println();
      System.out.printf("Weekend Total: $%.2f\n", weekendTotal);
   }

   public static double printParty(String partyName, int numPeople, double slicesPerPerson, double costPerPizza) {
      System.out.println(partyName);

      double totalSlices = numPeople * slicesPerPerson;
      int numPizzas = (int) Math.ceil(totalSlices / 8.0);
      double pizzaCost = numPizzas * costPerPizza;
      System.out.printf("%d Pizzas: $%.2f\n", numPizzas, pizzaCost);

      double tax = pizzaCost * 0.07;
      System.out.printf("Tax: $%.2f\n", tax);

      double delivery = (pizzaCost + tax) * 0.20;
      System.out.printf("Delivery: $%.2f\n", delivery);

      double total = pizzaCost + tax + delivery;
      System.out.printf("Total: $%.2f\n", total);

      return total;
   }
}
