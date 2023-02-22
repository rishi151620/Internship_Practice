import java.util.*;
class Factor{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter n");
    int n =sc.nextInt();
    int i;
    System.out.println("factors of"+" "+n+" "+"are :");
    for(i=1;i<=n/2;i++){
      if(n%i==0){
        System.out.println(i);
      }
    }
  }
}