// Albert Nguyen
// Albertnguyen@my.smccd.edu
// CIS 254ON 
// Calculate.java
// Prompts user for two integers and outputs various print statesments stating the answers of the calcutions done between the two integers
// Assignment 1
// 6/22/17 
import java.util.Scanner;
public class Calculate {
   public static void main( String args[] ) {
      System.out.println("Programmed by Albert Nguyen");
      int firstInt; 
      int secondInt; 
      Scanner input = new Scanner(System.in); 
      System.out.print("Input first integer: ");  
      firstInt = input.nextInt(); // Has user input an integer which will initialize the first integer variable "firstNumber"
      System.out.print("Input second integer: ");       
      secondInt = input.nextInt(); // Has user input an integer which will initialize the second integer variable "secondNumber"
      int sum = firstInt + secondInt; 
      System.out.println("The sum is equal to " + sum); 
      int diff = Math.abs(firstInt - secondInt); 
      System.out.println("The difference is equal to " + diff); 
      int prod = firstInt * secondInt; 
      System.out.println("The product is equal to " + prod); 
      int quot = firstInt / secondInt; 
      System.out.print("The quotient is equal to " + quot); 
      int rem = firstInt % secondInt; 
      System.out.println(" with a remainder equal to " + rem); 
      if (firstInt > secondInt) { // if statement to calculate if first integer is greater than the second integer 
      System.out.println(firstInt + " is greater than " + secondInt); // If the if statement is true, it will print statement
      }
      else if (firstInt < secondInt){ // Does the opposite of the if statement by calculating whether the second integer is greater than the first integer 
      System.out.println(secondInt + " is greater than " + firstInt); // If the else if statement is true, it will print statement
      }
      else { // else statement which will be true if the if and else if statements are not true
      System.out.println(firstInt + " is equal to " + secondInt); // If true, it will print statement
      }
   }
}
 