import java.util.*;
class EvenNo{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter n");
    int n=sc.nextInt();
    int i;
    System.out.println("even number are :");
    for(i=1;i<=n;i++){
      
      if(i%2==0){
       
        System.out.println(i);
      }

    }
    
  }
}