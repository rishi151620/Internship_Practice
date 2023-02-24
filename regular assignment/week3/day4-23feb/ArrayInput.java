import java.util.*;
class ArrayInput{
  public static void main(String args []){
    double arr[]=new double[5];
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the values :");
    for(int i=0;i<5;i++){
      arr[i]=sc.nextDouble();   
    }
    System.err.println("array values are :");
    for(int i=0;i<5;i++)
      System.out.println("a["+i+"]"+"="+arr[i]);
  }
}