import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int[] numbers = new int[20];
      int count = 0;
      int input;

      // Read integers until a negative value is found
      while (true) {
         input = scnr.nextInt();
         if (input < 0) {
            break;
         }
         numbers[count] = input;
         count++;
      }

      int N = -input; // Convert negative input to positive for N

      if (count >= N) {
         System.out.println(numbers[count - N]);
      } else {
         System.out.println(-N);
      }
   }
}
