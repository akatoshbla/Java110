/**
* Project #2: Calculate a grade using a GUI
* File: CalculateGradeGUI.java
* Section #14492
* Programmer: David Kopp
* Date: 2/11/13
* Description: This program will display the letter grade that corresponds to the score the user inputs via a GUI.
*/

   import javax.swing.JOptionPane;

   public class CalculateGradeGUI
   {
      public static void main(String[] args)
      {
      
      // Declared Variables
         char grade = 'F';
      
      // Reading and capturing of the user's input of their score via the GUI.
         String scoreString = JOptionPane.showInputDialog(null, "Please enter your score", "Input of Score", JOptionPane.QUESTION_MESSAGE);
      
      // Converting the string to a double for the variable score.
         double score = Double.parseDouble(scoreString);
      
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
      
      // Output of the score the user inputed and corresponding letter grade via GUI.
         String output = "Your score of " + score + " corresponds to the letter grade " + grade; JOptionPane.showMessageDialog(null, output); 
      
      }
   }

