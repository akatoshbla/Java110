/**
* Project #2: Calculate a grade
* File: CalculateGrade.java
* Section #14492
* Programmer: David Kopp
* Date: 2/11/13
* Description: This program will display the letter grade that corresponds to the score the user inputs.
*/

   import java.util.Scanner;

   public class CalculateGrade
   {
      public static void main(String[] args)
      {
      
      // Assigning Scanner class to a variable input.
         Scanner input = new Scanner(System.in);
      
      // Declared Variables
         double score = 0.0;
         char grade = 'F';
      
      // Reading and capturing of the user's input of their score via the console.
         System.out.print("Please enter your score: ");
         score = input.nextDouble();
      
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
      	  
      // Output of the score the user inputed and corresponding letter grade via console.
         System.out.println("Your score of " + score + " corresponds to the letter grade of " + grade + "."); 
      
      }
   }