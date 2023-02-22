import java.util.*;
class AsciiDo{
  public static void main(String args[]){
    System.out.println("ascii value of A to Z are");
    char ch='A';
    do{
      System.out.println((int)ch);
      ch++;
    }
    while(ch<='Z');
      
    
  }
}