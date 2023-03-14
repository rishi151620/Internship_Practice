import java.util.*;
class VowelsInSubstring{
 
  static void checkSubString(String str1,String subString ){
    if(str1.contains(subString)){
      for(int i=0;i<subString.length();i++){
        if(subString.charAt(i)=='a'||subString.charAt(i)=='e'||subString.charAt(i)=='i'||subString.charAt(i)=='o'||subString.charAt(i)=='u'){
          System.out.println("found vowel "+subString.charAt(i) +" at position "+i);
        }
      }
      
        
    }
    else{
      System.out.println("invalid");
    }
  }
 
  
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String str1,subString;
    System.out.println("enter string1"); 
   str1=sc.nextLine();
    System.out.println("enter substring"); 
  subString=sc.nextLine();
    
    checkSubString(str1,subString);
    
  }
}