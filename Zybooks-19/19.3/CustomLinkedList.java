public class CustomLinkedList {
   
   // TODO: Return true if list items are in ascending order
   public static boolean isSorted(IntNode headObj) {
      /* Type your code here */   
      
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