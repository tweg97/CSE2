public class CardGenerator{
    
    public static void main(String[] args) {
        
        
    
    int card = (int)(Math.random()*52)+1; //selects a card from 1 to 52 (inclusive)
    int cardno = card % 13; //carno or cardnumber is assigned a value from 0 to 12 based on the remainder of 52 minus a multiple of 13
                            //This number is used to determine the card number from 2 to 10, jack, queen, king, or ace.
         
        if (1 <= card && card<= 13){  //radom numbers from 1 to 13 are assigned the suit Clubs. The remainder from multiples of 13 (cardno) determines the card number
            String suit = "Clubs";
                
            switch( cardno ){ //changes the name of the carno = 0, 1, 11, and 12 to ace, king, queen, or jack
                case 1:
            System.out.println("You have picked the " + "Ace" + " of " + suit + ".");
            break;
                case 2:
            System.out.println("You have picked the " + cardno + " of " + suit + ".");
            break;
                case 3:
            System.out.println("You have picked the " + cardno + " of " + suit + ".");
            break;
                case 4:
            System.out.println("You have picked the " + cardno + " of " + suit + ".");
            break;
                case 5:
            System.out.println("You have picked the " + cardno + " of " + suit + ".");
            break;
                case 6:
            System.out.println("You have picked the " + cardno + " of " + suit + ".");
            break;
                case 7:
            System.out.println("You have picked the " + cardno + " of " + suit + ".");
            break;
                case 8:
            System.out.println("You have picked the " + cardno + " of " + suit + ".");
            break;
                case 9:
            System.out.println("You have picked the " + cardno + " of " + suit + ".");
            break;
                case 10:
            System.out.println("You have picked the " + cardno + " of " + suit + ".");
            break;
                case 11:
            System.out.println("You have picked the " + "Jack" + " of " + suit + ".");
            break;
                case 12:
            System.out.println("You have picked the " + "Queen" + " of " + suit + ".");
            break;
                case 0:
            System.out.println("You have picked the " + "King" + " of " + suit + ".");
            break;
            }
        }
        
        
             if (14 <= card && card<= 26){
            String suit = "Spades";
                
            switch( cardno ){
                case 1:
            System.out.println("You have picked the " + "Ace" + " of " + suit + "!");
            break;
                case 2:
            System.out.println("You have picked the " + cardno + " of " + suit + ".");
            break;
                case 3:
            System.out.println("You have picked the " + cardno + " of " + suit + ".");
            break;
                case 4:
            System.out.println("You have picked the " + cardno + " of " + suit + ".");
            break;
                case 5:
            System.out.println("You have picked the " + cardno + " of " + suit + ".");
            break;
                case 6:
            System.out.println("You have picked the " + cardno + " of " + suit + ".");
            break;
                case 7:
            System.out.println("You have picked the " + cardno + " of " + suit + ".");
            break;
                case 8:
            System.out.println("You have picked the " + cardno + " of " + suit + ".");
            break;
                case 9:
            System.out.println("You have picked the " + cardno + " of " + suit + ".");
            break;
                case 10:
            System.out.println("You have picked the " + cardno + " of " + suit + ".");
            break;
                case 11:
            System.out.println("You have picked the " + "Jack" + " of " + suit + ".");
            break;
                case 12:
            System.out.println("You have picked the " + "Queen" + " of " + suit + ".");
            break;
                case 0:
            System.out.println("You have picked the " + "King" + " of " + suit + ".");
            break;
            }
        }
    
                 if (27 <= card && card<= 39){
            String suit = "Hearts";
                
            switch( cardno ){
                case 1:
            System.out.println("You have picked the " + "Ace" + " of " + suit + ".");
            break;
                case 2:
            System.out.println("You have picked the " + cardno + " of " + suit + ".");
            break;
                case 3:
            System.out.println("You have picked the " + cardno + " of " + suit + ".");
            break;
                case 4:
            System.out.println("You have picked the " + cardno + " of " + suit + ".");
            break;
                case 5:
            System.out.println("You have picked the " + cardno + " of " + suit + ".");
            break;
                case 6:
            System.out.println("You have picked the " + cardno + " of " + suit + ".");
            break;
                case 7:
            System.out.println("You have picked the " + cardno + " of " + suit + ".");
            break;
                case 8:
            System.out.println("You have picked the " + cardno + " of " + suit + ".");
            break;
                case 9:
            System.out.println("You have picked the " + cardno + " of " + suit + ".");
            break;
                case 10:
            System.out.println("You have picked the " + cardno + " of " + suit + ".");
            break;
                case 11:
            System.out.println("You have picked the " + "Jack" + " of " + suit + ".");
            break;
                case 12:
            System.out.println("You have picked the " + "Queen" + " of " + suit + ".");
            break;
                case 0:
            System.out.println("You have picked the " + "King" + " of " + suit + ".");
            break;
            }
        }
        
                     if (40 <= card && card<= 52){
            String suit = "Diamonds";
                
            switch( cardno ){
                case 1:
            System.out.println("You have picked the " + "Ace" + " of " + suit + ".");
            break;
                case 2:
            System.out.println("You have picked the " + cardno + " of " + suit + ".");
            break;
                case 3:
            System.out.println("You have picked the " + cardno + " of " + suit + ".");
            break;
                case 4:
            System.out.println("You have picked the " + cardno + " of " + suit + ".");
            break;
                case 5:
            System.out.println("You have picked the " + cardno + " of " + suit + ".");
            break;
                case 6:
            System.out.println("You have picked the " + cardno + " of " + suit + ".");
            break;
                case 7:
            System.out.println("You have picked the " + cardno + " of " + suit + ".");
            break;
                case 8:
            System.out.println("You have picked the " + cardno + " of " + suit + ".");
            break;
                case 9:
            System.out.println("You have picked the " + cardno + " of " + suit + ".");
            break;
                case 10:
            System.out.println("You have picked the " + cardno + " of " + suit + ".");
            break;
                case 11:
            System.out.println("You have picked the " + "Jack" + " of " + suit + ".");
            break;
                case 12:
            System.out.println("You have picked the " + "Queen" + " of " + suit + ".");
            break;
                case 0:
            System.out.println("You have picked the " + "King" + " of " + suit + ".");
            break;
            }
        }

    }
}