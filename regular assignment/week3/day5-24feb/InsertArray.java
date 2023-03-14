import java.util.Scanner;
class InsertArray{
  public static void main(String args[]){
    //declare varaible
    int n=5,i;
    int a[]=new int[n+1];
    Scanner sc=new Scanner(System.in);
    //reading
    System.out.println("enter the array values");
    for(int j=0;j<n;j++){
      a[j]=sc.nextInt();
    }
    int pos=2,newValue=20;
    //shift the values;
    for(i=(n-1);i>(pos-1);i--){//i=4 4>1
      a[i+1]=a[i];
    }
    a[pos-1]=newValue;
    System.out.println("after insertion");
    for(int j=0;j<a.length;j++){
      System.out.println("a["+j+"]="+a[j]);
    }
  }
}