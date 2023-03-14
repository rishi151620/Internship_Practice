class Animal {
  String name;
  String color;
  int tailLength;
  int no_of_legs;
 
  void eat() {
    System.out.println("roaming......");
  }
 
}
 
class Dog extends Animal {
  String bread;
  String type_of_dog;
 
  void bark() {
    System.out.println("crying......");
  }
 
  void displayProperties() {
    System.out.println(name + " " + color + " " + tailLength + " " + no_of_legs + " " + bread + " " + type_of_dog);
  }
}
 
public class InheritanceExp {
  public static void main(String args[]) {
    Dog dog = new Dog();
    dog.name = "rian";
    dog.color = "brown";
    dog.no_of_legs = 2;
    dog.tailLength = 2;
    dog.bread = "nigga";
    dog.type_of_dog = "arrogant";
    dog.displayProperties();
    dog.eat();
    dog.bark();
 
  }
}