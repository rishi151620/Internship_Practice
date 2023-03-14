// 1. String Replacer: Create an application that takes a string and a word as input and replaces all occurrences of the word with another word. Use strings to manipulate the input string.
import java.util.*;
class ReplacerString{
  static void replacestring(String st,String word,String replace){
    String str1=st.replace(word,replace);
    System.out.println(str1);
  }
  public static void main(String args[]){
    Scanner sc=new Scanner (System.in);
    System.out.println("enter the string :");
    String str = sc.nextLine();
    System.out.println("enter the word you want to replace ");
    String w=sc.next();
    String rep=sc.next();
    replacestring(str,w,rep);
    
  }

  




  
}