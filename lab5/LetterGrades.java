// Albert Nguyen
// Albertnguyen@my.smccd.edu
// CIS 254 ON 
// LetterGrades.java
// Method that takes a number grades and returns a corresponding letter grade
// Lab 5
// 7/17/17

import java.util.Scanner;
public class LetterGrades {
    // method to convert number grade to a letter grade and returns letter grade
    public static String findLetterGrade(double grade)
    {   
        String letterGrade;
        if (grade >= 93)
            letterGrade = "A";
        else if (grade >= 90)
            letterGrade = "A-";
        else if (grade >= 87)
            letterGrade = "B+";
        else if (grade >= 83)
            letterGrade = "B";
        else if (grade >= 80)
            letterGrade = "B-";
        else if (grade >= 77)
            letterGrade = "C+";     
        else if (grade >= 70)
            letterGrade = "C";
        else if (grade >= 67)
            letterGrade = "D+";
        else if (grade >= 63)
            letterGrade = "D";
        else if (grade >= 60)
            letterGrade = "D-";
        else
            letterGrade = "F";
        return letterGrade;
    }
    public static void main( String args[] ) {
        Scanner input = new Scanner(System.in);
        double grade = 0;   
        while (grade != -1){
            // prompt user for number grade
            System.out.print("\n\nEnter a grade (0-100) or -1 to quit: ");
            grade = input.nextDouble();          
            // displays error message if number is negative
            if (grade < 0 && grade != -1)
                System.out.print("Error: This is an invalid grade.");           
            else if (grade == -1)
                break;
            // rounds grade to hundredths place and calls for findLetterGrade method and displays its return value
            else{
                String letterGrade = findLetterGrade(Math.round(grade * 100)/100);                
                System.out.printf("The letter grade for %.2f is %s", grade, letterGrade);
            }
        }         
    
    System.out.println("\nProgrammed by Albert Nguyen"); // prints name
      
    }
    
}
