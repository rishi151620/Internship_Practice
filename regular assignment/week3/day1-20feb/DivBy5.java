class DivBy5{
  public static void main(String args[]){
    int i=1;
    System.out.println("numbers divisible by 5 are :");
    while(i<=100){
      if(i%5==0)
        System.out.println(i);
      i=i+1;
    }
    System.out.println("exit");
  }
}