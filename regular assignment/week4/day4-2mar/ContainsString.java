class ContainsString{
  static void containString(String str){
    System.out.println(str.contains("do you know"));
    boolean iscontains=str.contains("do you know");
    System.out.println(iscontains);
  }
  public static void main(String args[]){
    String st="what do you know about me ";
    containString(st);
  }
}