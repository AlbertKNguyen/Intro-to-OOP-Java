// Albert Nguyen
// Albertnguyen@my.smccd.edu
// CIS 254 ON 
// BaseConverter.java
// methods to convert and return the number to binary and hexidecimal
// Assignment 5
// 7/19/17
public class BaseConverter {
    public static String convertToBinary(long decimal) {
        
        String binaryNumber = "";
        boolean done = decimal < 0;
        
        // boolean validity checker
        while (!done) {
            binaryNumber = (decimal % 2) + binaryNumber;
            decimal /= 2;
            done = decimal == 0;
        }

        return binaryNumber;
    }
    public static String convertToHexadecimal(long decimal){ 
        String hexRemLetter;
        String hexNumber = "";
        boolean done = decimal < 0;
        
        // boolean validity checker
        while (!done) {
            long hexRem = decimal % 16;
            
            // switch case to convert the remainder to corresponding letter or keeps its number
            switch ((int)hexRem){
                case 10: hexRemLetter = "A";
                    break;
                case 11: hexRemLetter = "B";
                    break;
                case 12: hexRemLetter = "C";
                    break;
                case 13: hexRemLetter = "D";
                    break;
                case 14: hexRemLetter = "E";
                    break;
                case 15: hexRemLetter = "F";
                    break;
                default: hexRemLetter = hexRem + "";
            }
            hexNumber = (hexRemLetter) + hexNumber;
            decimal /= 16;
            done = decimal == 0;
        }                     
            return hexNumber;
    }
}