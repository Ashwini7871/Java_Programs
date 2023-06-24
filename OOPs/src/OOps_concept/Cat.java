package OOps_concept;

//Polymorphism: Cat implements the Animal interface
class Cat implements Animals {
 private String name;

 public Cat(String name) {
     this.name = name;
 }

 @Override
 public void eat() {
     System.out.println(name + " is eating.");
 }

 @Override
 public void sleep() {
     System.out.println(name + " is sleeping.");
 }
}

