/*
People find it easier to read time in hours, minutes, and seconds rather than just seconds.

Write a program that reads in seconds as input, and outputs the time in hours, minutes, and seconds.

Ex: If the input is:

4000
the output is:

Hours: 1
Minutes: 6
Seconds: 40
*/

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      int hours = 0;
      int minutes = 0;
      int seconds = scnr.nextInt();
      
      while (seconds >= 3600){
         hours++;
         seconds = seconds - 3600;
      }
      
      while (seconds >= 60){
         minutes++;
         seconds = seconds - 60;
      }
      
      System.out.println("Hours: " + hours);
      System.out.println("Minutes: " + minutes);
      System.out.println("Seconds: " + seconds);
      

   }
}
