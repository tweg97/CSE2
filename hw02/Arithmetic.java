public class Arithmetic{


    public static void main(String[] args) {
        
        
        int nSocks=3; //number of sock pairs
        double sockCost$=2.58; //cost of sock pair
        
        int nGlasses=6; //number of drinking glasses
        double glassCost$=2.29; //cost per glass
        
        int nEnvelopes=1; //number of boxes of envelopes
        double envelopeCost$=3.25; //price of a box
        
        double taxPercent=0.06; //sales tax rate
        
        double totalSockCost$;   //total cost of socks
        double totalGlassCost$; //total cost of glasses
        double totalEnvelopeCost$; //total cost of envelope boxes
        
        System.out.println("Pair of Socks"); //Name, then quantity, then price
        System.out.println(nSocks);
        System.out.println("Cost is " + sockCost$);
        System.out.println("Drinking Glass"); //Name, then...
        System.out.println(nGlasses);
        System.out.println("Cost is " + glassCost$);
        System.out.println("Box of Envelopes"); //Name, then...
        System.out.println(nEnvelopes);
        System.out.println("Cost is " + envelopeCost$);
        System.out.println("");
        
            totalSockCost$=nSocks*sockCost$; //total sock price before tax 
            totalGlassCost$=nGlasses*glassCost$; //total glass price before tax
            totalEnvelopeCost$=nEnvelopes*envelopeCost$; //total envelope before tax
        
                //define the tax amounts
                
                double socksTax = totalSockCost$ * taxPercent * 100;  //Finds sock tax amount and multiplies it by 100
                int sockTaxFinal = (int) socksTax; //converts the previous amount to an integer.
                
                double glassTax = totalGlassCost$ * taxPercent * 100;
                int glassTaxFinal = (int) glassTax;
                
                double envelopeTax = totalEnvelopeCost$ * taxPercent * 100;
                int envelopeTaxFinal = (int) envelopeTax;
                
        //Print the totals
        System.out.println("Sock total before tax is " + totalSockCost$); //total
        System.out.println("Sales tax is " + sockTaxFinal / 100.0 ); //tax amount // divide the integer value by 100.0 to get the value back from socksTax but with 2 decimals
        System.out.println("");
        System.out.println("Drinking glass total before tax is " + totalGlassCost$); //total
        System.out.println("Sales tax is " + glassTaxFinal / 100.0 ); //tax amount
        System.out.println("");
        System.out.println("Envelope box total before tax is " + totalEnvelopeCost$); //total
        System.out.println("Sales tax is " + envelopeTaxFinal / 100.0); //tax amount
        System.out.println("");
        
                double totalCost = (totalEnvelopeCost$ + totalGlassCost$ + totalSockCost$)* 100; //total amount before tax times 100, in order to make room for dividing the int version by 100.0
                int totalCostFinal= (int) totalCost; //converts into an intger, when divided by 100.0 will have two decimals
        
        
        System.out.println("Total before tax: " + (totalCostFinal/100.0)); //implicit cast from int to double
        System.out.println("");
        System.out.println("Total tax: " + (sockTaxFinal + glassTaxFinal + envelopeTaxFinal) / 100.0); //adds the tax
        System.out.println("");
        System.out.println("Total with tax: " + (((sockTaxFinal + glassTaxFinal + envelopeTaxFinal)/100.0) + (totalCostFinal/100.0)));
        
        
        
    }
        
}