import java.util.Scanner;
import java.util.ArrayList;

public class CustomerInfo {
 
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      String name, item;
      double price, total = 0;
      int quantity;
      
      Grocery  grocery = null;
      Customer customer1 = new Customer();
      name = scnr.next();
      
      String sentinel = "y";
      
      do{   
         
         item = scnr.next();
         price = scnr.nextDouble();
         quantity = scnr.nextInt();
         
         grocery = new Grocery(item, price, quantity);          
         customer1.addGrocery(grocery);
         
         sentinel = scnr.next();         
         
      }while(sentinel.equals("y"));     
      
      System.out.println(name + " has the following items:\n");
      
      for(Grocery g : customer1.getGroceryList()){
         System.out.println("Item: " + g.getItem());
         System.out.println("Price: " + g.getPrice());
         System.out.println("Quantity: " + g.getQuantity() + "\n");   
         total += g.getPrice();
      }
      
      System.out.println("Total: " + total);
   }
}
