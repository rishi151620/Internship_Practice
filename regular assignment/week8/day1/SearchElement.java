import java.util.*;
import java.util.ArrayList;

class SearchElement{
  public static void main(String args[]){
    ArrayList<Integer> num=new ArrayList<>();
    Scanner sc=new Scanner(System.in);
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
    numbers.add(4);
    numbers.add(5);
    System.out.println("Enter the element to search for:");
    int element=sc.nextInt();
    int index=num.indexOf(element);

    if(index!=-1){
      System.out.println("Element found at index:"+index);
    }
    else{
      System.out.println("Element not found");
    }
  }
}

