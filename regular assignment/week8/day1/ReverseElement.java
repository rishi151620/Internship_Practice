import java.util.*;
import java.util.Collections;

public class ReverseElement{
  public static void main(String args[]){

    ArrayList<Integer>list=new ArrayList<Integer>();
    list.add(10);
    list.add(20);
    list.add(30);
    list.add(40);
    list.add(50);

    for(int i=0,j=list.size()-1;i<j;i++;j--){
      int temp=list.get(i);
      list.set(i,list.get(j));
      list.set(j,temp);
    }
    System.out.println("Reversed ArrayList:"+list);
  }
}