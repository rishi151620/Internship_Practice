//5.A user is logging into a website. They can use their email address or username to log in. If they use their email address, their email will be validated. If they use their username, their username will be validated.
 
import java.util.Scanner;
class Email{
    public static void main (String args[]){
        Scanner sc= new Scanner (System.in);
        String input;
        System.out.println("Please enter username/email");
        input = sc.next();
        System.out.println("Verifying");
        if (input.equals("username") || userinput.equals("user@gmail.com"))
            System.out.println("Access Granted");
        else
            System.out.println("Access Denied");
    }
}