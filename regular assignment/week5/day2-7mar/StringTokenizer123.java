import java.util.StringTokenizer;
class StringTokenizer123{
  public static void main(String args[]){
    StringTokenizer s = new StringTokenizer("Welcome to bitlabs");
    while(s.hasMoreTokens()){
      System.out.println(s.nextToken());
    }
  }
}