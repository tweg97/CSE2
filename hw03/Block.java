import java.util.Scanner;

public class Block{
    
    public static void  main(String[] args) {
        //Scanner declaration//
        Scanner dScanner = new Scanner ( System.in );
        ///////////////////////
        
            
            System.out.print("Enter the length of the block: ");
                double length = dScanner.nextDouble();
            System.out.print("Enter the width of the block: ");
                double width = dScanner.nextDouble();
            System.out.print("Enter the height of the block: ");
                double height = dScanner.nextDouble();
                    
                    double volume = (length * width * height);
                    double sArea = ((2 * length * width) + (2 * length * height) + (2 * width * height));
                    
            System.out.println("The volume of the block of dimensions " + length + " x " + width + " x " + height + " is " + volume + ". The surface area of the block is " + sArea + ".");

        
    }
}