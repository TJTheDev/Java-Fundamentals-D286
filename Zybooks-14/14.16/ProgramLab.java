import java.util.Scanner;

public class ProgramLab {
   public static void main(String[] args) {
      final double HOMEWORK_MAX = 800.0;
      final double QUIZZES_MAX = 400.0;
      final double MIDTERM_MAX = 150.0;
      final double FINAL_MAX = 200.0;

      Scanner scnr = new Scanner(System.in);

      String status = scnr.next();
      double homeworkPoints = scnr.nextDouble();
      double quizPoints = scnr.nextDouble();
      double midtermPoints = scnr.nextDouble();
      double finalPoints = scnr.nextDouble();

      // Check for valid status
      if (!(status.equals("UG") || status.equals("G") || status.equals("DL"))) {
         System.out.println("Error: student status must be UG, G or DL");
         return;
      }

      // Calculate raw percentages
      double homeworkPct = (homeworkPoints / HOMEWORK_MAX) * 100.0;
      double quizPct = (quizPoints / QUIZZES_MAX) * 100.0;
      double midtermPct = (midtermPoints / MIDTERM_MAX) * 100.0;
      double finalPct = (finalPoints / FINAL_MAX) * 100.0;

      // Cap at 100%
      homeworkPct = Math.min(homeworkPct, 100.0);
      quizPct = Math.min(quizPct, 100.0);
      midtermPct = Math.min(midtermPct, 100.0);
      finalPct = Math.min(finalPct, 100.0);

      // Print category averages
      System.out.printf("Homework: %.1f%%%n", homeworkPct);
      System.out.printf("Quizzes: %.1f%%%n", quizPct);
      System.out.printf("Midterm: %.1f%%%n", midtermPct);
      System.out.printf("Final Exam: %.1f%%%n", finalPct);

      // Determine weights and calculate final average
      double courseAverage = 0.0;
      if (status.equals("UG")) {
         courseAverage = (homeworkPct * 0.20) + (quizPct * 0.20) +
                         (midtermPct * 0.30) + (finalPct * 0.30);
      } else if (status.equals("G")) {
         courseAverage = (homeworkPct * 0.15) + (quizPct * 0.05) +
                         (midtermPct * 0.35) + (finalPct * 0.45);
      } else if (status.equals("DL")) {
         courseAverage = (homeworkPct * 0.05) + (quizPct * 0.05) +
                         (midtermPct * 0.40) + (finalPct * 0.50);
      }

      System.out.printf("%s average: %.1f%%%n", status, courseAverage);

      // Determine letter grade
      char grade;
      if (courseAverage >= 90.0) {
         grade = 'A';
      } else if (courseAverage >= 80.0) {
         grade = 'B';
      } else if (courseAverage >= 70.0) {
         grade = 'C';
      } else if (courseAverage >= 60.0) {
         grade = 'D';
      } else {
         grade = 'F';
      }

      System.out.printf("Course grade: %c%n", grade);
   }
}
