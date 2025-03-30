public class CustomLinkedList {
   
   public static boolean isSorted(IntNode headObj) {
      IntNode curr = headObj.getNext(); // Start with the first real node
   
      while (curr != null && curr.getNext() != null) {
         if (curr.getNodeData() > curr.getNext().getNodeData()) {
            return false;
         }
         curr = curr.getNext();
      }
   
      return true; // No issues found, list is sorted
   }

   
   public static void main(String[] args) {
      IntNode headObj; 
      IntNode currObj;
      IntNode lastObj;
      int i; 
      boolean result;
      
      // Create head node
      headObj = new IntNode(-1); 
      lastObj = headObj;
      
      // Add nodes to the list
      for (i = 0; i < 20; ++i) { 
         currObj = new IntNode(i);         
         lastObj.insertAfter(currObj); 
         lastObj = currObj;
      }
      
      result = isSorted(headObj);
      System.out.println(result);
   }
}