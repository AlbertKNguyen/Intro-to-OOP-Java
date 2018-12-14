// Albert Nguyen
// Albertnguyen@my.smccd.edu
// CIS 254 ON 
// CellPhoneTest.java
// CellPhoneTest program that holds 5 CellPhone objects in array and displays information
// Final Exam 
// 8/4/17 

public class CellPhoneTest{
    public static void main( String[] args )  {
        CellPhone[] array = new CellPhone[4];
        
        array[0] = new CellPhone("Apple", "iPhone 6s", 549.99);
        array[1] = new CellPhone("Samsung", "Galaxy Note 7", 499.99);
        array[2] = new CellPhone("LG", "Stylo 3", 149.99);
        array[3] = new CellPhone("Google", "Pixel XL", 769.00);
        
        String message;
        
        for (CellPhone options : array)
        {
            System.out.print("Cellphones\n");
            System.out.print(options.toString());
        }
    }
}