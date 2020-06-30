/**
* Project #3: Array Sorting
* File: NumberSorter.java
* Section #14492
* Programmer: David Kopp
* Date: 3/11/13
* Description: This program will create an array and then copy numbers from a text file into the array. Next it will sort the created array and output 
*					via console. 
*					
*/

   import java.util.Scanner;
   import java.io.File;
   import java.io.FileNotFoundException;
   import java.io.PrintWriter;

   public class NumberSorter {
      public static void main(String[] args) throws FileNotFoundException {
      
      // Creating Scanner and text file objects
         File numTestData = new File("numbers.txt");
         Scanner input = new Scanner(numTestData);
         PrintWriter output = new PrintWriter("dataout.txt");
      
      // Declaring Variables and creating and initializing array using the length found in the first line of text file.
         int[] numberArray = new int[input.nextInt()];
         int counter = 0;
         int sum = 0;
         double arrayAverage;
      
         for (int i = 0; i <= numberArray.length - 1; i++) {
            numberArray[i] = input.nextInt();
            sum += numberArray[i];
            counter++;
         }
      
      // Math computations to figure out average of the array.
         arrayAverage = sum / counter;
      
      // Selection sorting the array.
         sort(numberArray);
      
      // Output to the user via console.
         output.println("The array's length is: " + numberArray.length);
         output.println("\nSorted numbers from the array:");
      	
         for (int i = 0; i <= numberArray.length - 1; i++) {
            output.println(numberArray[i]);
         }
      	
         output.println("\nThe average of the numbers in the array is " + arrayAverage);
      	 
      // close of the output file.
         output.close();
      }
   	
      // Selection Sort method
      public static void sort(int[] list) {
      
         for (int i = 0; i < list.length - 1; i++) {
            int currentMin = list[i];
            int currentMinIndex = i;
         
            for (int j = i + 1; j < list.length; j++) {
               if (currentMin > list[j]) {
                  currentMin = list[j];
                  currentMinIndex = j;
               }
            }
         
            if (currentMinIndex != i) {
               list[currentMinIndex] = list[i];
               list[i] = currentMin;
            }
         }
      }
   }