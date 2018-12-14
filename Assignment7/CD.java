// Albert Nguyen
// Albertnguyen@my.smccd.edu
// CIS 254 ON 
// CD.java
// CD class
// Assignment 7
// 8/2/17

import java.text.DecimalFormat;
public class CD
{
    // DecimalFormat object
    DecimalFormat currency = new DecimalFormat("#0.00");
    
    // instance varibles
    private String artistName;
    private String albumTitle;
    private double priceAmount = 0;
    private int numTracks = 1;       
   
    // constructor to initialize instance variables
    public CD (String artist, String album, double price, int tracks)
    {
        artistName = artist;
        albumTitle = album;
        
        if (price >= 0){
            priceAmount = price;
        }
        if (tracks >= 1){
            numTracks = tracks;
        }
    } // end constructor
    
    
    // method to update artist name
    public void setArtistName( String name )
    {
        artistName = name;
    } // end method
    
    // method to retrieve artist name
    public String getArtistName()
    {
        return artistName;
    } // end method
    
    
    // method to update album title
    public void setAlbumTitle( String title )
    {
        albumTitle = title;
    } // end method
    
    // method to retrieve album title
    public String getAlbumTitle()
    {
        return albumTitle;
    } // end method
    
    
    // method to set price
    public void setPriceAmount( double amount )
    {
        if (priceAmount >= 0){
            priceAmount = amount;
        }
        else {
            priceAmount = 0.00;
        }
    } // end method
    
    // method to retrieve price
    public double getPriceAmount()
    {
        return priceAmount;
    } // end method
    
    
    // method to update number of tracks
    public void setNumTracks( int tracks )
    {
        if (numTracks >= 1){
            numTracks = tracks;
        }
        else {
            numTracks = 1;
        }
    } // end method
    
    // method ot retrieve number of tracks
    public int getNumTracks()
    {
        return numTracks;
    }
    // end method
    
    
    // method to return all fields of CD object as string
    public String toString()
    {
        return artistName + " " + albumTitle + " $" + currency.format(priceAmount) + " " + numTracks + " tracks"; 
    } // end method

}