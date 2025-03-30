import java.util.ArrayList;

public class Customer {
   private int id;
   private String name;
   
   ArrayList<Grocery> myArray = new ArrayList<Grocery>();
   
   //TODO: Create a Grocery ArrayList
   
   public ArrayList<Grocery> getGroceryList() {
      return myArray;
   }
   
   public void addGrocery(Grocery grocery) {
      myArray.add(grocery);
   }
   //TODO: Define getGroceryList() method that returns Grocery ArrayList  
  
    
   //TODO: Define addGrocery(Grocery grocery) that adds a Grocery object to Grocery ArrayList via the grocery parameter
   
   
   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }
   
   
   
}