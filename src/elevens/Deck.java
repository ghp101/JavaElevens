package elevens;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//make a Deck class
public class Deck
{
	public static final int NUMCARDS = 52;
	public static String[] SUITS = "CLUBS HEARTS DIAMONDS SPADES".split(" ");
	
	private List<Card> cards;
	private int top;

   //make a Deck constructor
   	//refer cards to new ArrayList
   	//set top to the top of the deck 51
   	
   	//loop through all suits
   		//loop through all faces 1 to 13
   			//add a new TwentyOneCard to the deck
        public Deck()
        {
            cards = new ArrayList<Card>() {};
            top = 51;
            
            for(String s : SUITS)
            {
                for(int f=1; f<14; f++)
                {
                    cards.add(new BlackJackCard(s, f));
                }
            }
        }
        

   
   //make a dealCard() method that returns the top card
        public String dealCard()
        {
            top--;
            return cards.get(top + 1).toString();
        }
   
   //write a shuffle() method
   	//use Colletions.shuffle
   	//reset the top card 
        
        public void shuffle()
        {
            Collections.shuffle(cards);
            top = 51;
        }
}