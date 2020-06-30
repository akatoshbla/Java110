/**
* Project #2: Converting Celsius to Fahrenheit
* File: ConvertTemp.java
* Section #14492
* Programmer: David Kopp
* Date: 2/11/13
* Description: This program will take an input of celsius and converts to fahrenheit as an output via console.
*/

   import java.util.Scanner;

   public class ConvertTemp
   {
      public static void main(String[] args)
      {
      
      // Assigning Scanner class to a variable input.
         Scanner input = new Scanner(System.in);
      
      // Declared variables
         double celsius;
         double fahrenheit;
      
      // Asking the user for celsius input via console and assigning input to variable celsius.
         System.out.print("Please enter degrees in Celsius: ");
         celsius = input.nextDouble();
      
      // Math computation to solve for output variable fahrenheit.
         fahrenheit = (9.0 / 5.0) * celsius + 32.0;
      
      // Output of fahrenheit to the user via console.
         System.out.println("Your input of " + celsius + " degrees Celsius " + "is equal to " + fahrenheit + " degrees Fahrenheit.");
      
      }
   }