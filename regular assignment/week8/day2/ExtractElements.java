import java.util.LinkedHashSet;

public class ExtractElements{
  public static void main(String args[]){

    LinkedHashSet<String>list=new LinkedHashSet<String>();
    list.add("green");
    list.add("yellow");
    list.add("black");
    list.add("green");
    list.add("blue");

   // List<Integer>subList=list.subList(1,4);
    
    System.out.println("subList:"+list);
  }
}