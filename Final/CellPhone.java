// Albert Nguyen
// Albertnguyen@my.smccd.edu
// CIS 254 ON 
// CellPhone.java
// Cellphone class containing methods
// Final Exam 
// 8/4/17 

public class CellPhone{
    
    private String manufacturer;
    private String model;
    private double price;

    public CellPhone(String manufacturer, String model, double price)
    {
        this.manufacturer = manufacturer;
        this.model = model;
        if (price >= 0){
            this.price = price;
        }
        else {
            this.price = 0.00;
        }
    }
    
    
   
   public void setManufacturer( String manufacturer )
    {
        this.manufacturer = manufacturer;
    } 
    
    public String getManufacturer()
    {
        return manufacturer;
    }
   
   
    
    public void setModel( String model )
    {
        this.model = model;
    } 
    
    public String getModel()
    {
        return model;
    }
    
    
    
    public void setPrice( double price )
    {
        if (price >= 0){
            this.price = price;
        }
        else {
            this.price = 0.00;
        }
    } 
    
    public double getPrice()
    {
        return price;
    }

    public String toString()
    {
        return "Manufacturer: " + manufacturer + " Model: " + model + " Price: " + price; 
    } 

} // end class  