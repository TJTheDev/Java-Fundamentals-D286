import java.util.Scanner;

public class DuckInfo {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);   
      
      // Variables for Scanner object input
      String type, name;
      
      // Input Mallard Duck type and name
      type = scnr.next();
      name = scnr.next();
      
      
      System.out.println("Duck Information:"); 
      
      // Create MallardDuck object
      MallardDuck md = new MallardDuck();
      
      // Call MallardDuck setters and pass type and name variables as arguments
      md.setType(type);
      md.setName(name);
      
      //Call MallardDuck getters and display output e.g. tab(name getter) the (type getter) duck (behavior getter)! 
      System.out.println(md.getName() + " the " + md.getType() + " duck " + md.getBehavior() + "!");
      
      // Input RubberDuck type and name
      type = scnr.next();
      name = scnr.next();
      
      // Create RubberDuck object
      RubberDuck rd = new RubberDuck();
      
      // Call RubberDuck setters
      rd.setType(type);
      rd.setName(name);
      
      //Call RubberDuck getters and display output e.g. tab(name getter) the (type getter) duck (behavior getter)! 
      System.out.println(rd.getName() + " the " + rd.getType() + " duck " + rd.getBehavior() + "!");

    }
}