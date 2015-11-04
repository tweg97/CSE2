import java.util.Scanner;
public class arraylab{
    
    public static void main(String[] args){
        Scanner sc = new Scanner ( System.in );
    
    int numStudents = (int) (Math.random() * 6) + 5;
    
    String[] students;
    students = new String[numStudents];
    System.out.println("Enter " + numStudents + " student names: ");
    int i = 0;
        for(i = 0; i < numStudents; i++){
	    String studentName = sc.next();
	    students[i] = studentName;
        }
    
    int[] midterm;
    midterm = new int[numStudents];
    i = 0;
        for(i = 0; i < numStudents; i++){
        int grade = (int) (Math.random() * 101);
        midterm[i] = grade;
        }
    
    System.out.println("Here are the midterm grades of the " + numStudents + " students above:");
    i = 0;
        for(i = 0; i < numStudents; i++){
    System.out.println(students[i] + ": " + midterm[i]);
        }
        
        
    }
}