/*
The following equation estimates the average calories burned for a person when exercising, which is based on a scientific journal article (source):

Calories = ( (Age x 0.2757) + (Weight x 0.03295) + (Heart Rate x 1.0781) — 75.4991 ) x Time / 8.368

Write a program using inputs age (years), weight (pounds), heart rate (beats per minute), and time (minutes), respectively. Output the average calories burned for a person.

Output each floating-point value with two digits after the decimal point, which can be achieved as follows:
System.out.printf("%.2f", yourValue);

Ex: If the input is:

49 155 148 60
the output is:

Calories: 736.21 calories
*/
import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scanner = new Scanner (System.in);
      // var input = scanner.nextLine();
      // for (int x = input.length(); x > 0; x--) {
      //    if (x
      //    }
     int age = scanner.nextInt();
     double weight = scanner.nextDouble();
     int heartRate = scanner.nextInt();
     int time = scanner.nextInt();
      double calories = ( (age * 0.2757) + (weight * 0.03295) + (heartRate * 1.0781) - 75.4991 ) * time / 8.368;
      System.out.print("Calories: ");
      System.out.printf("%.2f", calories);
      System.out.println(" calories");
      
      scanner.close();
   }
} 
