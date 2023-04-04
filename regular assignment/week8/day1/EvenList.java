import java.util.*;
class EvenList{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    List<Integer> num=new ArrayList<Integer>();
    System.out.println("enter the elements :");
    for(int i=0;i<5;i++){
      num.add(sc.nextInt());
    }
    System.out.print("even numbers are : ");
    for(Integer i:num){
      if(i%2==0){
        System.out.print(i+"\t");
        
      }
    }
  }
}