class GetBytes{
  static void getbytes(String str){
    byte b[]=str.getBytes();
    for(int i=0;i<b.length;i++){
      System.out.println(b[i]);
    }
  }
  public static void main(String args[]){
    getbytes("rishab");
  }






  
}