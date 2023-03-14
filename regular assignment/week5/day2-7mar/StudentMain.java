class StudentMain{
  int id;
  String name;
  String branch;
  double s1,s2,s3;
  void average(){
    double avg=(s1+s2+s3)/3;
    System.out.println(name+" average is "+avg);
  }
  void percentage(){
    double totalmarks=s1+s2+s3;
    double perc=(totalmarks/300)*100;
    System.out.println(name+" percentage is "+perc);
  }


  public static void main(String args[]){
    Student st1=new Student();
    st1.id=074;
    st1.name="rishab";
    st1.branch="ece";
    st1.s1=87;
    st1.s2=90;
    st1.s3=54;
    st1.average();
    st1.percentage();
    Student st2=new Student();
    st2.id=015;
    st2.name="banjan";
    st2.branch="ece";
    st2.s1=80;
    st2.s2=90;
    st2.s3=64;
    st2.average();
    st2.percentage();
    
    
  }
  
  
}