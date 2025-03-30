public class CustomLinkedList {
   
   // TODO: Return number of nodes in list
   public static int getCount(IntNode headObj) {
      /* insert your code here */   
   
   }
   
   public static void main(String[] args) {
      IntNode headObj; 
      IntNode currObj;
      IntNode lastObj;
      int i; 
      int count;
      
      // Create head node
      headObj = new IntNode(-1); 
      lastObj = headObj;
      
      // Add nodes to the list
      for (i = 0; i < 20; ++i) { 
         currObj = new IntNode(i);         
         lastObj.insertAfter(currObj); 
         lastObj = currObj;
      }
      
      count = getCount(headObj);
      System.out.println(count);
   }
}