// Create a class named "Calculator" with three methods named "add" with first method takes two parameters of int type. Second add method takes 2 paramters of double type and third add method takes 3 parameters of first two parameters of int and third parameters of long and perform addition operation in each method.
import java.util.Scanner;
class Add
{
  public void sum(int a,int b)
  {
    System.out.println("Sum 1="+(a+b));
  }
  public void sum(double a,double b)
  {
    System.out.println("Sum 2="+(a+b));
  }
  public void sum(int a,int b,long c)
  {
    System.out.println("Sum 3="+(a+b+c));
  }
}
class Calculator
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    Add s1 =new Add();
    System.out.println("enter the two numbers ");
    s1.sum(sc.nextInt(),sc.nextInt());
    System.out.println("enter the two numbers in doubles ");
    s1.sum(sc.nextDouble(),sc.nextDouble());
    s1.sum(10,20,39846783);
  }
}
