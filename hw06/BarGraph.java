import java.util.Scanner; //import scanner

public class BarGraph {
    
    public static void main(String[] args){
        
        Scanner myScanner = new Scanner ( System.in ); //create scanner
        
        boolean isNumber = true; //intialize a boolean for loop ending.
    
    
    
    
        
        double mondayCost = 0; //initialize moday's expense as a double
        System.out.print("Expenses for Monday:    $");
        
        while (isNumber = true){ //
        if (!myScanner.hasNextDouble()){ //Is it even a number? No? check the next 3 lines out.
            
            myScanner.next();
            System.out.println("Sorry, you did not enter a positive integer. Try again.");
            System.out.print("Expenses for Monday:    $"); //This is your chance for redemption.
        }
        
            else if (myScanner.hasNextDouble()){ //OR maybe they entered a number. Genius!
                 
                 mondayCost = myScanner.nextDouble(); //Did the user actually write a real number? How exciting!
                 if (mondayCost < 0) { //Check if it's also positive. Hard instructions.
                     System.out.println("Sorry, you did not enter a positive integer. Try again.");
                     System.out.print("Expenses for tuesday:    $");
                     continue;
                 }
                 isNumber = false; //makes it end the while loop if someone actually puts in a positive number.
                 break; //also definitely makes it end the while loop. Just in case.
                
            }
        }
    
    

    
    
    
        //repeat for Tuesday.
       
        double tuesdayCost = 0;
        System.out.print("Expenses for Tuesday:    $");
        
        while (isNumber = true){ //
        if (!myScanner.hasNextDouble()){
            
            myScanner.next();
            System.out.println("Sorry, you did not enter a positive integer. Try again.");
            System.out.print("Expenses for Tuesday:    $");
        }
        
            else if (myScanner.hasNextDouble()){
                 
                 tuesdayCost = myScanner.nextDouble();
                 if (tuesdayCost < 0) {
                     System.out.println("Sorry, you did not enter a positive integer. Try again.");
                     System.out.print("Expenses for Tuesday:    $");
                     continue;
                 }
                 isNumber = false;
                 break;
                
            }
        }
       
        
        
        
        
        
        //...and Wednesday
        
        double wednesdayCost = 0;
        System.out.print("Expenses for Wednesday:    $");
        
        while (isNumber = true){ //
        if (!myScanner.hasNextDouble()){
            
            myScanner.next();
            System.out.println("Sorry, you did not enter a positive integer. Try again.");
            System.out.print("Expenses for Wednesday:    $");
        }
        
            else if (myScanner.hasNextDouble()){
                 
                 wednesdayCost = myScanner.nextDouble();
                 if (wednesdayCost < 0) {
                     System.out.println("Sorry, you did not enter a positive integer. Try again.");
                     System.out.print("Expenses for Wednesday:    $");
                     continue;
                 }
                 isNumber = false;
                 break;
                
            }
        }
        
        
        
        
        
        
        
        //You guessed it. Thursday.
        
        double thursdayCost = 0;
        System.out.print("Expenses for Thursday:    $");
        
        while (isNumber = true){ //
        if (!myScanner.hasNextDouble()){
            
            myScanner.next();
            System.out.println("Sorry, you did not enter a positive integer. Try again.");
            System.out.print("Expenses for Thursday:    $");
        }
        
            else if (myScanner.hasNextDouble()){
                 
                 thursdayCost = myScanner.nextDouble();
                 if (thursdayCost < 0) {
                     System.out.println("Sorry, you did not enter a positive integer. Try again.");
                     System.out.print("Expenses for Thursday:    $");
                     continue;
                 }
                 isNumber = false;
                 break;
                
            }
        }
        
        
        
        
        
        
        //For the day that comes after Thursday.
        
        double fridayCost = 0;
        System.out.print("Expenses for Friday:    $");
        
        while (isNumber = true){ //
        if (!myScanner.hasNextDouble()){
            
            myScanner.next();
            System.out.println("Sorry, you did not enter a positive integer. Try again.");
            System.out.print("Expenses for Friday:    $");
        }
        
            else if (myScanner.hasNextDouble()){
                 
                 fridayCost = myScanner.nextDouble();
                 if (fridayCost < 0) {
                     System.out.println("Sorry, you did not enter a positive integer. Try again.");
                     System.out.print("Expenses for Friday:    $");
                     continue;
                 }
                 isNumber = false;
                 break;
                
            }
        }
        
        
        
        
        
        
        //For the third day after the day 24 hours after Tuesday.
        
        double saturdayCost = 0;
        System.out.print("Expenses for Saturday:    $");
        
        while (isNumber = true){ //
        if (!myScanner.hasNextDouble()){
            
            myScanner.next();
            System.out.println("Sorry, you did not enter a positive integer. Try again.");
            System.out.print("Expenses for Saturday:    $");
        }
        
            else if (myScanner.hasNextDouble()){
                 
                saturdayCost = myScanner.nextDouble();
                 if (saturdayCost < 0) {
                     System.out.println("Sorry, you did not enter a positive integer. Try again.");
                     System.out.print("Expenses for Saturday:    $");
                     continue;
                 }
                 isNumber = false;
                 break;
                
            }
        }
        
        
        
        
        
        //For the Pre-Monday Monday
        
        double sundayCost = 0;
        System.out.print("Expenses for Sunday:    $");
        
        while (isNumber = true){ //
        if (!myScanner.hasNextDouble()){
            
            myScanner.next();
            System.out.println("Sorry, you did not enter a positive integer. Try again.");
            System.out.print("Expenses for Sunday:    $");
        }
        
            else if (myScanner.hasNextDouble()){
                 
                 sundayCost = myScanner.nextDouble();
                 if (sundayCost < 0) {
                     System.out.println("Sorry, you did not enter a positive integer. Try again.");
                     System.out.print("Expenses for Sunday:    $");
                     continue;
                 }
                 isNumber = false;
                 break;
                
            }
        }
        
        
        
        System.out.print("Mon:     ");
        for (int mondayBars = 0; (mondayBars + 0.49) - mondayCost < 0; mondayBars++ ){
        System.out.print("*");
        }
        
        
        System.out.println("");
        System.out.print("Tues:    ");
        for (int tuesdayBars = 0; (tuesdayBars + 0.49) - tuesdayCost < 0; tuesdayBars++ ){
        System.out.print("*");
        }
        
        
        System.out.println("");
        System.out.print("Wed:     ");
        for (int wednesdayBars = 0; (wednesdayBars + 0.49) - wednesdayCost < 0; wednesdayBars++ ){
        System.out.print("*");
        }
        
        
        System.out.println("");
        System.out.print("Thurs:   ");
        for (int thursdayBars = 0; (thursdayBars + 0.49) - thursdayCost < 0; thursdayBars++ ){
        System.out.print("*");
        }
        
        
        System.out.println("");
        System.out.print("Fri:     ");
        for (int fridayBars = 0; (fridayBars + 0.49) - fridayCost < 0; fridayBars++ ){
        System.out.print("*");
        }
        
        
        System.out.println("");
        System.out.print("Sat:     ");
        for (int saturdayBars = 0; (saturdayBars + 0.49) - saturdayCost < 0; saturdayBars++ ){
        System.out.print("*");
        }
        
        
        System.out.println("");
        System.out.print("Sun:     ");
        for (int sundayBars = 0; (sundayBars + 0.49) - sundayCost < 0; sundayBars++ ){
        System.out.print("*");
        }
        
        System.out.println("");
        
        double almostAverage = (int) (((mondayCost + tuesdayCost + wednesdayCost + thursdayCost + fridayCost + saturdayCost + sundayCost) /7) *100);
        double finalAverage = almostAverage / 100;
        System.out.println("Your average weekly expenses are: $" +finalAverage);
        
        double expenditure = 0;
        
        for (int i = 1; i < 209; i++){
        
            
        
        
        int percent = (int)(Math.random()*41);
        
        int multiplier = 0;
        
        if (percent > 0 && percent <= 20) {
            multiplier = percent / 100 + 1;
        }
        else if (percent > 20 && percent <= 40){
            multiplier = (percent - 20) / -100 + 1;
        
        }
        
            expenditure += finalAverage * multiplier;
           
            
            
            
        }
               expenditure = (int) (expenditure *100);
              double finalExpenditure = expenditure /100;
                System.out.println("Estimated expenditure for 4 years: $" + finalExpenditure);
        
    }
}