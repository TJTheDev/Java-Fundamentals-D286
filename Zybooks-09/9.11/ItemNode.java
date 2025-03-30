public class ItemNode {
   private String item;
   private ItemNode nextNodeRef; // Reference to the next node                                        

   public ItemNode() {
      item = "";
      nextNodeRef = null;
   }

   public ItemNode(String itemInit) {
      this.item = itemInit;
      this.nextNodeRef = null;
   }

   public ItemNode(String itemInit, ItemNode nextLoc) {
      this.item = itemInit;
      this.nextNodeRef = nextLoc;
   }

   // Insert node after this node.
   public void insertAfter(ItemNode nodeLoc) {
      ItemNode tmpNext = this.nextNodeRef;
      this.nextNodeRef = nodeLoc;
      nodeLoc.nextNodeRef = tmpNext;
   }

   // Match the ShoppingList.java call
   public void insertAtEnd(ItemNode headNode, ItemNode newNode) {
      ItemNode curr = headNode;
      while (curr.nextNodeRef != null) {
         curr = curr.nextNodeRef;
      }
      curr.nextNodeRef = newNode;
   }

   public ItemNode getNext() {
      return this.nextNodeRef;
   }

   public void printNodeData() {
      System.out.println(this.item);
   }
}
