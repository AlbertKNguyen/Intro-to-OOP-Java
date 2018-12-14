// Albert Nguyen
// Albertnguyen@my.smccd.edu
// CIS 254 ON 
// CDTest.java
// CDTest program that holds 6 CD objects in array and displays the information
// Assignment 7
// 8/2/17

import javax.swing.JOptionPane;
public class CDtest{
    public static void main( String[] args )  
    {
        // first 3 lines of message for dialog box
        String message = "Programmed by Albert Nguyen\n\n"
                       + "My CDs\n"
                       + "*****************************\n";
        
        // declares array with 6 CD object elements
        CD[] array = new CD[6];     
        
        // initializing each CD object
        array[0] = new CD("Daft Punk", "Discovery", 9.99, 14);
        array[1] = new CD("Linkin Park", "Meteora", 10.99, 13);
        array[2] = new CD("Beatles", "Abbey Road", 12.99, 18);
        array[3] = new CD("Dr. Dre", "2001", 5.99, 23);
        array[4] = new CD("50 Cent", "Get Rich or Die Tryin'", 5.99, 18);
        array[5] = new CD("Sugar Ray", "14:59", 9.99, 13);
    
        // adds to message each CD object information
        for (CD album : array)
        {
            message += album.toString() + "\n";
        }
        
        // displays message in a dialog box
        JOptionPane.showMessageDialog(null, message);        

    }
}