class StringSplit{
  static void splitString(String str){
    String word[]=str.split("@",3);
    for(int i=0;i<word.length;i++){
      System.out.println(word[i]);
    }
    
  }
  public static void main(String args[]){
    splitString("rishab@banjan@joseph");
  }




  
}
  