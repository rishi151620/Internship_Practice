class MaxNumber{
  static int max(){
    int a=2,b=7;
    if(a>b)
      return a;
    else 
      return b;
  }
  public static void main(String args[]){
    int m = MaxNumber.max();
    System.out.println(m);
  }
}