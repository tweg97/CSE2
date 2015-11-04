public class Shuffling {
    
////////////////////////////////////***PRINTARRAY***////////////////////////////////////////////////////////////////////

       public static void printArray(String[] a, String[] b, String[] c){ //print 52 cards using
               for (int i=0; i<52; i++){
                  c[i]=b[i%13]+a[i/13]; //options from input rankNames, suitNames, and card number 0 to 51
                  System.out.print(c[i]+" "); //print each card
              }
        
        }

////////////////////////////////////***SHUFFLE***///////////////////////////////////////////////////////////////////////

        public static void shuffle(String[] a){ //takes array "cards" and switches values the number of times equal...
                                                //to the length of the deck.
                String index ="";
            for (int i = 0; i < a.length; i++){
                int randomInt = (int)(Math.random() * a.length);
                index = a[randomInt];
                a[randomInt] = a[i];
                a[i] = index;
                System.out.print(index + " ");
            }
        }
        
////////////////////////////////////***RANDOMIZE HAND***////////////////////////////////////////////////////////////////

        public static void randomizeHand(String[] a){
        
                String index =""; //same as my shuffle method, except it only shuffles and prints 5 cards that are...
            for (int i = 0; i < 5; i++){ //randomly selected from the deck.
                int randomInt = (int)(Math.random() * a.length);
                index = a[randomInt];
                a[randomInt] = a[i];
                a[i] = index;
                
                System.out.print(index + " ");  
            }
        }
        
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static void main(String[] args){
        
        String[] suitNames={"C","H","S","D"};   
        String[] rankNames={"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q","K","A"};
        String[] cards = new String[52];
        String[] hand = new String[5];
        
        System.out.println("Deck");
        
        printArray(suitNames, rankNames, cards);
        
        System.out.println();
        System.out.println();
        
        System.out.println("Shuffled");
        
            shuffle(cards);
        
        System.out.println();
        System.out.println();
        
        System.out.println("Randomized Hand!");
        
            randomizeHand(cards);
        
        System.out.println();
        System.out.println();
        
        
    }
    
    
}