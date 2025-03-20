/*
Given two numbers that represent the lengths of a right triangle's legs (sides adjacent to the right angle), output the length of the third side (i.e. hypotenuse) with two digits after the decimal point.

Output each floating-point value with two digits after the decimal point, which can be achieved as follows:
System.out.printf("Hypotenuse: %.2f\n", c);

Ex: If the input is:

3.0 4.0
the output is:

Hypotenuse: 5.00
*/

import java.util.*;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double side1 = scnr.nextDouble();
      double side2 = scnr.nextDouble();
      double hypotenuse = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));

      System.out.printf("Hypotenuse: %.2f\n", hypotenuse);
   }
}
