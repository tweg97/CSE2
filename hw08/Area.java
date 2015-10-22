import java.util.Scanner; //import scanner

public class Area{ //open class
    
    public static double areaTriangle(double a,double b){ //method for area of triangle. Accepts an input for base and height.
        return 0.5 * a * b;
    }
    
    public static double areaRectangle(double a,double b){ //area of rectangle accepts input length and width.
        return a * b;
    }
    
    public static double areaCircle(double a){ //circle asks for input of radius.
      return 3.14159265359 * a * a;
    }
    
 
    
    
    
    public static double checkDouble(Scanner sc){ //Method for checking if an input is a positive double.
       boolean isDouble = true;                   //It gets passed a scanner input.
       double dimension = 0;
       while (isDouble = true){ //My tried and true input checker ensues.
                if (!sc.hasNextDouble()){
                    
                    sc.next();
                    System.out.println("    Error: please type in a double.");
                    
            
                }
                
                else if (sc.hasNextDouble()){
                                 
                dimension = sc.nextDouble();
                    if (dimension <= 0) {
                    System.out.println("    Error: Please enter a positive double.");
                    
                    continue;
                    }
                break;
                }
            }
            return dimension; //the return is the acceptable input.
    }
    
    
    
    public static void main(String[] args){
        Scanner sc = new Scanner ( System.in ); //Scanner sc used in the checkDouble method.
        System.out.println("Enter a shape:  ");
        double base = 0;
        double height = 0;
        double length = 0;
        double width = 0;
        double radius = 0;
        double area = 0;
        int whichShape = 0; //determines which shape is chosen. assigned 4 to anything that's not the shape name.
        boolean runProgram = true;
       String triangle = "triangle";
       String rectangle = "rectangle";
       String circle = "circle";
       while(runProgram){ //runProgram simply keeps the loop going until there is a final result.
       String shape = sc.next();
       if(shape.equalsIgnoreCase(triangle) ){ //If the name of the shape entered is (not case-sensitive) triangle, assign whichShape to 1.
        whichShape = 1;
       }
       else if(shape.equalsIgnoreCase(rectangle) ){ //same as last assignment.
        whichShape = 2;
       }
       else if(shape.equalsIgnoreCase(circle) ){ //and again.
        whichShape = 3;
       }
       else{
           whichShape = 4;
       }
       
       
       if (whichShape == 1){ //If the user entered triangle (see line if(shape.equalsIgnoreCase(triangle)) ) ask for base and height.
           System.out.print("Base:  ");
           base = checkDouble(sc); //checkDouble makes sure it is a positive double.
           System.out.print("Height:  ");
           height = checkDouble(sc);
           area = areaTriangle(base, height); //runs base and height through the areaTriangle checker.
           System.out.println("The area of the triangle is " + area + ".");
           break;
       }
      
       else if (whichShape == 2){
           System.out.print("Length:  ");
           length = checkDouble(sc);
           System.out.print("Width:  ");
           width = checkDouble(sc);
           area = areaRectangle(length, width);
           System.out.println("The area of the rectangle is " + area + ".");
           break;
       } 
       
       else if (whichShape == 3){
           System.out.print("Radius:  ");
           radius = checkDouble(sc);
           area = areaCircle(radius);
           System.out.println("The area of the circle is " + area + ".");
           break;
       }
       
       else if (whichShape == 4){
           System.out.println("Please enter either triangle, rectangle, or circle."); //if not, try everythign again.
           
       }
     }
      
    }
}