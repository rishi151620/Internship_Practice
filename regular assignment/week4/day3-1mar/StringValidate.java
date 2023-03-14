import java.util.*;
class StringValidate{
 
  static void validateString(String str1){
    if(str1.startsWith("r") && str1.endsWith(".com"))
    {
      System.out.println("valid");
    }
    else{
      System.out.println("not valid");
    }
   
  }
 
  
  public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   String str2;
   System.out.println("enter string1"); 
   str2=sc.nextLine();
   
    
    validateString(str2);
    
  }
}