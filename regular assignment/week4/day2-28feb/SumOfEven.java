import java.util.Scanner;
class SumOfEven{
  //insert
  static void insert(int size,int a[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter array elements");
    for(int i=0;i<size;i++){
      a[i]=sc.nextInt();
    }
  }
  //display
  static void display(int n,int ab[]){
    System.out.println("elements are");
    for(int i=0;i<n;i++){
      System.out.println("a["+i+"] = "+ab[i]); 
    }
  }
  static void sumEven(int n,int abc[]){
    int sum=0;
    System.out.println("even elements are:");
    for (int i=0;i<n;i++){
      if(abc[i]%2==0){
         System.out.println("a["+i+"] = "+abc[i]);
         sum=sum+abc[i];
      }
    }
    System.out.println("sum of even numbers = "+sum);
  }
  
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter size");
    int n=sc.nextInt();
    int a[]=new int[n];
    insert(n,a);
    display(n, a);
    sumEven(n,a);
    
        
  }
  
}