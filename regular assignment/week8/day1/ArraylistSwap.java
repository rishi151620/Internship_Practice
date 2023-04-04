import java.util.*;
import java.util.Collections;

class SwapElement{
  public static void main(String args[]){

    ArrayList<Integer>list=new ArrayList<Integer>();
    list.add(10);
    list.add(20);
    list.add(30);
    list.add(40);
    list.add(50);
    Collections.swap(list,1,3);
    
    System.out.println("Swapped ArrayList:"+list);
  }
}