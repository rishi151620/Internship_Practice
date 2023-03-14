import java.util.Scanner;
class ReadAndDisplayArray{
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
  
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter size");
    int n=sc.nextInt();
    int a[]=new int[n];
    insert(n,a);
    display(n, a);
    
        
  }
  
}
