// Create a class called Person with attributes name and age. Create a subclass called Employee that inherits from Person and adds attributes salary and position. Create two subclasses, Manager and Engineer, that both inherit from Employee. Add an attribute num_reports to Manager and an attribute specialization to Engineer. Create a method in Manager called hire_employee() that increments the num_reports attribute. Create a method in Engineer called solve_problem() that prints out "Problem solved!".


class Person{
  String name;
  int age;
  void print(){
    System.out.println(name+" "+age);
  }
  void printAddress(){
    System.out.println(address);
  }
}
class Employee extends Person{
  int salary;
  String position;
  void display(){
    System.out.println(position+" "+salary);
  }
}
class Manager extends Employee{
  int num_ofReports;
  void hire_employee(){
    System.out.println(num_ofReports+1);
  }
  class Engineer extends Employee{
    String specialization;
    void solve_problem(){
      System.out.println("Problem soleved");
    }
  }
}
public class Hybrid{
  public static void main(String args[]){
    Manager std = new Manager();
    std.name="rian";
    std.age=20;
    std.position="Manager";
    std.num_ofReports=9;
    std.salary=1234;
    std.print();
    std.printAddress();
    std.display();
    std.hire_employee();
  }
}
