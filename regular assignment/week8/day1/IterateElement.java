import java.util.*;
public class IterateElement{
  
  public static void main(String args[]){

    ArrayList<Integer>numbers=new ArrayList<Integer>();

    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
    numbers.add(4);
    numbers.add(5);

    for(int i=0;i<numbers.size();i++){
      System.out.println(numbers.get(i));
    }
  }
}