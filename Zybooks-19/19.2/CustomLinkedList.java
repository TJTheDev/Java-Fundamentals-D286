public class CustomLinkedList {
   
   // TODO: Return index of target item
   public static int indexOf(IntNode headObj, int target) {
      /* insert your code here */   
      
   }
   
   public static void main(String[] args) {
      IntNode headObj; 
      IntNode currObj;
      IntNode lastObj;
      int i; 
      int index;
      
      // Create head node
      headObj = new IntNode(-1); 
      lastObj = headObj;
      
      // Add nodes to the list
      for (i = 0; i < 20; ++i) { 
         currObj = new IntNode(i);         
         lastObj.insertAfter(currObj); 
         lastObj = currObj;
      }    
      
      index = indexOf(headObj, 15);
      System.out.println(index);
   }
}