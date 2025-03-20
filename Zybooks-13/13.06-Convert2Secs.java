/*
Write a program that reads in hours, minutes and seconds as input, and outputs the time in seconds only.

Ex: If the input is:

1 6 40
where 1 is the number of hours, 6 is the number of minutes, and 40 is the number of seconds, the output is:

Seconds: 4000
*/

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int hours = scnr.nextInt();
      int minutes = scnr.nextInt();
      int seconds = scnr.nextInt();
      
      System.out.println("Seconds: " + (seconds + (minutes * 60) + (hours * 60 * 60)));
      
   }
}
