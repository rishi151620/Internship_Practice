import java.util.*;
class Book{
  String title;
  String author;
  int year;
  Book(String a,String b,int x){
    title=a;
    author=b;
    year = x;
  }
  void display(){
    System.out.println("The title of the book "+title);
    System.out.println("The author of the book is  "+author);
    System.out.println("the year the book was launched: "+year);
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Book Information :");
    Book ab[] = new Book[2];
    for(int i=0;i<2;i++){
      System.out.println("Enter the book "+(i+1)+" detail");
      System.out.println("Enter the title of yhe book :");
      String q = sc.next();
      System.out.println("Enter the author name  :");
      String w = sc.next();
      System.out.println("Enter the year Book was launched   :");
      int m = sc.nextInt();
      ab[i]= new Book(q,w,m);
    }
    System.out.println(" information of the book is given below\n********\n");
    for(int i=0;i<2;i++){
      ab[i].display();
    }
  }
}
