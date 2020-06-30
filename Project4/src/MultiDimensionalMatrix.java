/**
* Project #3: Multi-Dimensional Arrays
* File: NumberSorter.java
* Section #14492
* Programmer: David Kopp
* Date: 3/13/13
* Description: This program will create a multi-dimensional arrays. The array is user filled and the sums of each column is displayed. 
*					 
*					
*/

   import java.util.Scanner;

   public class MultiDimensionalMatrix {
      public static void main(String[] args) {
      
      // Scanner Object created
         Scanner input = new Scanner(System.in);
      
      // Declaring variables and array
         double[][] numberMatrix = new double[3][4];
      
      // Information and output to the user to input numbers to fill the said matrix.
         System.out.println("Enter a " + numberMatrix.length + "-by-" + numberMatrix[0].length + " matrix row by row:");
      
      // Loop for the user to input the numbers for the arrays
         for (int row = 0; row < numberMatrix.length; row++) {
            for (int column = 0; column < numberMatrix[row].length; column++) {
               numberMatrix[row][column] = input.nextDouble();
            }
         }
      
      // Output to the user that displays the sum of each column entered.
         for (int i = 0; i < numberMatrix[0].length; i++) {
            System.out.println("Sum of the elements at column " + i + " is " + sumColumn(numberMatrix, i)); 
         }
      }
   
   // SumColumn Method
      public static double sumColumn(double[][] m, int columnIndex) {
      
         double sum = 0;
      
      // Loop to sum up the rows in the specified column
         for (int row = 0; row < m.length; row++) {
            sum += m[row][columnIndex]; 
         }
      
         return sum;
      }
   }