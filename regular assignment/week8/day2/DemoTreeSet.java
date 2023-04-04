import java.util.TreeSet;

public class DemoTreeSet{
  public static void main(String args[]){

    TreeSet<String>list=new TreeSet<String>();
    list.add("green");
    list.add("yellow");
    list.add("black");
    list.add("green");
    list.add("blue");

    // List<Integer>subList=list.subList(1,4);
    //acsending order will be displayed
    System.out.println("subList:"+list);
  }
}