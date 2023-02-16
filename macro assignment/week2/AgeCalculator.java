// Age Calculator  :  Create an application that takes a person's birthdate as input and calculates their current age. Use conditional statements to determine if they are a minor or an adult.
import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;

class AgeCalculator{
  public static void main(String args[]){
    Scanner sc=new Scanner (System.in);
    System.out.print("enter the birthyear : ");
    String birthdate=sc.next();
    LocalDate today=LocalDate.now();
    System.out.println(" today date is "+today);
    DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    LocalDate birth_date = LocalDate.parse(birthdate,dateFormat);
    Period age=Period.between(birth_date, today);
    System.out.println("age of the person : "+age.getYears());

    if(age.getYears()>=18)
      System.out.println("the person is adult");
    else
      System.out.println("the person is minor");
    
    
    
    
    
    
    
    
    
    
  }
}