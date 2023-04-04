import java.util.*;

public class EmptyElements{
  public static void main(String args[]){

    ArrayList<Integer>list=new ArrayList<Integer>();
    list.add(10);
    list.add(20);
    list.add(30);

    list.clear();

    System.out.println("Empty ArrayList:"+list);
  }
}
