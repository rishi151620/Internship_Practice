import java.util.*;
class ValidateAge{
  public static void main(String argsp[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the age");
    boolean valid=true;
    do{
      int age=sc.nextInt();
      if(age>0){
       System.out.println("valid");
       valid=false;
      }
      else
        System.out.println("invalid age enter tha age agian");
    }while(valid);
  }
}