public class InventoryNode {
   private String item; 
   private int numberOfItems;
   private InventoryNode nextNodeRef; // Reference to the next node                                   

   public InventoryNode() {
      item = "";
      numberOfItems = 0;
      nextNodeRef = null;
   }

   public InventoryNode(String itemInit, int numberOfItemsInit) {
      this.item = itemInit;
      this.numberOfItems = numberOfItemsInit;
      this.nextNodeRef = null;
   }

   // Match the required method signature used in Inventory.java
   public void insertAtFront(InventoryNode headNode, InventoryNode newNode) {
      newNode.nextNodeRef = headNode.nextNodeRef;
      headNode.nextNodeRef = newNode;
   }

   public InventoryNode getNext() {
      return this.nextNodeRef;
   }
   
   public void printNodeData() {
      System.out.println(this.numberOfItems + " " + this.item);
   }
}
