/*
Write code in the Pet.java file that has the following fields, constructors, and methods:

Fields

name: string field for the name of the pet
type: string field for the type of pet
age: integer field for the age of the pet
Constructors

Pet: no-argument constructor
The Pet constructor should assign the value "unknown" to the name field, the value "unknown" to the type field, and the value 0 to the age field.
Pet: overloaded constructor with two string parameter variables for the name and type, and one integer parameter variable for the age
The overloaded Pet constructor should assign the parameter variable values to the name, type, and age fields, accordingly.
Methods

setName: mutator method that sets the name field
setType: mutator method that sets the type field
setAge: mutator method that sets the age field
getName: accessor method that returns the name field value
getType: accessor method that returns the type field value
getAge: accessor method that returns the age field value
If the input is:

Max
Bulldog
3
Leo
Boston-Terrier
6

the output is:
Name: unknown
Type: unknown
Age: 0

Name: Max
Type: Bulldog
Age: 3

Name: Leo
Type: Boston-Terrier
Age: 6
*/
public class Pet {
   // Private fields
   private String name;
   private String type;
   private int age;

   // No-argument constructor
   public Pet() {
       this.name = "unknown";
       this.type = "unknown";
       this.age = 0;
   }

   // Overloaded constructor
   public Pet(String name, String type, int age) {
       this.name = name;
       this.type = type;
       this.age = age;
   }

   // Mutator methods (setters)
   public void setName(String name) {
       this.name = name;
   }

   public void setType(String type) {
       this.type = type;
   }

   public void setAge(int age) {
       this.age = age;
   }

   // Accessor methods (getters)
   public String getName() {
       return name;
   }

   public String getType() {
       return type;
   }

   public int getAge() {
       return age;
   }
}
