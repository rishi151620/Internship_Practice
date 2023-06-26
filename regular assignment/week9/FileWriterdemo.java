import java.io.FileOutputStream;
import java.io.FileWriter;
class FileWriterdemo{
  public static void main(String args[]){
    try{
      FileWriter fw=new FileWriter("prime.txt");
      fw.write("i am optimus prime  ");
      fw.close();
    }
    catch(Exception e){
      System.out.println(e);
    }
    // try{
    //   FileOutputStream fw=new FileOutputStream("xyz.txt");
    //   String str="hi hello how are you";
    //   byte bytes[]=str.getBytes();
      
    //   fw.write(bytes);
    //   fw.close();
    // }
    // catch(Exception e){
    //   System.out.println(e);
    // }
    
  }
}