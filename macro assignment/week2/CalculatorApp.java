import java.util.Scanner;
class CalculatorApp{
    public static void main (String args[]){
      double a,b,result;
      char operator;
      Scanner sc= new Scanner (System.in);
        System.out.println("enter the two numbers : ");
        a=sc.nextDouble();
        b=sc.nextDouble();
        System.out.println("enter the operator");
        operator = sc.next().charAt(0);

        switch(operator){
          case '+':
            result = a + b;
            System.out.println(a+" "+"+"+" "+ b +" = " +result);
            break;
          case '-':
            result = a - b;
            System.out.println(a+" "+"-"+ b+" " +" = " +result);
            break;
          case '*':
            result = a * b;
            System.out.println(a+" "+"*"+ " "+ b +" = " +result);
            break;
          case '%':
            result = a % b;
            System.out.println(a+" " +"%"+" "+ b +" = " +result);
            break;
          case '/':
            result = a / b;
            System.out.println(a +" "+"/"+" "+ b +" = " +result);
            break;
          default:
            System.out.println("invalid operator");
            break;
        }
          
            
        }
        
        
        
    }
