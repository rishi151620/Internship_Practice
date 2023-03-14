import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class UsernamePasswordValidator{
  static void unameValidator(String name,String password){

    String regex="[A-Z]{1,}+[a-z]{1,}+[0-9]{1,}+[$&+,:;=?@#|'<>.-^*()%!]{1,}";
    if(name.matches(regex))
      System.out.println("username is valid ");
    else
      System.out.println("username is invalid");
    if(password.matches(regex))
      System.out.println("password is valid");
    else
       System.out.println("password is invalid");
  }
  public static void main(String args[]){
    Scanner sc=new Scanner (System.in);
    System.out.println("enter the username ");
    String name =sc.next();
    System.out.println("enter the password ");
    String password=sc.next();
    unameValidator(name, password);
    
  }
  
}