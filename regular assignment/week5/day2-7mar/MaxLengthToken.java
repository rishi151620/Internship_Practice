import java.util.StringTokenizer;
class MaxLengthToken{
  public static void main(String args[]){
    StringTokenizer s =new StringTokenizer("welcome to hell");
    int max=0;
    while(s.hasMoreTokens()){
      String str=s.nextToken();
      if(str.length()>max){
        max=str.length();
        System.out.println("maximum length token is "+str+" and its length is "+max);
      }
    }
  }
}