import java.util.*;
class Student{
  private int rollno;
  private String Sname;
  private String Dept;
  private char Section;

  void setrollno(int rollno)
  {
    this.rollno=rollno;
  }
  void setSname(String Sname)
  {
    this.Sname=Sname;
  }
  void setDept(String Dept)
  {
    this.Dept=Dept;
  }
  void setSection(char Section)
  {
    this.Section=Section;
  }
  int getrollno()
  {
    return rollno;
  }
  String getSname()
  {
    return Sname;
  }
  String getDept()
  {
    return Dept;
  }
  char getSection(){
    return Section;
  }
  
}
public class StudentOops{
  public static void main(String args[]){
    Student s[] = new Student[2];
    Scanner sc = new Scanner(System.in);
    for(int i=0;i<s.length;i++){
      s[i]=new Student();
      System.out.println("enter student "+i+"details");
      System.out.println("enter name ");
      s[i].setSname(sc.next());
       System.out.println("Enter the roll no.");
      s[i].setrollno(sc.nextInt());
      System.out.println("enter the department ");
      s[i].setDept(sc.next());
      System.out.println("Enter the section");
      s[i].setSection(sc.next().charAt(0));
    }
    for(int i=0;i<s.length;i++){
      System.out.println("Roll no:"+s[i].getrollno());
      System.out.println("Name:"+s[i].getSname());
      System.out.println("Department:"+s[i].getDept());
      System.out.println("section:"+s[i].getSection());
      System.out.println("\n");
    }
    
  }
}