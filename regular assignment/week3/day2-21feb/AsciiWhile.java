import java.util.*;
class AsciiWhile{
  public static void main(String args[]){
    System.out.println("ascii value of A to Z are");
    char ch='A';
    while(ch<='Z'){
      System.out.println((int)ch);
      ch++;
    }
  }
}