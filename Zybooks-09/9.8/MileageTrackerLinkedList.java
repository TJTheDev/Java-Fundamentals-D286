import java.util.Scanner;

public class MileageTrackerLinkedList {
   public static void main (String[] args) {
      Scanner scnr = new Scanner(System.in);

      // References for MileageTrackerNode objects
      MileageTrackerNode headNode;                                           
      MileageTrackerNode currNode;
      MileageTrackerNode lastNode;

      double miles;
      String date;
      int i;

      // Front of nodes list                                                                         
      headNode = new MileageTrackerNode(); // dummy head
      lastNode = headNode;

      // Step 1: Read number of nodes
      int numNodes = scnr.nextInt();
      scnr.nextLine(); // consume newline

      // read data for each node and insert it
      for (i = 0; i < numNodes; i++) {
         miles = Double.parseDouble(scnr.nextLine());
         date = scnr.nextLine();
         
         currNode = new MileageTrackerNode(miles, date);
         lastNode.insertAfter(currNode);
         lastNode = currNode;
      }

      // int the list starting from the first actual node
      currNode = headNode.getNext();
      while (currNode != null) {
         currNode.printNodeData();
         currNode = currNode.getNext();
      }
   }
}
