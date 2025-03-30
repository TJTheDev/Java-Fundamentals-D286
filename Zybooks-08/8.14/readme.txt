8.14 LAB: Pet information (derived classes)
The base class Pet has protected fields petName, and petAge. The derived class Cat extends the Pet class and includes a private field for catBreed. Complete main() to:

create a generic pet and print information using printInfo().
create a Cat pet, use printInfo() to print information, and add a statement to print the cat's breed using the getBreed() method.
Ex. If the input is:

Dobby
2
Kreacher
3
Scottish Fold
the output is:

Pet Information: 
   Name: Dobby
   Age: 2
Pet Information: 
   Name: Kreacher
   Age: 3
   Breed: Scottish Fold