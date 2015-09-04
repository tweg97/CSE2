//
//

public class Cyclometer{
   
    public static void main(String[] args) {
    
    	//Input data
    	int secsTrip1=480; //seconds trip 1
       	int secsTrip2=3220; // trip 2
		int countsTrip1=1561; //Counts(revolutions)
		int countsTrip2=9037;
	    
	    double wheelDiameter=27.0, //defined fixed variables
	        PI=3.14159,
    	    feetPerMile=5280,
	        inchesPerFoot=12,
	        secondsPerMinute=60;
	    double distanceTrip1, distanceTrip2, totalDistance;

        //prints trip length in minutes and counts per trip
        System.out.println("Trip 1 took "+ //trip 1
            (secsTrip1/secondsPerMinute)+" minutes and had "+
             countsTrip1+" counts.");
        System.out.println("Trip 2 took "+ //trip 2
            (secsTrip2/secondsPerMinute)+" minutes and had "+
             countsTrip2+" counts.");
        
        
        distanceTrip1=countsTrip1*wheelDiameter*PI; //total distanace in inches
        distanceTrip1/=inchesPerFoot*feetPerMile; //changes distance from inches to miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile; //trip two same thing
        totalDistance=distanceTrip1+distanceTrip2;
        
        //prints the output
        System.out.println("Trip 1 was "+distanceTrip1+" miles"); //trip 1
        System.out.println("Trip 2 was "+distanceTrip2+" miles"); //trip 2
        System.out.println("The total distance was "+totalDistance+" miles."); //total

    }
}