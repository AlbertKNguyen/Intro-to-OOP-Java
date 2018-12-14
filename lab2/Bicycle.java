// Albert Nguyen
// Albertnguyen@my.smccd.edu
// CIS 254 ON 
// Bicycle.java
// Bicycle class containining methods
// Lab 2
// 6/27/17 

public class Bicycle {

    // Instance field
    private String ownerName;
    private int licenseNumber;

    // Constructor
    public Bicycle( String name, int license ) {
    	ownerName = name;
    	licenseNumber = license;
    }

    // Returns the name of this bicycle's owner
    public String getOwnerName() {

        return ownerName;
    }

    // Assigns the name of this bicycle's owner
    public void setOwnerName( String name ) {

        ownerName = name;
    }

    // Returns the license number of this bicycle
    public int getLicenseNumber() {

        return licenseNumber;
    }

    // Assigns the license number of this bicycle
    public void setLicenseNumber( int license ) {

        licenseNumber = license;
    }

 }