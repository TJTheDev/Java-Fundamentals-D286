import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String month = scnr.next();
      int day = scnr.nextInt();

      // Map months to number and max days
      int monthNum = 0;
      int maxDay = 31;

      switch (month) {
         case "January":    monthNum = 1; maxDay = 31; break;
         case "February":   monthNum = 2; maxDay = 29; break;
         case "March":      monthNum = 3; maxDay = 31; break;
         case "April":      monthNum = 4; maxDay = 30; break;
         case "May":        monthNum = 5; maxDay = 31; break;
         case "June":       monthNum = 6; maxDay = 30; break;
         case "July":       monthNum = 7; maxDay = 31; break;
         case "August":     monthNum = 8; maxDay = 31; break;
         case "September":  monthNum = 9; maxDay = 30; break;
         case "October":    monthNum = 10; maxDay = 31; break;
         case "November":   monthNum = 11; maxDay = 30; break;
         case "December":   monthNum = 12; maxDay = 31; break;
         default:
            System.out.println("Invalid");
            return;
      }

      if (day < 1 || day > maxDay) {
         System.out.println("Invalid");
         return;
      }

      // Determine season
      String season = "";

      if ((monthNum == 3 && day >= 20) || (monthNum > 3 && monthNum < 6) || (monthNum == 6 && day <= 20)) {
         season = "Spring";
      }
      else if ((monthNum == 6 && day >= 21) || (monthNum > 6 && monthNum < 9) || (monthNum == 9 && day <= 21)) {
         season = "Summer";
      }
      else if ((monthNum == 9 && day >= 22) || (monthNum > 9 && monthNum < 12) || (monthNum == 12 && day <= 20)) {
         season = "Autumn";
      }
      else {
         season = "Winter";
      }

      System.out.println(season);
   }
}
