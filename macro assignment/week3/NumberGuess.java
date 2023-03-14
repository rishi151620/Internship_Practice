// 1. Number Guessing Game: Create a number guessing game where the user has to guess a randomly generated number within a certain range. Use loops to repeatedly prompt the user for a guess and conditional statements to check if the guess is correct.
// Number Guesser: Create a number guessing game where the computer generates a random number and the user has to guess it. if user Guess is incorrect, then give hints (weather the actual number is less than/ greater than guess number).


import java.util.Random;
import java.util.*;
class NumberGuess{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    Random ran=new Random();
    int ranNum=ran.nextInt(100);
    int guess=0;
    System.out.println("random number is "+ranNum);
    
    while(true){
      
      if(guess!=ranNum){
        System.out.println("enter the number");
        guess=sc.nextInt();
        if(guess<ranNum)
          System.out.println("guess is smaller than random number\n");
        else if (guess>ranNum)
          System.out.println("guess number is larger than random number\n");
      }
      else{
        System.out.println("guessed number is correct ");
        break;
      }

    }
        
        
        
    
  }
}