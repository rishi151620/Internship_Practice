import java.util.*;
class EvenOddWhile{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter n");
    int n=sc.nextInt();
    int i=1,j=1;
    System.out.println("even number are :");
    while(i<=n){
      
      if(i%2==0){
       
        System.out.println(i);
      }
      i=i+1;

    }
    System.out.println("odd numbers are :");
    while(j<=n){
      
      if(j%2!=0){
       
        System.out.println(j);
      }
      j=j+1;

    }
    
  }
}