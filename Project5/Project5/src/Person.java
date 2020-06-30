/**
* Project #5: Classes and Objects
* File: Person.java
* Section #14492
* Programmer: David Kopp
* Date: 4/15/13
* Description: This program is a class called Person with 3 global variables, 2 constructors, 
* 3 get methods, 3 set methods, and a toString method.
*/

   import java.util.Scanner;

   public class Person {
      private String name;
      private double height;
      private double weight;
   
   	// Constructor one
      public Person() {
      
         name = "John Doe";
         height = 60;
         weight = 200;
      
      }
   	
   	// Constructor two
      public Person(String newName, double newHeight, double newWeight) {
      
         setName(newName);
         setHeight(newHeight);
         setWeight(newWeight);
      
      }
   
   	// Three getter methods
      public String getName() {
         return name;
      }
      public double getHeight() {
         return height;
      }
      public double getWeight() {
         return weight;
      }
   
   	// Three setter methods
      public void setName(String newName) {
         if (newName.length() > 0 && newName.length() <= 50) {
            name = newName;
         } 
         else {
            System.out.println("I am sorry, but the name that was entered " + newName + " is too many characters.(The max amount of characters a name could be is 50.)");
         }
      
      }
      public void setHeight(double newHeight) {
         if (newHeight > 0 && newHeight <= 120) {
            height = newHeight;
         }
         else {
            System.out.println("I am sorry, but the height entered " + newHeight + " is incorrect.(Height can not exceed 120 inches.)");
         }
      
      }
      public void setWeight(double newWeight) {
         if (newWeight > 0 && newWeight <= 500) {
            weight = newWeight;
         }
         else {
            System.out.println("I am sorry, but the weight entered " + newWeight + " is incorrect.(Weight can not exceed 500 pounds.)");
         }
      
      }
   	
   	// toString method
      public String toString() {
         return "\nThe person's name is: " + name + " they are " + height + " inches tall and weigh " + weight + " pounds.";
      }
   
   	// Driver to test and demonstrate this class by creating an object person1
      public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
      
         System.out.print("Please enter a person's name: ");
         String newPersonName = input.nextLine();
         System.out.print("Please enter the person's height in inches: ");
         double newPersonHeight = input.nextDouble();
         System.out.print("Please enter the person's Weight in pounds: ");
         double newPersonWeight = input.nextDouble();
      
         Person person1 = new Person(newPersonName, newPersonHeight, newPersonWeight);
      
         System.out.println(person1.toString());
      
      }
   
   }