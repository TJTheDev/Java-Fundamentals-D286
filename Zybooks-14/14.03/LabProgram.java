import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int strokes = scnr.nextInt();
      int par = scnr.nextInt();

      String scoreName = "";

      if (par == 3 || par == 4 || par == 5) {
         if (strokes == par - 2) {
            scoreName = "Eagle";
         }
         else if (strokes == par - 1) {
            scoreName = "Birdie";
         }
         else if (strokes == par) {
            scoreName = "Par";
         }
         else if (strokes == par + 1) {
            scoreName = "Bogey";
         }
         else {
            scoreName = "Error";
         }
      } else {
         scoreName = "Error";
      }

      System.out.println("Par " + par + " in " + strokes + " strokes is " + scoreName);
   }
}
