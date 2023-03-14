import java.util.Scanner;
class FirstAndLastArray{
  //insert from last
  static void insert(int n,int a[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter array elements");
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
  }
//insert new element into first postion
  static void insertAtFirst(int newElement,int a[],int n){
    for(int i=n-1;i>=0;i--){
      a[i+1]=a[i];
    }
    a[0]=newElement;
  }
 
  //insert at last
  static void insertAtLast(int n,int newElement,int a[]){
    a[n]=newElement;
  }
static void display(int n,int a[]){
  for(int i=0;i<n;i++){
    System.out.println(a[i]);
  }
}
 
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int a[]=new int[50];
    System.out.println("enter size");
    int n=sc.nextInt();
    insert(n,a);
    //System.out.println("enter new element");
    // int newElement=sc.nextInt();
    // insertAtFirst(newElement, a, n);
    // System.out.println("after inserting at first position");
    // display(n+1,a);
    System.out.println("enter new element");
    int newElement=sc.nextInt();
    System.out.println("after inserting at Last position");
    insertAtLast(n, newElement, a);
    display(n+1,a);
    
    
  }
}