/*
Using Heron's formula, you can calculate the area of a triangle if you know the lengths of all three sides. Given the length of each side of a triangle as input, calculate the area of the triangle using Heron's formula as follows:

s = half of the triangle's perimeter
area = the square root of s(s-a)(s-b)(s-c), where a, b, and c are each sides of the triangle.
Use the Math.sqrt() method for calculating the square root.

Output the floating-point value of the area with three digits after the decimal point, which can be achieved as follows:
System.out.printf("The area of the triangle is %.3f\n", yourValue);

Ex: If the input for a, b, and c is:

3.0 4.0 5.0
the output is:

The area of the triangle is: 6.000
*/

import java.util.Scanner;

public class LabProgram {

   public static void main(String[] args) {
      
      Scanner scnr = new Scanner(System.in);
      
      double a = scnr.nextDouble();
      double b = scnr.nextDouble();
      double c = scnr.nextDouble();
      double s = (a + b + c) / 2;
      double output = Math.sqrt(s * (s - a) * (s - b) * (s - c));
      
      System.out.printf("The area of the triangle is: %.3f\n", output);

   }
}