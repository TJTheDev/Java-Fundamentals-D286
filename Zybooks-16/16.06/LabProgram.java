import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int[] counts = new int[21];  // Index 1-20 will be used (ignore index 0)
      int num;

      // Read inputs until -1
      num = scnr.nextInt();
      while (num != -1) {
         counts[num]++;
         num = scnr.nextInt();
      }

      // Find the mode (the value with the highest count)
      int mode = 1;
      int maxCount = counts[1];

      for (int i = 2; i <= 20; i++) {
         if (counts[i] > maxCount) {
            maxCount = counts[i];
            mode = i;
         }
      }

      System.out.println(mode);
   }
}
