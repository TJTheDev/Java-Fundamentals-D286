import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      int speedLimit = scnr.nextInt();
      int drivingSpeed = scnr.nextInt();
      int difference = drivingSpeed - speedLimit;
      int ticketAmount = 0;

      if (difference <= -10) {
         ticketAmount = 50;
      }
      else if (difference >= 6 && difference <= 20) {
         ticketAmount = 75;
      }
      else if (difference >= 21 && difference <= 40) {
         ticketAmount = 150;
      }
      else if (difference > 40) {
         ticketAmount = 300;
      }

      System.out.println(ticketAmount);
   }
}
