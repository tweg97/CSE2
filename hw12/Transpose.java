import java.util.Scanner;
public class Transpose {

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //creates a matrix of entered height( [] ) and width ( [][] )  and gives each inside array spot a random value from -10 to 10.
    public  static int[][] randomMatrix(int width, int height){
        int[][] matrix = new int[height][];
        for(int i = 0; i < height; i++){
            matrix[i]= new int[width];
            for (int j = 0; j < width; j++){
               matrix[i][j] = ((int) (Math.random() * 21) - 10);
            }
        }
        return matrix;
    }
    
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public static void printMatrix(int[][] matrix, int width, int height){  //height is matrix[height][] and width is matrix[][width] array
                                                                            //printMatrix will not accept a ragged matrix. Requires a fixed width and height that created the input matrix, but to make sure...
        for (int k =0; k < (height - 1); k++){                              //... here's a check statement.
            if (matrix[k].length == matrix[k + 1].length){
                continue;
            }
            else {
                return;
            }
        }
        for (int i = 0; i < height; i++){
            System.out.print("|");                                          //all of the if and if else statemtents just line up the numbers based on their physical length. 
            for ( int j = 0; j < width; j++){
                if (matrix[i][j] <= -10){
                     System.out.print(" " + matrix[i][j] + "");
                }
                else if (matrix[i][j]>= 10){
                    System.out.print(" " + matrix[i][j] + " ");
                }
                else if(matrix[i][j] < 0){
                System.out.print(" " + matrix[i][j] + " ");
                }
                else {
                    System.out.print("  " + matrix[i][j] + " ");
                }
            }
            System.out.println("|");
        }
    }
 
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 
    public static int[][] transposeMatrix(int[][] matrix, int width, int height){ //swaps the height and width from the last matrix creating method
        int[][] tMatrix = new int[height][];                                      //so the outside and inside arrays switch size.
        for(int i = 0; i < height; i++){
            tMatrix[i]= new int[width];
            for (int j = 0; j < width; j++){
               tMatrix[i][j] = (matrix[j][i]);  //this line takes each value from the inside array and places it in the now switched size inside of the new matrix.
            }
        }
        return tMatrix;
    }
 
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int width = 0;
        int height = 0;
        boolean isInt = true;
        System.out.println("Please enter a height and width:"); //Pretty standard int check
        System.out.print("Height: ");
        while(isInt = true){
            if (!in.hasNextInt()){
                 in.next();
                 System.out.println("    You did not enter a positive integer. Try again.");
                 System.out.print("Height: ");
        }
            else {
                 height = in.nextInt();
                 if (height < 0) { //Check if it's also positive.
                     System.out.println("    You did not enter a positive integer. Try again.");
                     System.out.print("Height: ");
                     continue;
                 }
                 else {
                    isInt = false; //makes it end the while loop if someone actually puts in a positive number.
                     break;
                 }
            }
        }
        isInt = true;
        System.out.print("Width:  ");
        while(isInt = true){

            if (!in.hasNextInt()){
                 in.next();
                 System.out.println("    You did not enter a positive integer. Try again.");
                 System.out.print("width:  ");
        }
            else {
                 width = in.nextInt();
                 if (width < 0) { //Check if it's also positive.
                     System.out.println("    You did not enter a positive integer. Try again.");
                     System.out.print("Width:  ");
                     continue;
                 }
                 else {
                    isInt = false; //makes it end the while loop if someone actually puts in a positive number.
                     break;
                 }
            }
        }
        //call the methods in order.
        int[][] matrix = randomMatrix(width, height);
        printMatrix(matrix, width, height);
        System.out.println("Transpose the matrix.");
        int[][] tMatrix = transposeMatrix(matrix, height, width);
        printMatrix(tMatrix, height, width);
    }
}