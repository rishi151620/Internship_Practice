// Write a Java program to create a new array list, add some colors (string) and print out the collection
// Write a Java program to iterate through all elements in a array list
// Write a Java program to insert an element into the array list at the first position
// Write a Java program to retrieve an element (at a specified index) from a given array list.
// Write a Java program to update specific array element by given element
// Write a Java program to remove the third element from a array list
// Write a Java program to sort a given array list
// Write a Java program to shuffle elements in a array list

import java.util.*;
class ListColour{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    List<String> list=new ArrayList<String>();
    System.out.println("enter the colors :");
    for(int i=0;i<4;i++){
      list.add(sc.next());
    }
    System.out.println(list);
    list.add(1,"brown");
    System.out.println("after inserting new colour at 1");
    System.out.println(list);
    for(String i:list){
      System.out.println(i);
    }
    System.out.println("color at position 2 is "+list.get(2));
    System.out.println("after updating the colour at position 3");
    list.set(3,"violet");
    System.out.println(list);
    list.remove(2);
    System.out.println("after removing color at 2 "+list);
    Collections.shuffle(list);
    System.out.println("suffled list is "+list);
    Collections.sort(list);
    System.out.println("sorted list is "+list);
    
  }
}