class StringInsert{
  public static void main(String args[]){
    StringBuffer str= new StringBuffer();
    
    str.append("string buffer is muatable we can modify the string ");
    System.out.println(str);
    System.out.println(str.lastIndexOf("m"));
     System.out.println(str.insert(32," not "));
  }
}