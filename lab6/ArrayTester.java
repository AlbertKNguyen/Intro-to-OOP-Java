// Albert Nguyen
// Albertnguyen@my.smccd.edu
// CIS 254 ON 
// ArrayTester.java
// Arrays and array lists with for loops to display and identify the largest and smallest number in array
// Lab 6
// 7/24/17

import java.util.Scanner;
public class ArrayTester {
    
    public static void main(String [] args) {
        
        int[] array = new int[10]; // declares array with 10 integer elements
        
        System.out.println("Enter 10 integers");
        
        // prompts user for 10 numbers and initializes the number into array
        for (int counter = 0; counter < array.length; counter++){ 
            System.out.printf("Number %d: ",counter+1);
            Scanner input = new Scanner(System.in);
            int index = input.nextInt();
            array[counter] = index;
        }
        
        System.out.printf("%n%s%10s%n%s%n", "Index", "Number", "----------------"); // label
        
        // displays array with corresponding array index
        for(int indexCount = 0; indexCount < array.length; indexCount++){ 
            System.out.printf("%3d%11d%n", indexCount, array[indexCount]);
        }
            
        int largest = array[0];
        int smallest = array[0];
        for(int value : array){
            if (value > largest){
                largest = value;
            }
            if (value < smallest){
                smallest = value;
            }
        }

        System.out.printf("\nSmallest Number: %d", smallest); // displays smallest number
        System.out.printf("\nLargest Number: %d", largest);  // displays largest number
        System.out.println("\n\nProgrammed by Albert Nguyen"); // prints name
    }

}