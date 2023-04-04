import java.util.*;
class listdemo{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    List<String> fruits=new ArrayList<String>();
    fruits.add("orange");
    fruits.add("apple");
    fruits.add("banana");
    fruits.add("pineapple");
    int count=0;
    int index=0;
    for(String str:fruits){
      if(str.equals("apple")){
        count++;
        index=fruits.indexOf("apple");
        break;
      }
    }
    if(count==1)
      System.out.println("fruit found at position "+index);
    else 
      System.out.println("fruit not found");
  }
}