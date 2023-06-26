
class SumFirstLast{
  public static void main(String args[]){
    int num=1234;
    int lastdigit=num%10;
    int firstdigit=0;
     while(num>10){//12
       //firstdigit=num%10;//1
       
       num=num/10;//1
   }
    firstdigit=num;
    System.out.println(firstdigit+lastdigit);
  }
}