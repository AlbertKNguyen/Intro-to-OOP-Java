// Albert Nguyen
// Albertnguyen@my.smccd.edu
// CIS 254 ON 
// MultiplicationTable.java
// nested for loops and printf statements to formate a multiplication table
// Assignment 4
// 7/11/17

public class MultiplicationTable {
    public static void main(String[] args) {
    // prints the label
    System.out.println("                   Multiplication Table");
    System.out.print("     ");
    //prints the column numbers
    for(int columnNumber = 1; columnNumber <= 12; columnNumber++) {
        System.out.printf("%4d", columnNumber);
    }
    // prints line of dashes under column numbers
    System.out.println("\n-----------------------------------------------------");
    int product = 0;
    // prints each line
    for(int rowNumber = 1; rowNumber <= 12; rowNumber++) { // controls row number
        // prints the row numbers
        System.out.printf("%2d %2s", rowNumber, "|");        
        // prints the products on each line
        for (int columnNumber = 1; columnNumber <= 12; columnNumber++) { // controls column number
            product = rowNumber * columnNumber;        
            System.out.printf("%4d", product); 
        }   
        // goes to next row
        System.out.println();
    }
    // prints name    
    System.out.println("\nProgrammed by Albert Nguyen");   
    }
}   

