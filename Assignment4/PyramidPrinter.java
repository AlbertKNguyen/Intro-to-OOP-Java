// Albert Nguyen
// Albertnguyen@my.smccd.edu
// CIS 254 ON 
// PyramidPrinter.java
// nested for loops and using Math.pow and printf to format a pyramid of numbers that are powers of 2
// Assignment 4
// 7/11/17

public class PyramidPrinter {
    public static void main(String[] args) {
    int rowNumber = 1; 
    int heightOfPyramid = 8;
    // control how high pyramid is or how many rows there are
    for (int i = heightOfPyramid; i > 0; i--) {
        // format the empty spaces left of pyramid
        for (int j = 1; j <= i*4; j++){
            System.out.print(" ");
        }
        int exponentPower = 0;
        int powerNumber = 0;
        // left side of pyramid
        for (int j = 1; j <= rowNumber ; j++) { // controls how many numbers are printed  
            powerNumber = (int)Math.pow(2,exponentPower);
            System.out.printf("%4d", powerNumber); // prints the number
            exponentPower++;
                
        }
        int exponentPower2 = rowNumber - 1;
        int powerNumber2 = 0; 
        // rightside of pyramid
        for (int j = rowNumber; j > 1; j--) { // control how many numbers are printed
            exponentPower2--;
            powerNumber2 = (int)Math.pow(2,exponentPower2); // prints the number
            System.out.printf("%4d ",powerNumber2);
               
        }
        // goes to next row and adds a space
        System.out.println();
        System.out.println();
        
        rowNumber++;
    }
    System.out.println("\nProgrammed by Albert Nguyen");
    }
}                 