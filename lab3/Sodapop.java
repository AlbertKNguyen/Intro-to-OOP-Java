// Albert Nguyen
// Albertnguyen@my.smccd.edu
// CIS 254 ON 
// SodaPop.java
// While loop and printf statements to print numbers 1 - 100, printing certain words instead of numbers if number is divisible by 3 or 5 or both
// Lab 3
// 7/3/17 

public class Sodapop{
    public static void main( String[] args )  {
        int x = 1; //Declares and initializes x to  1 for loop
        while (x < 101){ //While loop for numbers 1 - 100
            if (x % 3 == 0 && x % 5 == 0) //If divisible by 3 and 5
                System.out.printf("%5s", "*SP*");
            else if (x % 3 == 0) //If divisible by 3 
                System.out.printf("%5s", "Soda");
            else if (x % 5 == 0) //If divisible by 5 
                System.out.printf("%5s", "Pop");
            else //If not divisible by 3 or 5
                System.out.printf("%5d", x);
            if (x % 10 == 0)//Move the next set of print statements every 10 numbers
                System.out.println();
            x += 1; //Adds 1 to x at end of loop
            
        }        
        System.out.println();
        System.out.println("Programmed by Albert Nguyen"); //Print name
    w