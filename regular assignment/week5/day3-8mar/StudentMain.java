class Student{
  String name;
  int id;
  String branch;
  double sub1,sub2,sub3;
  Student(){
    st1.name="Rishab";
    st1.branch = "ECE";
    st1.id=074;
    st1.sub1=80;
    st1.sub2=90;
    st1.sub3=100;
    st1.average();
    st1.percentage();
  }
  void average(){
    double avg = (sub1+sub2+sub3)/3;
    System.out.println(name+" average is "+avg);
  }
  void percentage(){
    double per = (sub1+sub2+sub3)/300*100;
    System.out.println(name+" percentage is "+per);
  }
}
class StudentMain{
  public static void main(String args[]){
    Student st1 = new Student();
    st1.average();
    st1.percentage();
  }
}