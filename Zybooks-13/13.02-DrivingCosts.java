/*
Driving is expensive. Write a program with a car's gas mileage (miles/gallon) and the cost of gas (dollars/gallon) as floating-point input, and output the gas cost for 20 miles, 75 miles, and 500 miles.

Output each floating-point value with two digits after the decimal point, which can be achieved as follows:
System.out.printf("%.2f", yourValue);

The output ends with a newline.

Ex: If the input is:

20.0 3.1599
where the gas mileage is 20.0 miles/gallon and the cost of gas is $3.1599/gallon, the output is:

3.16 11.85 79.00
Note: Real per-mile cost would also include maintenance and depreciation.
*/

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double gasMileage = scnr.nextDouble();
      double gasPrice = scnr.nextDouble();
      
      System.out.printf("%.2f", 20 / gasMileage * gasPrice); System.out.print(" ");
      System.out.printf("%.2f", 75 / gasMileage * gasPrice); System.out.print(" ");
      System.out.printf("%.2f", 500 / gasMileage * gasPrice); System.out.println();
   }
}

