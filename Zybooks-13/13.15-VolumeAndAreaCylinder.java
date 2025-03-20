/*
The volume and area of a cylinder are calculated as:

Volume = πr2h
Area = 2πrh + 2πr2
Given the radius and height of a cylinder as floating-point (double) numbers, output the volume and area of the cylinder.

Hint: Use Math.pow() and Math.PI in your calculations.

Output each floating-point value with one digit after the decimal point, which can be achieved as follows:
System.out.printf("Volume: %.1f mg\n", yourValue);

Ex: If the input is:

5.2 8.1
where 5.2 is the radius of the cylinder and 8.1 is the height of the cylinder, then the output is:

Volume: 688.1 cubic inches
Surface area: 434.5 square inches
*/

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      
      Scanner scnr = new Scanner(System.in);
      
      double radius = scnr.nextDouble();
      double height = scnr.nextDouble();
      
      double volume = (Math.PI) * Math.pow(radius, 2) * height;
      double area = 2 * (Math.PI) * radius * height + 2 * (Math.PI) * Math.pow(radius, 2);
      
     System.out.printf("Volume: %.1f cubic inches\n", volume);
     System.out.printf("Surface area: %.1f square inches\n", area);
      
   }
}