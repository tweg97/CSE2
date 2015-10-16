import java.util.Scanner;

public class Twisty {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner ( System.in );
        
        boolean isInt = true;
        
        int length = 0;
        int width = 0;
        
        System.out.print("Input your desired length: ");
        
            while (isInt = true){
                if (!sc.hasNextInt()){
                    
                    sc.next();
                    System.out.println("    Error: please type in an integer.");
                    System.out.print("Input your desired length: ");
            
                }
                
                else if (sc.hasNextInt()){
                                 
                length = sc.nextInt();
                    if (length <= 0) {
                    System.out.println("    Error: Please enter a positive integer.");
                    System.out.print("Input your desired length: ");
                    continue;
                    }
                
                break;
                }
            }
            
            
            
           
            
            System.out.print("Input your desired width: ");
        
            while (isInt = true){
                if (!sc.hasNextInt()){
                    
                    sc.next();
                    System.out.println("    Error: please type in an integer.");
                    System.out.print("Input your desired width: ");
            
                }
                
                else if (sc.hasNextInt()){
                                 
                width = sc.nextInt();
                    if (width <= 0) {
                    System.out.println("    Error: Please enter a positive integer.");
                    System.out.print("Input your desired width: ");
                    continue;
                    }
                break;
                }
            }
            //i is row counter and j is space counter
            
            double xNum = length/width;
        int k;
        int i, j;
    for (i = 0; i < width; i ++){ //determines which line you are writting on
        for(k = 0; k < (xNum + 1); k++){ //determines which character each 'X' will start with
            if(k%2 != 0){
                if (k == xNum){
                    for (j = 0; j < (length % width); j++){
                        if (j == i){
                            System.out.print ("\\");
                        }
                        else if (j == (width - i) - 1){
                            System.out.print ("#");
                        }
                        else{
                            System.out.print (" ");
                        }
                    }
                }
                else{
                    for (j = 0; j < width; j++){ //determines which character is written
                        if (j == i){
                            System.out.print ("\\");
                        }
                        else if (j == (width - i) - 1){
                            System.out.print ("#");
                        }
                        else{
                            System.out.print (" ");
                        }
                    }
                }
            }
            else{
                if (k == xNum){
                    for (j = 0; j < (length % width); j++){
                        if (j == i){
                            System.out.print ("\\");
                        }
                        else if (j == (width - i) - 1){
                            System.out.print ("#");
                        }
                        else{
                            System.out.print (" ");
                        }
                    }
                    
                }
                else{
                    for (j = 0; j < width; j++){
                        if (j==i){
                            System.out.print ("#");
                        }
                        else if (j == (width - i) - 1){
                            System.out.print ("/");
                        }
                        else{
                            System.out.print (" ");
                        }
                    }
                }
                }
        }
        System.out.println ("");
    }
                
                
        
    }
}