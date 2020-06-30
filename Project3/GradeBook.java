/**
* Project #3: Grade Book
* File: GradeBook.java
* Section #14492
* Programmer: David Kopp
* Date: 2/25/13
* Description: This program will display the letter grade and number of each letter grade achieved from a list of scores. 
*					The program will also output the class average score and lettergrade. In addition, this program uses another 
*					method to calculate the letter grade per score.
*/

   import java.util.Scanner;

   public class GradeBook 
   {
   
      public static void main(String[] args)
      {
      
      // Assigning Scanner class to a variable input and a new object gb to invoke the calculateGrade method. 
         Scanner input = new Scanner(System.in);
         GradeBook gb = new GradeBook();
      
      // Declared Variables
         int numberOfIterations = 0;
         int totalA = 0;
         int totalB = 0;
         int totalC = 0;
         int totalD = 0;
         int totalF = 0;
         double score = 0;
         double totalScores = 0;
         double classAverageScore = 0;
      
      // Main Loop - User inputs scores to evaluate. (-1 ends this loop)
         while (score != -1) {
            System.out.print("Please enter a score (-1 ends input session): ");
            score = input.nextDouble();
         
         
         // A inner if loop confirms that the score inputed is not a negitive number. This loop will also calculate number of iterations, totalscores,
         // letter grade and the counters for each letter grade found by the calculateGrade method. 
            if (score >= 0) {
					char letterGrade = gb.calculateGrade(score);
               System.out.println("The score of " + score + " is the grade letter of " + letterGrade + ".\n");
               totalScores += score;
               numberOfIterations++;
            
            // A switch is used to count the number of letter grades achieved by the list of scores.
               switch (letterGrade) {
                  case 'A': totalA++;
                     break;
               
                  case 'B': totalB++;
                     break;
               
                  case 'C': totalC++;
                     break;
               
                  case 'D': totalD++;
                     break;
               
                  case 'F': totalF++;
                     break;
               }
            }
         }
      
      // Computation of the class average.
         classAverageScore = totalScores / numberOfIterations;
      
      // Output of the class average score, total letter grade from A-F, class average letter grade, and total number of scores entered.
         System.out.println("------------------------------------------------------------");
         System.out.println("Total number of A's: " + totalA);
         System.out.println("Total number of B's: " + totalB);
         System.out.println("Total number of C's: " + totalC);
         System.out.println("Total number of D's: " + totalD);
         System.out.println("Total number of F's: " + totalF);
      
         System.out.println("Total number of scores inputted: " + numberOfIterations);
         System.out.printf("%s%2.2f", "\nAverage class score: ", classAverageScore);
         System.out.println("\nAverage class grade: " + gb.calculateGrade(classAverageScore));
         System.out.println("------------------------------------------------------------");
      
      }
   
		// Method to calculate the letter grade of a double type of input named score from user input via Main Method console.
      public static char calculateGrade(double score) {
      
         char grade = 'F';
      
      // Nested IF statements to find the correct letter grade to be assigned to the variable grade.
         if (score >= 90) {
            grade = 'A';
         }
         
         else if (score >= 80) {
            grade = 'B';
         }
         
         else if (score >= 70) {
            grade = 'C';
         }
         
         else if (score >= 60) {
            grade = 'D';
         }
         
         else if (score < 60 && score >= 0) {
            grade = 'F';
         }
         return grade;
      }
   }