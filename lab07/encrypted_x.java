import java.util.Scanner;

public class encrypted_x{

    public static void main(String[] args){

        Scanner sc = new Scanner ( System.in );

        System.out.print("Enter an integer from 0-100: ");
        
        int input = sc.nextInt();
        int i, j;
        for(i = 0; i < input; i++){
            
            for(j = 0; j < input; j++){
                if (j == i || j == input - i - 1){
             System.out.print(" ");
                }
             else
                 System.out.print("*");
             }
                
            }
            
            System.out.println("");
        
        }





















    }
}