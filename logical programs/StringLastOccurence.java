// WAP to find first occurrence of a character in a given string.
import java.util.Scanner;
class StringLastOccurence{
  public static void main(String args[]){
    String s="hello my name is rishab ";
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the element of which last occurence you want ");
    char s1=sc.next().charAt(0);
    int index=0;
    for(int i=0;i<s.length();i++){
      if(s.charAt(i)==s1){
        index=i;
      }
    }
    System.out.println("last occurence of "+s1+" is at index "+index);
  }
}