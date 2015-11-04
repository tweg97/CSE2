import java.util.Scanner;

public class Stats {
    
    
    
    public static double mean( double a, double b, double c, double d, double e ){
        return ((a + b +c + d + e) / 5);
        
    }
    
    
        public static double median( double a, double b, double c, double d, double e ){
        
     return c;
            
        }
        
    
    
         
    
    
    
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner ( System.in );
        double one, two, three, four, five;
        System.out.println("Enter five values.");
            one = sc.nextDouble();
            two = sc.nextDouble();
            three = sc.nextDouble();
            four = sc.nextDouble();
            five = sc.nextDouble();
                double average = mean(one, two, three, four, five);
                double med = median(one, two, three, four, five);
        System.out.println("");
        System.out.println("Mean: " + average);
        System.out.println("Median: " + med);
    }
    
    public static void print(){
        System.out.println("Mean: " + average);
        System.out.println("Median: " + med);
    }
    
}