class ToCharArray{
  static void charArray(String str){
    char a[]=str.toCharArray();
    for(int i=0;i<a.length;i++)
      System.out.println(a[i]);
  }
  public static void main(String args[]){
    charArray("rishab banjan");
  }
}