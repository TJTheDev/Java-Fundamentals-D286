import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int size;

      size = scnr.nextInt();
      int[] listA = new int[size];   // List A
      int[] listB = new int[size];   // List B

      // Read listA values
      for (int i = 0; i < size; i++) {
         listA[i] = scnr.nextInt();
      }

      // Read listB values
      for (int i = 0; i < size; i++) {
         listB[i] = scnr.nextInt();
      }

      // Compute sum of products
      int sum = 0;
      for (int i = 0; i < size; i++) {
         sum += listA[i] * listB[i];
      }

      // Output result
      System.out.println(sum);
   }
}
