import java.util.Scanner;

class StrongNum {
  public static void main(String[] args) {
    int num,rem=0,sum=0,fact=1,temp;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    num = sc.nextInt();
    temp=num;
    while(num!=0){
      rem=num%10;
      fact=1;
      for(int i=1;i<=rem;i++){
        fact=fact*i;
      }
      sum=sum+fact;
      num=num/10;
      
    }
    System.out.println(sum);
    if(temp==sum)
      System.out.println(temp+" "+"is a strong number");
    else
      System.out.println(temp+" "+"is not a strong number");
    
  }
}