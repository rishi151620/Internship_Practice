import java.util.*;
class ArrayNeg{
  public static void main(String args []){
    int arr[]=new int[5];
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the values :");
    for(int i=0;i<5;i++){
      arr[i]=sc.nextInt();   
    }
    System.err.println("negative array values are :");
    for(int i=0;i<5;i++){
      //positive numbers
      if(arr[i]<0)
        System.out.println(arr[i]);
    }
    
  }
}