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
      
      Customer customer1 = new Customer();
      Customer customer2 = new Customer();
      
      // TODO: Declare name and age variables (string, and int)
      
      // TODO: Read name and age input for customer 1
      
      
      // TODO: Set customer 1 name and age fields using mutator methods (setName() and setAge())      
      customer1.setName(scnr.next());
      customer1.setAge(scnr.nextInt());

      // TODO: Read name and age input for customer 2
      
      // TODO: Set customer 2 name and age fields using mutator methods (setName() and setAge())
      customer2.setName(scnr.next());
      customer2.setAge(scnr.nextInt());

      System.out.println("Customer that is older:");
      if (customer1.getAge() > customer2.getAge()){
         customer1.printInfo();
      } else {
         customer2.printInfo();
      }
      /// TODO: Determine older customer (use getAge())
      //       and output older customer's info (use printInfo())
       
   }
}

public class Customer {
   private String name;
   private int age;
   
   public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
   
   public void printInfo() {
      System.out.println("Name: " + name);
      System.out.println("Age: " + age);      
   }
}