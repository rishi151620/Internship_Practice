import java.util.*;
class Upper{

  public static void main(String[] args) {

      Scanner sc=new Scanner(System.in);
      System.out.print("enter the character : ");

      char ch=sc.next().charAt(0);

      if(ch >= 'A' && ch <= 'Z')
            System.out.println(ch + " is an uppercase .");
      else
            System.out.println(ch + " is small case");
    }
}