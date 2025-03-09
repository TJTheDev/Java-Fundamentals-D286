/*
Write a program using integers userNum and divNum as input, and output userNum divided by divNum three times. Note: End with a newline.

Ex: If the input is:

2000 2
the output is:

1000 500 250
Note: In Java, integer division discards fractions. Ex: 6 / 4 is 1 (the 0.5 is discarded).
*/
import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
         Scanner scnr = new Scanner(System.in);
         
         int userNum = scnr.nextInt();
         int divNum = scnr.nextInt();
         
         // userNum = userNum / divNum;
         // System.out.print(userNum + " ");
         
         // userNum = userNum / divNum;
         // System.out.print(userNum + " ");
         
         // userNum = userNum / divNum;
         // System.out.println(userNum);
         
         System.out.print(userNum / divNum + " ");
         System.out.print((userNum / divNum) / (divNum) + " ");
         System.out.println(((userNum / divNum) / (divNum)) / (divNum));
   }
}
