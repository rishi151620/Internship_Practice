import java.util.*;
class Week {

  public static void main(String[] args) {
      int weeknum;
      Scanner sc=new Scanner(System.in);
      System.out.print("enter the weeknum(1-7) : ");
      weeknum=sc.nextInt();
      if(weeknum==1)
        System.out.println("monday");
      else if (weeknum==2)
        System.out.println("tuesday");
      else if (weeknum==3)
        System.out.println("wednesday");
      else if (weeknum==4)
        System.out.println("thursday");
      else if (weeknum==5)
        System.out.println("friday");
      else if (weeknum==6)
        System.out.println("satday");
      else if (weeknum==7)
        System.out.println("sunday");
  } 
}