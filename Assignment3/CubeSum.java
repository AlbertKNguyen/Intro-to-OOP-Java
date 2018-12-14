// Albert Nguyen
// Albertnguyen@my.smccd.edu
// CIS 254 ON 
// CubeSum.java
// while loop program containing if statements to check all three-digit numbers, displaying those that are equal to the sum of the cube of each of the three digits of the number
// Assignment 3
// 7/5/17

public class CubeSum{
    public static void main( String[] args )  {
    // declares integer variables and initializes the three-digit number and each individual digit of that number
    int threeDigits = 100; //three-digit number
    int firstDigit = 1; // first digit(hundreds place)
    int secondDigit = 0; // second digit(tens place)
    int thirdDigit = 0; // third digit(ones place0
    // declares the integer variables that are the cube of each individual digit and cube sum
    int firstCube, secondCube, thirdCube, cubeSum;
    
    System.out.println("The three-digit numbers that are equal to the sum of each digit cubed are: "); 
    
    // while loop to check for all three digits number
    while (threeDigits > 99 && threeDigits < 1000){       
        
        // initializes integer variables to the values of the cube of each digit and the cube sum 
        firstCube = firstDigit * firstDigit * firstDigit;
        secondCube = secondDigit * secondDigit * secondDigit;
        thirdCube = thirdDigit * thirdDigit * thirdDigit;
        cubeSum = firstCube + secondCube + thirdCube;
        
        // will print the three-digit number if it is equal to its cube sum 
        if (threeDigits == cubeSum){   
            System.out.print(threeDigits + " ");
        }
        
        threeDigits ++; // increase the three-digit number by 1
        thirdDigit ++;  // increase the individual third digit by 1
        // when the third digit is equal to 10 it will carry over the 1 to the individual second digit by adding 1 to it and change the third digit to 0
        if (thirdDigit == 10){
            secondDigit ++;
            thirdDigit = 0;
        }
        // when the second digit is equal to 10 it will carry over the 1 to the individual first digit by adding 1 to it and change the second digit to 0
        if (secondDigit == 10){
            firstDigit ++;
            secondDigit = 0;
        }
    
    }// end of while loop
    
    // prints name in next line
    System.out.println();
    System.out.println("Programmed by Albert Nguyen");
    
    }

} 