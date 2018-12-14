// Albert Nguyen
// Albertnguyen@my.smccd.edu
// CIS 254 ON 
// BicycleTest.java
// Creates a bicycle object and demonstrates uses of different methods
// Lab 2
// 6/27/17 

public class BicycleTest {

    public static void main( String[] args )  {

		// Create 1 Bicycle reference variable. For example: myBike
        Bicycle myBike;
		// Create 1 String reference variable for the owner's name
        String ownerName;
		// Create 1 integer variable for license number
        int licenseNumber;
		// Assign your full name and a license number to the String and
		// integer variables
        ownerName = "AlbertNguyen";
        licenseNumber = 1063682;
        // Create a Bicycle object with the Bicycle class constructor
		// Use the variables you created as arguments to the constructor
        myBike = new Bicycle(ownerName, licenseNumber);
		// Output the owner's name and license number in printf statements
		// using the object reference and the get methods.
		// For example: bike.getOwnerName()
        System.out.printf("Owner Name: %s%nLicense number: %d", myBike.getOwnerName(), myBike.getLicenseNumber());		
        // Change the owner's name to Kenny McCormick using setOwnerName
        myBike.setOwnerName("Kenny McCormick");            
		// Output the owner's name and license number in printf statements
		// using the Bicycle object reference variable and the get methods.
        System.out.printf("%nOwner Name: %s%nLicense number: %d", myBike.getOwnerName(), myBike.getLicenseNumber());
    }
}

