import java.util.Scanner;
class ArrayMenuApplication{
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
    n++;
  }
 
  //insert at last
  static void insertAtLast(int newElement,int a[],int n ){
    a[n-1]=newElement;
    n=n+1;
  }
  static void display(int n,int a[]){
    for(int i=0;i<n;i++){
      System.out.println("a["+i+"] ="+a[i]);
    }
  }
   static void insertspecific(int Newelement,int a[],int n){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter position you want to insert");
    int p = sc.nextInt();
    for(int i=n-1;i>=p;i--){
      a[i+1]=a[i];
    }
    a[p]=Newelement;
    n=n++;
  }
  static void deletefirst(int a[],int n){
    for(int i=1;i<n;i++)
    {
      a[i-1]=a[i];
    }
    n=n--;
  }
  static void deletespecific(int a[],int n){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter position you want to insert");
    int p=sc.nextInt();
    for(int i=p+1;i<n;i++)
    {
      a[i-1]=a[i];
    }
    n=n--;
  }
   static void deletelast(int a[],int n){
    a[n-1]=0;
    n=n--;
  }
  static void search(int a[],int e,int n){
   
    int p=0;
    for(int i=0;i<n;i++)
    {
      if(a[i]==e)
      {
        System.out.println("FOUND "+e+" at"+i+" position");
        p=i;
      }
    }
    if(a[p] != e)
        System.out.println("Not Found");
  }
  static void frequency(int a[], int n){
    boolean visited[] = new boolean[n];
    System.out.println("Value Frequency");
    for(int i=0;i<n;i++)
    {
      if (visited[i] == true)
        continue;
      int p=1;
      for(int j = i + 1; j < n; j++) {
        if (a[i] == a[j]) 
        {
          visited[j] = true;
          p++;
        }
      }
      System.out.println(a[i] + "       " + p);
    }
  }

  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int a[]=new int[50];
    System.out.println("enter size");
    int n=sc.nextInt();
    char c='y';
    int ch=0;
    do{
      System.out.println("enter the choice");
      System.out.println("1.to insert element into array");
      System.out.println("2.to insert the element to first  ");
      System.out.println("3.to insert the  element to last  ");
      System.out.println("4.to insert the element to specific location");
      System.out.println("5.delete at first");
      System.out.println("6.delete at last");
      System.out.println("7.delete at specific position");
      System.out.println("8.search for an element");
      System.out.println("9.find the frequency of each number");
      System.out.println("10.display");
      ch=sc.nextInt();
      switch(ch){
        case 1:
          insert(n,a);
          break;
        case 2:
          System.out.println("enter the element : ");
          int newElement=sc.nextInt();
          insertAtFirst(newElement,a,n);
          break;
        case 3:
          System.out.println("enter the element : ");
          int new1Element=sc.nextInt();
          insertAtLast(new1Element,a,n);
          break;
        case 4:System.out.println("Enter new element");
          int new2Element=sc.nextInt();
          
          insertspecific(new2Element,a,n);
          break;
        case 5:
          deletefirst(a, n);
          break;
        case 6:
          deletelast(a, n);
          break;
        case 7:
          deletespecific(a, n); 
          break;
        case 8:
          System.out.println("Enter Element to search");
          int e =sc.nextInt();
          search(a, e, n);;
          break;
        case 9:
          frequency(a, n);
          break;
        case 10:
          display(n,a);
          break;
        default :
          System.out.println("invalid choice");
          break;
      }
      System.out.println("do you want to continue ");
      c=sc.next().charAt(0);
      
    }while(c!='n');
     







    
  }


  
}
