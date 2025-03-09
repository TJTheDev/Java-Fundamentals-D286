/*
Write a program with total change amount in pennies as an integer input, and output the change using the fewest coins, one coin type per line. The coin types are Dollars, Quarters, Dimes, Nickels, and Pennies. Use singular and plural coin names as appropriate, like 1 Penny vs. 2 Pennies.

Ex: If the input is:

0
the output is:

No change
Ex: If the input is:

45
the output is:

1 Quarter
2 Dimes 
*/
import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int moneyIn = scnr.nextInt();
      scnr.close();
      
      if (moneyIn < 1) {
         System.out.println("No change");
      }
      
      int dollars = 0;
      int quarters = 0;
      int dimes = 0;
      int nickels = 0;
      
      while (moneyIn > 4) {
         if (moneyIn >= 100) {
            moneyIn -= 100;
            dollars += 1;
         } else if (moneyIn >= 25) {
            moneyIn -= 25;
            quarters += 1;
         } else if (moneyIn >= 10) {
            moneyIn -= 10;
            dimes += 1;
         } else if (moneyIn >= 5) {
            moneyIn -= 5;
            nickels += 1;
         }
      }
      
      if (dollars == 1) {
         System.out.println("1 Dollar");
      } else if (dollars > 1) {
         System.out.println(dollars + " Dollars");
      }
      
      if (quarters == 1) {
         System.out.println("1 Quarter");
      } else if (quarters > 1) {
         System.out.println(quarters + " Quarters");
      }
      
      if (dimes == 1) {
         System.out.println("1 Dime");
      } else if (dimes > 1) {
         System.out.println(dimes + " Dimes");
      }
      
      if (nickels == 1) {
         System.out.println("1 Nickel");
      } else if (nickels > 1) {
         System.out.println(nickels + " Nickels");
      }
      
      if (moneyIn == 1) {
         System.out.println("1 Penny");
      } else if (moneyIn > 1) {
         System.out.println(moneyIn + " Pennies");
      }
   }
}
