import java.util.Scanner;
import java.util.Random;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      final int ROCK = 0;
      final int PAPER = 1;
      final int SCISSORS = 2;
      Random rand = new Random();

      // Step 0: Read seed and set it
      int seed = scnr.nextInt();
      rand.setSeed(seed);

      // Step 1: Read names and valid round count
      String player1 = scnr.next();
      String player2 = scnr.next();
      int rounds = scnr.nextInt();

      while (rounds < 1) {
         System.out.println("Rounds must be > 0");
         rounds = scnr.nextInt();
      }

      System.out.println(player1 + " vs " + player2 + " for " + rounds + " rounds");

      int wins1 = 0;
      int wins2 = 0;

      for (int i = 0; i < rounds; i++) {
         int p1Choice = rand.nextInt(3);
         int p2Choice = rand.nextInt(3);

         // Step 2: Continue if tie
         while (p1Choice == p2Choice) {
            System.out.println("Tie");
            p1Choice = rand.nextInt(3);
            p2Choice = rand.nextInt(3);
         }

         // Step 3 & 4: Determine winner and print result
         if ((p1Choice == ROCK && p2Choice == SCISSORS) ||
             (p1Choice == PAPER && p2Choice == ROCK) ||
             (p1Choice == SCISSORS && p2Choice == PAPER)) {
            System.out.println(player1 + " wins with " + toWord(p1Choice));
            wins1++;
         } else {
            System.out.println(player2 + " wins with " + toWord(p2Choice));
            wins2++;
         }
      }

      // Step 4: Print win counts
      System.out.println(player1 + " wins " + wins1 + " and " + player2 + " wins " + wins2);
   }

   public static String toWord(int move) {
      switch (move) {
         case 0: return "rock";
         case 1: return "paper";
         case 2: return "scissors";
         default: return "unknown";
      }
   }
}
