public class ContactNode {
   private String contactName;
   private String contactPhoneNumber;
   private ContactNode nextNodePtr;

   // Constructor with name and phone number
   public ContactNode(String name, String phoneNumber) {
      this.contactName = name;
      this.contactPhoneNumber = phoneNumber;
      this.nextNodePtr = null;
   }

   // Accessors
   public String getName() {
      return contactName;
   }

   public String getPhoneNumber() {
      return contactPhoneNumber;
   }

   public ContactNode getNext() {
      return nextNodePtr;
   }

   // Insert a node after this one
   public void insertAfter(ContactNode node) {
      ContactNode tempNext = this.nextNodePtr;
      this.nextNodePtr = node;
      node.nextNodePtr = tempNext;
   }

   // Print contact info
   public void printContactNode() {
      System.out.println("Name: " + contactName);
      System.out.println("Phone number: " + contactPhoneNumber);
   }
}
