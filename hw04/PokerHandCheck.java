public class PokerHandCheck{
    
    public static void main(String[] args) {
        
        System.out.println("Your random cards were:");
    
    int face1 = (int)(Math.random()*13)+1; //finds a random number from 1 to 13, one for each face a card could have
    int suit = (int)(Math.random()*4)+1; //finds a random number from one to 4, one for each suit.
    String suitName = ""; //initializes suit name to be replaced in the if statements
    String faceValue = ""; //initializes face value to be replaced in the if statements
    //switch statements below the suit assignment code the numbers 2 through ten to strings of the number, 1 for aces, 11 for jacks, etc
    if (suit == 1){
        suitName = "Clubs";
    }
    
    if (suit == 2){
        suitName = "Spades";
    }
    
     if (suit == 3){
        suitName = "Diamonds";
    }
    
     if (suit == 4){
        suitName = "Hearts";
    }
    
    switch ( face1 ){
        case 1:
            faceValue = "Ace";
        break;
        
        case 2:
            faceValue = "2";
        break;
        
        case 3:
            faceValue = "3";
        break;
        
        case 4:
            faceValue = "4";
        break;
        
        case 5:
            faceValue = "5";
        break;
        
        case 6:
            faceValue = "6";
        break;
        
        case 7:
            faceValue = "7";
        break;
        
        case 8:
            faceValue = "8";
        break;
        
        case 9:
            faceValue = "9";
        break;
        
        case 10:
            faceValue = "10";
        break;
        
        case 11:
            faceValue = "Jack";
        break;
        
        case 12:
            faceValue = "Queen";
        break;
        
        case 13:
            faceValue = "King";
        break;
            
    }
    
    System.out.println("     the " + faceValue + " of " + suitName); //print out the first cards suit and face
    
    int face2 = (int)(Math.random()*13)+1; //finds a second random number to assign to the second card.
    suit = (int)(Math.random()*4)+1; //same as last line but for suit
    
        if (suit == 1){
        suitName = "Clubs";
    }
    
    if (suit == 2){
        suitName = "Spades";
    }
    
     if (suit == 3){
        suitName = "Diamonds";
    }
    
     if (suit == 4){
        suitName = "Hearts";
    }
    
    switch ( face2 ){
        case 1:
            faceValue = "Ace";
        break;
        
        case 2:
            faceValue = "2";
        break;
        
        case 3:
            faceValue = "3";
        break;
        
        case 4:
            faceValue = "4";
        break;
        
        case 5:
            faceValue = "5";
        break;
        
        case 6:
            faceValue = "6";
        break;
        
        case 7:
            faceValue = "7";
        break;
        
        case 8:
            faceValue = "8";
        break;
        
        case 9:
            faceValue = "9";
        break;
        
        case 10:
            faceValue = "10";
        break;
        
        case 11:
            faceValue = "Jack";
        break;
        
        case 12:
            faceValue = "Queen";
        break;
        
        case 13:
            faceValue = "King";
        break;
            
    }
    
    System.out.println("     the " + faceValue + " of " + suitName); //print card 2
    
    
    int face3 = (int)(Math.random()*13)+1; //repeat
    suit = (int)(Math.random()*4)+1;
    
         if (suit == 1){
        suitName = "Clubs";
    }
    
    if (suit == 2){
        suitName = "Spades";
    }
    
     if (suit == 3){
        suitName = "Diamonds";
    }
    
     if (suit == 4){
        suitName = "Hearts";
    }
    
    switch ( face3 ){
        case 1:
            faceValue = "Ace";
        break;
        
        case 2:
            faceValue = "2";
        break;
        
        case 3:
            faceValue = "3";
        break;
        
        case 4:
            faceValue = "4";
        break;
        
        case 5:
            faceValue = "5";
        break;
        
        case 6:
            faceValue = "6";
        break;
        
        case 7:
            faceValue = "7";
        break;
        
        case 8:
            faceValue = "8";
        break;
        
        case 9:
            faceValue = "9";
        break;
        
        case 10:
            faceValue = "10";
        break;
        
        case 11:
            faceValue = "Jack";
        break;
        
        case 12:
            faceValue = "Queen";
        break;
        
        case 13:
            faceValue = "King";
        break;
            
    }
    
    System.out.println("     the " + faceValue + " of " + suitName); //card 3
    
    
    int face4 = (int)(Math.random()*13)+1;
    suit = (int)(Math.random()*4)+1;
    
             if (suit == 1){
        suitName = "Clubs";
    }
    
    if (suit == 2){
        suitName = "Spades";
    }
    
     if (suit == 3){
        suitName = "Diamonds";
    }
    
     if (suit == 4){
        suitName = "Hearts";
    }
    
    switch ( face4 ){
        case 1:
            faceValue = "Ace";
        break;
        
        case 2:
            faceValue = "2";
        break;
        
        case 3:
            faceValue = "3";
        break;
        
        case 4:
            faceValue = "4";
        break;
        
        case 5:
            faceValue = "5";
        break;
        
        case 6:
            faceValue = "6";
        break;
        
        case 7:
            faceValue = "7";
        break;
        
        case 8:
            faceValue = "8";
        break;
        
        case 9:
            faceValue = "9";
        break;
        
        case 10:
            faceValue = "10";
        break;
        
        case 11:
            faceValue = "Jack";
        break;
        
        case 12:
            faceValue = "Queen";
        break;
        
        case 13:
            faceValue = "King";
        break;
            
    }
    
    System.out.println("     the " + faceValue + " of " + suitName); //card 4
    
    
    int face5 = (int)(Math.random()*13)+1;
    suit = (int)(Math.random()*4)+1;
    
             if (suit == 1){
        suitName = "Clubs";
    }
    
    if (suit == 2){
        suitName = "Spades";
    }
    
     if (suit == 3){
        suitName = "Diamonds";
    }
    
     if (suit == 4){
        suitName = "Hearts";
    }
    
    switch ( face5 ){
        case 1:
            faceValue = "Ace";
        break;
        
        case 2:
            faceValue = "2";
        break;
        
        case 3:
            faceValue = "3";
        break;
        
        case 4:
            faceValue = "4";
        break;
        
        case 5:
            faceValue = "5";
        break;
        
        case 6:
            faceValue = "6";
        break;
        
        case 7:
            faceValue = "7";
        break;
        
        case 8:
            faceValue = "8";
        break;
        
        case 9:
            faceValue = "9";
        break;
        
        case 10:
            faceValue = "10";
        break;
        
        case 11:
            faceValue = "Jack";
        break;
        
        case 12:
            faceValue = "Queen";
        break;
        
        case 13:
            faceValue = "King";
        break;
            
    }
    
    System.out.println("     the " + faceValue + " of " + suitName); //card 5
    
    //The following lines are to identify a pair, two pair, 3 of a kind, or a high card hand.
    String hand = ""; //create a string for the hand to be asigned from the if, else if, and else statements.
    //The first if statement is a list of all possible 3 of a kind hands and takes precedent over the pair and high card hands.
    //It has been checked for mistakes. If the condition is met, it will assign the hand to be three of a kind.
    if (face1 == face2 && face1 == face3 || face1 == face3 && face1 == face4 || face1 == face4 && face1 == face5 ||
        face2 == face3 && face2 == face4 || face2 == face4 && face2 == face5 || face3 == face4 && face3 == face5){
       hand = "three of a kind!!!";
         }
         
         //the first else if lists all possible "two pairs" with precedent over single pairs.
        else if (face1 == face2 && face3 == face4 || face1 == face2 && face3 == face5 || face1 == face2 && face4 == face5 ||
                 face1 == face3 && face2 == face4 || face1 == face3 && face2 == face5 || face1 == face3 && face4 == face5 ||
                 face1 == face4 && face2 == face3 || face1 == face4 && face2 == face5 || face1 == face4 && face3 == face5 ||
                 face1 == face5 && face2 == face3 || face1 == face5 && face2 == face4 || face1 == face5 && face3 == face4){
            hand = "two pair!!";
             }
             
             //if there are no two pairs or 3's of a kind, the next else if will check for single pairs.
            else if (face1 == face2 || face1 == face3 || face1 == face4 || face1 == face5 || face2 == face3 || face2 == face4 ||
                     face2 == face5 || face3 == face4 || face3 == face5 || face4 == face5 ){
                  hand = "a pair!";
                }
                
                    //if no pairs of 3's of a kind are met, hand will be assigned high card hand.
                  else{
                      hand = "a high card hand!";
                    }
            
            System.out.println("You have " + hand); //Print the type of hand.
    //Three of a kind is confirmed to function. It's probability is low.
    }

}