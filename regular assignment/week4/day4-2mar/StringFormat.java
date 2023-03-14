import java.util.*;
class StringFormat{
public static void main(String args[]){
  float n1=145.54f,n2=456.3f;
  float res=n1*n2;
  //System.out.println(result);  
  String result1=String.format("|%-12.2f|%-12.2f|%-12.2f|",res,res,res);
    System.out.println(result1);  
  String result2=String.format("|%10.2f|%10.2f|%10.2f|",res,res,res);
      System.out.println(result2);
  
}
}