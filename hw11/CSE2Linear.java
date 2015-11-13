import java.util.Scanner;
public class CSE2Linear{
    
    public static void main(String[] args){
        Scanner in = new Scanner ( System.in );
        //allocate array, check for int, from 0 to 100, and  ascending
        int []grades = new int[15];
        int nextGrade = 0;
        int i = 0;
        int lastVal = 0;;
        System.out.println("Enter 15 ints for final grades in CSE2: ");
        while (i < 15){
            System.out.print("Grade " + (i + 1) + ": ");
            if (!in.hasNextInt()){
                
                in.next();
                System.out.println("    Error: please use ints.  ");
                
                continue;
            }
        
            else{
                
                int val = in.nextInt();
                if (val >= 0 && val <= 100) {
                    if (val >= lastVal){
                    grades[i] = val;
                    lastVal = val;
                    i++;
                    }
                    else{
                        System.out.println("Int should be larger than the last int.");
                    }
                }
                else{
                    System.out.println("    Error. Enter a number from 0 to 100.  ");
                    
                }
            }
        }
        System.out.print("Enter a grade to binary search for: "); //enter an int to look for
        int search = in.nextInt();
        int comparisons = 0;
        int upper = grades.length - 1;
        int lower = 0;
        int position = (lower + upper) / 2;
        
     //start in the middle, work towards number if greater than or less than middle
      while( lower <= upper )
      {
          comparisons++;
         if ( grades[position] < search )
           lower = position + 1;
         else if ( grades[position] == search )
         {
           System.out.println(search + " was found in the list with " + comparisons + " comparisons");
           break;
         }
         else
         {
             upper = position - 1;
         }
         position = (lower + upper)/2;
      }
      if ( lower > upper )
          System.out.println(search + " was not found in the list with " + comparisons + " comparisons");
   
        
        //scramble using a temp that interchanges for an int in an array.
        int target = 0;
        int temp = 0;
        for (int k = 0; k < grades.length; k++) {
	        target = (int) (grades.length * Math.random() );
        	temp = grades[target];
        	grades[target] = grades[k];
        	grades[k] = temp;
        }
        System.out.println("Scrambled:");
         int j = 0;
        while (j < 15){
            System.out.print(grades[j] + " ");
            j++;
        }
        
        comparisons = 0;
        int l = 0;
        System.out.println("");
        System.out.println("Enter a grade to linear search for: ");
        search = in.nextInt();
        for (l = 0; l < grades.length; l++){ //searches each member of the array until the number is found
            if(grades[l] != search){
                comparisons++;
                continue;
            }
            
                if(grades[l] == search){
                    System.out.println(search + " was found in the list with " + comparisons + " comparisons");
                    break;
            }
        }
        //if the number wasn't found in the array, print not found
        if (l > (grades.length - 1)){
          System.out.println(search + " was not found in the list with " + comparisons + " comparisons");
                }

    
    }   
}