// Albert Nguyen
// Albertnguyen@my.smccd.edu
// CIS 254 ON 
// Validation.java
// do while loop to force user to enter number in range and a for loop to print out the numbers from 1 to the input number and their cubes
// Lab 4
// 7/8/17

import java.util.Scanner;
public class Validation {
    public static void main( String args[] ) {
    
    int userNumber;
    int numberCubed = 1;
    Scanner input = new Scanner(System.in);-1
    
    
    // prompts user to enter a number until it is within the range
    do {
        System.out.print("Enter a number (1-20): "); 
        userNumber = input.nextInt();
    }   while (!(userNumber >=1 && userNumber <= 20));
     
    // prints label
    System.out.printf("%n%s %7s %n","Number" ,"Cube");
    
    // prints from the number 1 to the user number and their cubes
    for (int n = 1; n <= userNumber; n ++){
        numberCubed = n * n * n;
        System.out.printf("%3d %8d %n",n ,numberCubed);
    }    
    
    // prints name
    System.out.println("\nProgrammed by Albert Nguyen");
    
    }
}