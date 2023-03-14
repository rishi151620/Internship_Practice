import java.util.Scanner;
class FirstLastArray{
  public static void main(String args[]){
    //declare varaible
    Scanner sc=new Scanner(System.in);
    int n,i;
    System.out.println("Enter the length of array :");
    n = sc.nextInt();
    int a[]=new int[n+1];
   
    System.out.println("enetr the array values");
    for(int j=0;j<n;j++){
      a[j]=sc.nextInt();
    }
    int pos,newValue;
    System.out.println("Enter any of first and last");
     pos =sc.nextInt();
     newValue=0;
    if(pos==1){
      newValue=12;
    }
    else if(pos==n){
      newValue =14;
    }
    else if(pos==n-1){
      newValue=50;
    }
    //shift the values;
    for(i=(n-1);i>=(pos-1);i--){//i=4 4>1
      a[i+1]=a[i];
    }
    a[pos-1]=newValue;
    System.out.println("after insertion");
    for(int j=0;j<a.length;j++){
      System.out.println("a["+j+"]="+a[j]);
    }
  }
}