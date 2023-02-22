import java.util.*;
class EvenOdd{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter n");
    int n=sc.nextInt();
    int i,j;
    System.out.println("even numbers are:");
    for(i=1;i<=n;i++){
      
      if(i%2==0){
         System.out.println(i);
      }
   }
    System.out.println("odd numbers are");
    for(j=1;j<=n;j++){
      if(j%2!=0)
        System.out.println(j);
    }
  }  
}