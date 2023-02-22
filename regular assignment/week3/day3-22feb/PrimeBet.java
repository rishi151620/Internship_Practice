import java.util.*;
class PrimeBet{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("prime number between 1 to ");
    int n=sc.nextInt();
    int count,i,j;
    for(i=1;i<=n;i++){
      count=0;
      for(j=1;j<=i;j++){
        if(i%j==0)
          count++;
      }
      if(count==2)
        System.out.println(i);
    }
  }
}