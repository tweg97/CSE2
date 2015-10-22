import java.util.Scanner; //import scanner

public class StringAnalysis{ //open class

    public static boolean checkString(String a){
        for (int i = 0; i < a.length(); i++){ //for loop runs until counter i reaches the number of characters in the provided string.
        boolean whichChar = Character.isLetter(a.charAt(i)); //determines if the numerically placed character of the string is a letter and returns true or false.
        if (whichChar){ //if it is a letter,
            System.out.println(a.charAt(i) + " is a letter."); //say the (the letter in question) is a letter.
        }
        else{
             System.out.println(a.charAt(i) + " is not a letter."); //if not, say the character is not a letter. i.e. 4, ], +, etc.
        }
        }
            
            return true; //return true to exit the method, and coincedentally exit the program.
    }
    
    
    
    
    public static boolean checkString(String a, int b){ //receives both the typed string, and if an int is provided, the int.
        for (int i = 0; i < b; i++){ //goes until the counter reaches the specified number of cahracters analyzed.
        boolean whichChar = Character.isLetter(a.charAt(i));
        if (whichChar){
            System.out.println(a.charAt(i) + " is a letter.");
        }
        else{
             System.out.println(a.charAt(i) + " is not a letter.");
        }
        if ( (i + 1) == a.length() ){ //if loop has repeated for all cahracters in the string, the loop breaks before the method attempts to analyze a non existent character.
            break;
        }
        }
        return true; //method returns true to exit.
    }





    public static void main(String[] args){
        Scanner sc = new Scanner ( System.in ); //create scanner
    System.out.print("Enter a string:  ");
    String stringy; //this is the string that is passed to the methods.
    String y = "y";
    String n = "n";
    stringy = sc.next();
    
    System.out.print("Would you like to examine all the characters?  Y/N :  ");
    String choice = sc.next(); //user enters an answer, hopefully y or n. Case insensitive.
    while (choice.equalsIgnoreCase(y)  == false && choice.equalsIgnoreCase(n) == false){ //if the user doesn't enter y or n, loop and try again.
        System.out.print("Please enter Y/N :  "); //try again statement
        choice = sc.next(); //second chance. and third, etc
        
    }
    
    if (choice.equalsIgnoreCase(y)){ //if the user enters yes
       checkString(stringy); //run checkString that checks all of the characters in the provided string.
    }
    else if (choice.equalsIgnoreCase(n) ){ //if the user says no,
        System.out.print("Enter an integer:  "); //prompt them for the number of characters they want to enter.
        while(sc.hasNextInt() != true){ //while the input isn't and integer,
            System.out.print("That's not an integer. Enter an integer:  ");
            sc.next(); //try again.
        }
        int intThing = sc.nextInt(); //if the user enters an integer, run the checkString that accpets stringy and the int value.
        checkString(stringy, intThing);
    }
    
    }

} //close class