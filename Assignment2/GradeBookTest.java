// Albert Nguyen
// Albertnguyen@my.smccd.edu
// CIS 254 ON 
// GradeBook.java
// Creates object of type GradeBook and uses methods within that type
// Assignment 2 
// 6/28/17 

import java.util.Scanner;
public class GradeBookTest{
    public static void main( String[] args )  {
        
        System.out.print("Programmed by Albert Nguyen\n");
        
        GradeBook myGradeBook;//Creates reference variable
        String courseName;
        String instructorName;
        Scanner input = new Scanner(System.in);//Creates scanner object
        
        System.out.println("Enter Course Name: ");
        courseName = input.nextLine();//Initilizes courseName
        System.out.println("Enter Instructor Name: ");
        instructorName = input.nextLine();//Initilizes instructorName
        
        myGradeBook = new GradeBook(courseName, instructorName);//Creates new object of type GradeBook      
        
        System.out.println();//Empty line
        
        myGradeBook.displayMessage();//Calls the method displayMessage
        
        myGradeBook.setCourseName("CIS 254 Intro to Object-Oriented Program Design");//Calls the method and enters an input
        myGradeBook.setInstructorName("Melissa Green");//Calls the method and enters input
        
        System.out.println();//Empty line
        
        myGradeBook.displayMessage();//Calls for the method with the new set strings
   }
}