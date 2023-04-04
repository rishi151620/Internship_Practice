import java.util.*;
class Student{
  private String name,sec,branch;
  private int rollNo;
  Student(String name,String sec,String branch,int rollNo){
    this.name=name;
    this.sec=sec;
    this.branch=branch;
    this.rollNo=rollNo;
  }
  String getName(){
    return name;
  }
  String getSec(){
    return sec;
  }
  String getBranch(){
    return branch;
  }
  int getRollNo(){
    return rollNo;
  }
}
  public class StudentArray{
    public static void main(String args[]){
      Scanner sc= new Scanner(System.in);
      ArrayList<Student> std = new ArrayList<Student>();
      for(int i=0;i<3;i++){
        std.add(new Student(sc.next(),sc.next(),sc.next(),sc.nextInt()));
      }
      for(Student e:std){
        System.out.println(e.getName()+" "+e.getRollNo()+" "+e.getBranch()+" "+e.getSec());
      }
    }
  }
