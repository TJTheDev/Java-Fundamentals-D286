import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      int red = scnr.nextInt();
      int green = scnr.nextInt();
      int blue = scnr.nextInt();
      
      int min = Math.min(red, Math.min(green, blue));
      
      red = red - min;
      green = green - min;
      blue = blue - min;
      
      System.out.println(red + " " + green + " " + blue);
   }
}
