/**
* Project #2: Volume of a cylinder
* File: CalculateCylinder.java
* Section #14492
* Programmer: David Kopp
* Date: 2/11/13
* Description: This program will compute the volume of a cylinder with the user input, via the console, of a radius and length of a cylinder.
*/

   import java.util.Scanner;

   public class CalculateCylinder
   {
      public static void main(String[] args)
      {
      
      // Assigning Scanner class to a variable input.
         Scanner input = new Scanner(System.in);
      
      // Declared Variables
         double radius;
         double length;
         double area;
         double volume;
      
      // Reading and capturing of the user's input of the radius and length of the cylinder via the console.
         System.out.print("Please enter the radius of the cylinder: ");
         radius = input.nextDouble();
         System.out.print("Please enter the length of the cylinder: ");
         length = input.nextDouble();
      
      // Math computations to find the area of the top or bottom of the cylinder and multiplaying that area by the length.
         area = radius * radius * 3.14159; // 3.14159 is the approx of PI being used.
         volume = area * length;
      
      // Output of the radius, length, and volume of the cylinder via console.
         System.out.println("The volume of a cylinder with the radius of " + radius + " and a length of " + length + " is " + volume + ".");
      
      
      }
   }