import java.util.*;
class Employee{
  private String name,position;
  private int empid;
  private long salary;
  
  Employee(String name,String position,long salary,int empid){
    this.name=name;
    this.position=position;
    this.salary=salary;
    this.empid=empid;
  }
  String getName(){
    return name;
  }
  long getSalary(){
    return salary;
  }
  String getPosition(){
    return position;
  }
  int getEmpid(){
    return empid;
  }
}
public class EmployeeArray{
  public static void main(String args[]){
      Scanner sc= new Scanner(System.in);
      ArrayList<Employee> emp = new ArrayList<Employee>();
      for(int i=0;i<3;i++){
        emp.add(new Employee(sc.next(),sc.next(),sc.nextLong(),sc.nextInt()));
      }
      for(Employee i:emp){
        System.out.println(i.getName()+" "+i.getSalary()+" "+i.getPosition()+" "+i.getEmpid());
      }
  }
}