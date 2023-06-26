// Write a Java class called Person that has fields for the person's name and age. Write a custom Comparator implementation called AgeComparator that sorts Person objects in ascending order based on their age. Then, modify the Person class to implement the Comparable interface, so that Person objects are sorted first by age (ascending order), and then by name (alphabetical order). Test your implementation by creating a list of Person objects and sorting them using both the AgeComparator and the Comparable implementation.
import java.util.*;
class Person implements Comparable<Person>{
  private String name;
  private int age;

  Person(int age,String name){
    this.age=age;
    this.name=name;
  }
  public int getAge(){
    return age;
  }
  public String getName(){
    return name;
  }
   public int compareTo(Person p) {
    if (age < p.getAge()) {
      return -1;
    } else if (age > p.getAge()) {
      return 1;
    } else {
      return name.compareTo(p.getName());
    }
  }
}
class AgeComparator implements Comparator<Person>{
  public int compare(Person p1,Person p2){
    if(p1.getAge()>p2.getAge())
      return 1;
    else if (p1.getAge()<p2.getAge())
      return -1;
    else
      return 0;
  }
}
class PersonComparator{
  public static void main(String args[]){
    Scanner sc=new Scanner (System.in);
    ArrayList<Person> pt=new ArrayList<Person>();
    System.out.println("enter the name age of the people");
    for(int i=0;i<3;i++){
      pt.add(new Person(sc.nextInt(),sc.next()));
    }
    Collections.sort(pt);
    System.out.println("after sorting according to age and name ");
    for(Person i:pt){
      System.out.println(i.getName()+" : "+i.getAge());
    }
    Collections.sort(pt,new AgeComparator());
    System.out.println("after sorting just by age ");
    for(Person i:pt){
      System.out.println(i.getName()+"  : "+i.getAge());
    }
  }
}