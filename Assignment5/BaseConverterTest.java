// Albert Nguyen
// Albertnguyen@my.smccd.edu
// CIS 254 ON 
// BaseConverterTest.java
// Calls for methods from BaseConverter.java to display binary and hexidecimal of the user inputted number
// Assignment 5
// 7/19/17

import java.util.Scanner;
public class BaseConverterTest {
    public static void main( String[] args )  {
        
        Scanner input = new Scanner(System.in);
        long decimal = 0;   
        
        while (decimal >= 0){ // prompts user to enter number
            System.out.print("\n\nEnter a non-negative number to convert to binary and hexadecimal (-1 to quit): ");
            decimal = input.nextLong();  
            
            if (decimal < 0){ // does not convert to binary and hexidecimal if negative and exits while loop
            }
           
            else{ // prints binary and hexidecimal
                String binaryString = BaseConverter.convertToBinary(decimal);
                System.out.printf("%nDecimal: %d%n%nBinary: %s%n", decimal, binaryString);
                String hexString = BaseConverter.convertToHexadecimal(decimal);
                System.out.printf("%nHexadecimal: %s", hexString);
            }
        }
    System.out.println("\nProgrammed by Albert Nguyen"); // prints name
    }
}  