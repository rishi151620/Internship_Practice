// Temperature Converter: Create an application that takes a temperature in Celsius or Fahrenheit as input and converts it to the other unit. Use conditional statements to determine whether to convert from Celsius to Fahrenheit or vice versa.

import java.util.Scanner;
class Temperature{
 public static void main(String args[]){
  double celcius;
  Scanner sc = new Scanner(System.in);
  System.out.print("enter the farenheit temperature : ");
  double fahr=sc.nextDouble();

  celcius=(fahr-32)*5/9;

  System.out.println("after converting to celcius : "+celcius);

  


   
 }
}
  