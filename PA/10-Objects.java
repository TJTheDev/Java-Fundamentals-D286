/*
An existing class Customer() has been provided in Customer.java. Write a program in main() of CustomerAge.java to accept one string input and one integer input for a customer's name and age fields, respectively. Use the existing customer1 and customer2 reference variables provided in the template to set the name and age of both customer objects using the setName() and setAge() methods. Determine which customer is older using its getAge() method.

Output the older customer's information using its printInfo() method, ending with a newline. Ensure your program output matches the example formatting below and works for a variety of input values.

If the input is:
Jane
25
John
29

the output is:
Customer that is older:
Name: John
Age: 29
*/
import java.util.Scanner;

public class CustomerAge {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      // Create customer objects
      Customer customer1 = new Customer();
      Customer customer2 = new Customer();
      
      // Declare variables for name and age
      String name;
      int age;
      
      // Input and set data for customer 1
      name = scnr.next(); // Read name for customer 1
      age = scnr.nextInt(); // Read age for customer 1
      customer1.setName(name);
      customer1.setAge(age);
      
      // Input and set data for customer 2
      name = scnr.next(); // Read name for customer 2
      age = scnr.nextInt(); // Read age for customer 2
      customer2.setName(name);
      customer2.setAge(age);
      
      // Output the older customer
      System.out.println("Customer that is older:");
      if (customer1.getAge() > customer2.getAge()) {
         customer1.printInfo();
      } else {
         customer2.printInfo();
      }
   }
}
