//Scanner Import
import java.util.Scanner;

public class Timer{
    
    public static void  main(String[] args) {
        //Scanner declaration//
        Scanner timeScanner = new Scanner ( System.in );
        ///////////////////////
            
        System.out.print("Enter the current time: ");
            int currentTime = timeScanner.nextInt(); //Enter the time in military format ex. 1700 for 5pm
        
        System.out.print("Enter the time you will be eating dinner: ");
            int dinnerTime = timeScanner.nextInt(); //Enter the time user will be eating
        
                 int betweenTime = (dinnerTime - currentTime);
        
        System.out.println("You have " + betweenTime /100 + " hours and " + betweenTime%100 + " minutes until dinner.");
        
        //Program does not work when first time's minute value is greater than the dinner time's minute value.
        
        
    }
}