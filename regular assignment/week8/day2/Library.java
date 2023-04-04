import java.util.*;
class Book{
  private String title,author,publisher;
  private int bNo;
  Book(String title,String author,String publisher,int bNo){
    setTitle(title);
    setAuthor(author);
    setPublisher(publisher);
    setBookNo(bNo);
  }
  void setTitle(String title){
    this.title=title;
  }
  void setAuthor(String author){
    this.author=author;
  }
  void setPublisher(String publisher){
    this.publisher=publisher;
  }
  void setBookNo(int bNo){
    this.bNo=bNo;
  }
  String getTitle(){
    return title;
  }
  String getAuthor(){
    return author;
  }
  String getPublisher(){
    return publisher;
  }
  int getBookNo(){
    return bNo;
  }
}
public class Library{
  public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    ArrayList<Book> books=new ArrayList();
    for(int i=0;i<3;i++){
      books.add(new Book(sc.next(),sc.next(),sc.next(),sc.nextInt()));
    }
    for(Book i:books){
      System.out.println(i.getBookNo()+" "+i.getAuthor()+" "+i.getTitle()+" "+i.getPublisher());
    }
  }
}