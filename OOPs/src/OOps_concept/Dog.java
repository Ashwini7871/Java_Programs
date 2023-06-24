package OOps_concept;

//Inheritance: Dog is a subclass of Animal
class Dog extends Animal //goes to animal line
{
 public Dog(String name) {
     super(name);
 }

 public void bark() {
     System.out.println(name + " is barking.");
 }
}

