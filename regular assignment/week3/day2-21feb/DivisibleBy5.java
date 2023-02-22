import java.util.*;
class DivisibleBy5{
  public static void main(String args[]){
    int i,n;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the n");
    n=sc.nextInt();
    System.out.println("numbers divisible by 5 are :");
    for(i=1;i<=n;i++){
      if(i%5==0)
        System.out.println(i);
     
    }
   
  }
}