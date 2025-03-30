import java.util.Scanner;

public class ContactList {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      // Input 3 contacts
      String name1 = scnr.nextLine();
      String phone1 = scnr.nextLine();

      String name2 = scnr.nextLine();
      String phone2 = scnr.nextLine();

      String name3 = scnr.nextLine();
      String phone3 = scnr.nextLine();

      // Create 3 nodes
      ContactNode person1 = new ContactNode(name1, phone1);
      ContactNode person2 = new ContactNode(name2, phone2);
      ContactNode person3 = new ContactNode(name3, phone3);

      // Link the list
      person1.insertAfter(person2);
      person2.insertAfter(person3);

      // Print persons inline
      System.out.println("Person 1: " + person1.getName() + ", " + person1.getPhoneNumber());
      System.out.println("Person 2: " + person2.getName() + ", " + person2.getPhoneNumber());
      System.out.println("Person 3: " + person3.getName() + ", " + person3.getPhoneNumber());
      System.out.println();

      // Print full contact list
      System.out.println("CONTACT LIST");
      ContactNode current = person1;
      while (current != null) {
         current.printContactNode();
         System.out.println();
         current = current.getNext();
      }
   }
}
