import java.util.Scanner;
import java.util.ArrayList;

public class PlantArrayListExample {

   // Method to print all items in the myGarden ArrayList
   public static void printArrayList(ArrayList<Plant> myGarden) {
      for (int i = 0; i < myGarden.size(); i++) {
         System.out.println("Plant " + (i + 1) + " Information: ");
         myGarden.get(i).printInfo();
         System.out.println();
      }
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      ArrayList<Plant> myGarden = new ArrayList<>();
      String inputType;

      inputType = scnr.next();

      while (!inputType.equals("-1")) {
         if (inputType.equals("plant")) {
            String plantName = scnr.next();
            String plantCost = scnr.next();

            Plant plant = new Plant();
            plant.setPlantName(plantName);
            plant.setPlantCost(plantCost);

            myGarden.add(plant);
         } else if (inputType.equals("flower")) {
            String flowerName = scnr.next();
            String flowerCost = scnr.next();
            boolean isAnnual = scnr.nextBoolean();
            String color = scnr.next();

            Flower flower = new Flower();
            flower.setPlantName(flowerName);
            flower.setPlantCost(flowerCost);
            flower.setPlantType(isAnnual);
            flower.setColorOfFlowers(color);

            myGarden.add(flower);
         }

         inputType = scnr.next();
      }

      printArrayList(myGarden);
   }
}
