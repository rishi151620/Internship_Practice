// 13. WAP to input marks of five subjects Physics, Chemistry, Biology,     Mathematics and Computer. Calculate percentage and grade according to     following:
//     Percentage >= 90% : Grade A
//     Percentage >= 80% : Grade B
//     Percentage >= 70% : Grade C
//     Percentage >= 60% : Grade D
//     Percentage >= 40% : Grade E
//     Percentage < 40% : Grade F
import java.util.*;

class PercentGrade{
  public static void main(String args[]){
    int phy,chem,bio,math,com;
    double perc;
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the marks of physics : ");
    phy=sc.nextInt();
    System.out.print("enter the marks of chemistry : ");
    chem=sc.nextInt();
    System.out.print("enter the marks of biology : ");
    bio=sc.nextInt();
    System.out.print("enter the marks of mathematics : ");
    math=sc.nextInt();
    System.out.print("enter the marks of computer : ");
    com=sc.nextInt();
    perc=((phy+chem+bio+math+com)*100)/500;
    System.out.println("percentage = "+perc);
    if( perc >= 90)
      System.out.println("garde A");
    else if (perc>=80)
      System.out.println("grade B ");
    else if (perc>=70)
      System.out.println("grade C");
    else if (perc>=60)
      System.out.println("grade D");
     else if (perc>=40)
      System.out.println("grade E");
     else if (perc<40)
      System.out.println("grade F");
  }
}
