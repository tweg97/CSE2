//Calculates the amount each person at dinner must pay after including tip. Collects user input for the output.

import java.util.Scanner;

    public class tipCalculator{
        
            public static void main(String[] args) {
                
                Scanner myScanner = new Scanner ( System.in ); //declares Scanner
                
                    System.out.print("Enter the original cost of the check in the form xx.xx: "); //Enter the cost, save as double
                        double checkCost = myScanner.nextDouble();
                    
                    System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx): ");
                        double tipPercent = myScanner.nextDouble(); //save entered tip % as double
                    tipPercent /= 100; //turns percent to decimal
                    
                    System.out.print("Enter the number of people who went out to dinner: ");
                        int numPeople = myScanner.nextInt(); //stores number of people as int
                
                //set variables
                double totalCost;
                double costPerPerson;
                int dollars, dimes, pennies;
                    
                    totalCost = checkCost * (1 + tipPercent); //adds tip cost to the entered total cost
                    costPerPerson = totalCost / numPeople; //divied cost between entered amount of people
                    dollars=(int)costPerPerson; //the int of the final cost
                    dimes=(int)(costPerPerson * 10) % 10; //decimal one
                    pennies=(int)(costPerPerson * 100) % 10; //decimal two
                    System.out.println("Each person in the group owes $" + dollars + "." + dimes + pennies); //displays in format dollar.dimes&pennies
                
    }
}