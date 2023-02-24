
import java.util.*;
class CountPosNegArray{
  public static void main(String args []){
    int arr[]=new int[5];
    int count=0,temp=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the values :");
    for(int i=0;i<5;i++){
      arr[i]=sc.nextInt();   
    }
     for(int i=0;i<5;i++){
      //positive numbers
      if(arr[i]>0)
        count++;
      else if(arr[i]<0)
        temp++;
    }
    System.out.println("number of positive array values : "+count);
    System.out.print("number of negative array values : "+temp);
    
    
  }
}