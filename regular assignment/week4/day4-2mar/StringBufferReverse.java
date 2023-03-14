class StringBufferReverse{
  public static void main(String args[]){
    StringBuffer str= new StringBuffer();
    
    str.append("string buffer is muatable we can modify the string ");
    System.out.println(str);
    StringBuffer rev=str.reverse();
    System.out.println(rev);
  }
}