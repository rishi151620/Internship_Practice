import java.util.Scanner;
class Password{
public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  String password,userInput;
  password="rishi1516";
  System.out.println("Enter the password :");
  userInput=sc.next();
  if(userInput.equals(password))
    System.out.println("Access Granted ");
  else
    System.out.println("Access Denied ");
}
}