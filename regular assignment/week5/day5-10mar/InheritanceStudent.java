class Human{
  String name;
  String gender;
  int age;
  String address;
 
  void print() {
    System.out.println("name : "+name);
    System.out.println("age : "+age);
    System.out.println("address : "+address);
  }
 
}
 
class Student extends Human{
  int id;
  String department;
  int sub1;
  int sub2;
  int sub3;
  
 
  void average() {
    System.out.println("average of marks = "+(sub1+sub2+sub3)/3);
  }
 
  void percentage() {
    System.out.println("percentage = "+(((sub1+sub2+sub3)*100)/300));
  }
}
 
public class InheritanceStudent{
  public static void main(String args[]) {
    Student st = new Student();
    st.name = "rian";
    st.gender = "male";
    st.age = 21;
    st.address = "kaikamba jake u turn";
    st.id = 073;
    st.department = "electronics";
    st.sub1=56;
    st.sub2=67;
    st.sub3=89;
    st.print();
    st.average();
    st.percentage();
  }
}