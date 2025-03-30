public class CustomLinkedList {
   
   public static int findMax(IntNode headObj) {
      IntNode curr = headObj.getNext();  // Skip dummy head node
      if (curr == null) {
         return -99; // Empty list
      }
   
      int max = curr.getNodeData();
   
      while (curr != null) {
         if (curr.getNodeData() > max) {
            max = curr.getNodeData();
         }
         curr = curr.getNext();
      }
   
      return max;
   }

   
   public static void main(String[] args) {
      IntNode headObj; 
      IntNode currObj;
      IntNode lastObj;
      int i; 
      int max;
      
      // Create head node
      headObj = new IntNode(-1); 
      lastObj = headObj;
      
      // Add nodes to the list
      for (i = 0; i < 20; ++i) { 
         currObj = new IntNode(i);         
         lastObj.insertAfter(currObj); 
         lastObj = currObj;
      }    
      
      max = findMax(headObj);
      System.out.println(max);
   }
}