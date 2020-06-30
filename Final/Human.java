//Programmer: David Kopp
//Comp110/110L Sections #14492 / # 14493 
  
   public abstract class Human {
   
      private String name;
      private double age;
      private double height;
   
      public Human() {
         name = "J. Doe";
         age = 1;
         height = 1.5;
      
      }
   
      public Human(String newName, double newAge, double newHeight) {
         setAge(newAge);
         setName(newName);
         setHeight(newHeight);
      
      }
   
      public void setName(String newName) {
         if (newName.length() >= 1) {
            name = newName;
         
         }
         else {
            System.out.println("I'm sorry, your name must be at least 1 character long.");
         
         }
      }
   
      public String getName() {
         return name;
      
      }
   
      public void setAge(double newAge) {
         if (newAge > 0) {
            age = newAge;
         
         }
         else {
            System.out.println("I'm sorry, you are too young to be using a computer.");
         
         }
      }
   
      public double getAge() {
         return age;
      
      }
   
      public void setHeight(double newHeight) {
         if (newHeight >= 1.5) {
            height = newHeight;
         
         }
         else {
            System.out.println("I'am sorry, you must be at least 1.5 feet tall to use this program.");
         
         }
      }
   
      public double getHeight() {
         return height;
      
      }
   
      public abstract void introduction();
   
   }