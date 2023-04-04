import java.util.*;
class ListIndex{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    List<Float> list=new ArrayList<Float>();
    for(int i=0;i<4;i++){
      list.add(sc.nextFloat());
    }
    System.out.println(list);
    System.out.println(list.get(2));
    list.set(1,23.45f);
    list.remove(0);
    System.out.println(list.indexOf(45.67f));
    System.out.println(list);
  }
}

    
    
