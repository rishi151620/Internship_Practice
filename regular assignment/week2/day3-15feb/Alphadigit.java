import java.util.*;
class Alphadigit{

  public static void main(String[] args){

      Scanner sc=new Scanner(System.in);
      System.out.print("enter the character : ");

      char ch=sc.next().charAt(0);
      if((ch >='a' && ch<='z')||(ch>='A' && ch<='Z')){
            System.out.println(ch + " is an alphabet.");
      }else if(ch >='0' && ch <='9') {
            System.out.println(ch + " is digit.");
        
      }else{
        System.out.println(ch + "is a specl character");
        
      }
  }
} 
