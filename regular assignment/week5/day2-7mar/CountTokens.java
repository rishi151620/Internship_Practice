import java.util.StringTokenizer;
class CountTokens{
  public static void main(String args[]){
    StringTokenizer s = new StringTokenizer("Welcome to bitlabs");
    // int count=0;
    // while(s.hasMoreTokens()){
    //   System.out.println(s.nextToken());
    //   count++;
    // }
    // System.out.println("no. of tokens = "+count);
    System.out.println("no. of tokens = "+s.countTokens());
  }
}