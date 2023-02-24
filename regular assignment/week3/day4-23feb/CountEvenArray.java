import java.util.*;
class CountEvenArray{
  public static void main(String args []){
    int arr[]=new int[5];
    int count=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the values :");
    for(int i=0;i<5;i++){
      arr[i]=sc.nextInt();   
    }
    System.err.println("number of even array values are :");
    for(int i=0;i<5;i++){
      //even numbers
      if(arr[i]%2==0)
        count++;
    }
    System.out.println(count);
    
  }
}