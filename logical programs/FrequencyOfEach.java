import java.util.*;
class FrequencyOfEach{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the string ");
    String str=sc.nextLine();
    char a[]=str.toCharArray();
    int frequency[]=new int[str.length()];  
    
    for(int i=0;i<str.length();i++){
      frequency[i]=1;
      for(int j=i+1;j<str.length();j++){
        if(a[i]==a[j]){
          frequency[i]++;
          a[j]='0';
        }
          
      }
    }
    
    for(int i=0;i<frequency.length;i++){
      if(a[i]!=' ' && a[i]!='0'){
        System.out.println(a[i]+" : "+frequency[i]);
      }
    }
  }
}