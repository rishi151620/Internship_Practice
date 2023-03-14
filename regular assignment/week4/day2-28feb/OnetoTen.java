import java.util.*;
class OnetoTen{
  static void printNum(){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number ");
    int n =sc.nextInt();
    for(int i=1;i<=n;i++){
      System.out.println(i);
    }
    
  }
  public static void main(String args[]){
    OnetoTen.printNum();
  
  }
}