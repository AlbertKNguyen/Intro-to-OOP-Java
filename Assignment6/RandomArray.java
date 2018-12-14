// Albert Nguyen
// Albertnguyen@my.smccd.edu
// CIS 254 ON 
// RandomArray.java
// Randomly generated integers (1-100) into array and bubble sorted, algorithms to find duplicate integers and missing integers
// Assignment 6
// 7/26/17

import java.security.SecureRandom;
public class RandomArray {
        
    public static void main(String [] args) {
        
        int[] array = new int[100]; // declares array with 100 integer elements
        SecureRandom random = new SecureRandom();
        
        // generates random numbers into array (1-100)
        for (int counter = 0; counter < array.length; counter++){ 
             array[counter] = random.nextInt(100) + 1;
        }
        
        bubbleSort(array); // sorts array in ascending order
        System.out.println("Sorted Array"); // prints label
        
        // displays the array in a 10 x 10
        for (int counter = 0; counter < array.length; counter++){ 
            System.out.printf("%4d",array[counter]);
            // goes to new line every 10 numbers
            if ((counter +1) % 10 == 0){ 
                System.out.println();
            }
        }
        
        System.out.printf("%n%s%7s", "Duplicates", "Count"); // prints label
        
        int[] counts = new int[101];// new counts array
        
        // matches index number to the integer and the array value is the count of the integer appearing in the array
        for (int num : array){
            counts[num]++;      
        }        
        
        // displays the duplicate number and its count
        for (int counter = 0; counter < array.length; counter++){ 
            if (counts[counter + 1] >= 2){
                System.out.printf("%n%5d%10d", counter + 1, counts[counter + 1]);
            }   
        }
        
        System.out.println("\n\nMissing Numbers"); // prints label
        
        int prints = 0;
        for (int counter = 1; counter < array.length; counter++){
            // prints the numbers whose count is 0 and goes to new line every 5 numbers
            if (counts[counter] == 0){
                if (prints % 5 == 0 && prints != 0){
                    System.out.println();
                }
                System.out.printf("%4d", counter);
                prints++;
            }
        }
        
        System.out.println("\n\nProgrammed by Albert Nguyen"); // prints name

    } // end main method         

    
       // sort elements of array with bubble sort
   public static void bubbleSort( int [] data )
   {
      // loop for data.length - 1 passes
      for ( int pass = 1; pass < data.length; pass++ )
      { 
        // loop over elements in array 
        for ( int index = 0; index < data.length - 1; index++ )
        {
            // swap adjacent elements if first is greater than second 
            if ( data[ index ] > data[ index + 1 ] )
            { 
                       int temporary = data[ index ]; // store in temporary 
                       data[ index ] = data[ index + 1 ]; // replace first 
                       data[ index + 1 ] = temporary; // replace second
            } 
         } // end inner for
      } // end outer for 
   } // end method bubbleSort

} // end class RandomArray

