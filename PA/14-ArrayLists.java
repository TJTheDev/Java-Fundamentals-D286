/*
Write code in the Customer class of Customer.java to do the following:

Create a Grocery ArrayList.
Define a method named getGroceryList that returns the Grocery ArrayList.
Use the method signature public ArrayList<Grocery> getGroceryList()
Define a method named addGrocery with a Grocery parameter variable.
The addGrocery method should add a Grocery object to the Grocery ArrayList via the parameter.
Use the method signature public void addGrocery(Grocery grocery)
If the input is:

John
Eggs
5.99
12
y
Oatmeal
8.99
1
n
the output when "John" is the name of the customer, "Eggs" are a grocery item, 5.99 is the price, 12 is the quantity, "y" is a value indicating "yes" to enter more items, "Oatmeal" is another grocery item, 8.99 is the price, 1 is the quantity, and "n" is a value indicating "no" to stop entering more items is:

John has the following items:
Item: Eggs
Price: 5.99
Quantity: 12

Item: Oatmeal
Price: 8.99
Quantity: 1

Total: 14.98
*/
import java.util.ArrayList;

public class Customer {
    private int id;
    private String name;

    // Grocery ArrayList to store Grocery objects
    private ArrayList<Grocery> groceryList;

    // Constructor
    public Customer() {
        groceryList = new ArrayList<>();
    }

    // Method to return the Grocery ArrayList
    public ArrayList<Grocery> getGroceryList() {
        return groceryList;
    }

    // Method to add a Grocery object to the Grocery ArrayList
    public void addGrocery(Grocery grocery) {
        groceryList.add(grocery);
    }

    // Getters and setters for id and name
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
