// Albert Nguyen
// Albertnguyen@my.smccd.edu
// CIS 254 ON 
// Reverser.java
// Takes sentence string and splits into words and reverses it
// Lab 7
// 7/31/17 

import java.util.Scanner;
public class Reverser{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String sentence = "";
       
        while (!sentence.equalsIgnoreCase("quit")) {
            
            // prompts user to enter sentence
            System.out.println("\n\nEnter a Sentence: ");
            sentence = input.nextLine();  
            
            System.out.println("Reverse sentence: ");
            String[] words = sentence.split(" "); // splits sentence into words array

            for(int counter = words.length-1; counter >= 0 ;counter--){ // prints reverse words
                 System.out.print(words[counter] + " ");  
            } 
        }   
        System.out.println("\n\nProgrammed by Albert Nguyen"); // prints name
    }
}
