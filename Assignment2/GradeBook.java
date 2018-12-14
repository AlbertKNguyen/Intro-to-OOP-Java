// Albert Nguyen
// Albertnguyen@my.smccd.edu
// CIS 254 ON 
// GradeBook.java
// GradeBook class containing methods
// Assignment 2
// 6/28/17 

public class GradeBook
{
   private String courseName; // course name for this GradeBook
   private String instructorName; // name of course's instructor

   // constructor initializes instance variables
   public GradeBook( String courseName, String instructor )
   {
      this.courseName = courseName; // initializes courseName
      instructorName = instructor; // initializes instructorName
   } // end constructor

   // method to update the course name
   public void setCourseName( String name )
   {
      courseName = name; // store the course name
   } // end method setCourseName

   // method to retrieve the course name
   public String getCourseName()
   {
      return courseName;
   } // end method getCourseName

   // method to update the instructor's name
   public void setInstructorName( String name )
   {
      instructorName = name; // store the instructor's name
   } // end method setInstructorName

   // method to retrieve the instructor's name
   public String getInstructorName()
   {
      return instructorName;
   } // end method getInstructorName

   // display a welcome message with course info
   public void displayMessage()
   {
      // display the course name and instructor's name
      System.out.printf( "Welcome to the grade book for%n%s%n",
         getCourseName() );
      System.out.printf( "This course is presented by %s%n",
         getInstructorName() );
   } // end method displayMessage

} // end class GradeBook
