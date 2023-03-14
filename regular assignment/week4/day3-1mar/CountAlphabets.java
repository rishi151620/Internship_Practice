import java.util.*;
class CountAlphabets{
  static void characterCount(String str){
    char ch[]=str.toCharArray();
    int acount=0,dcount=0,scount=0;
    char alpha=0;int dig=0;char specl=0;
    for(int i=0;i<ch.length;i++){
      if((ch[i]>='a'&&ch[i]<='z')||(ch[i]>='A'&&ch[i]<='Z'))
      {
        acount++;
        alpha=ch[i];
      }
      else if(ch[i]>='0'&&ch[i]<='9'){
        dcount++;
        dig=ch[i];
      }
      else{
        scount++;
        specl=ch[i];
      }
  
    }
    System.out.println("alphabets "+acount+" they are "+alpha);
    System.out.println("digits "+dcount+" they are "+dig);
    System.out.println("specila character "+scount+" they are "+specl);
  }
 
  
  
  public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  String str1;
  System.out.println("enter string"); 
  str1=sc.nextLine();
  characterCount(str1);
    
   
    
  }
}