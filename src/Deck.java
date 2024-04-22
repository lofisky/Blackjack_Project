import java.util.ArrayList;	  	   	   	    	      	   	  	
import java.util.Collections;	  	   	   	    	      	   	  	
public class Deck	  	   	   	    	      	   	  	
{	  	   	   	    	      	   	  	
  private ArrayList<Card> cards;	  	   	   	    	      	   	  	
	  	   	   	    	      	   	  	
  public Deck()	  	   	   	    	      	   	  	
  {	  	   	   	    	      	   	  	
    this.cards = new ArrayList<Card> ();	  	   	   	    	      	   	  	
    String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};	  	   	   	    	      	   	  	
    String[] values = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};	  	   	   	    	      	   	  	
	  	   	   	    	      	   	  	
	  	   	   	    	      	   	  	
    for (String suit: suits)	  	   	   	    	      	   	  	
    {	  	   	   	    	      	   	  	
      for (String value: values)	  	   	   	    	      	   	  	
      {	  	   	   	    	      	   	  	
        this.cards.add(new Card(suit, value));	  	   	   	    	      	   	  	
      }	  	   	   	    	      	   	  	
    }	  	   	   	    	      	   	  	
  }	  	   	   	    	      	   	  	
	  	   	   	    	      	   	  	
  public void shuffle()	  	   	   	    	      	   	  	
  {	  	   	   	    	      	   	  	
    Collections.shuffle(cards);	  	   	   	    	      	   	  	
  }	  	   	   	    	      	   	  	
	  	   	   	    	      	   	  	
  public Card deal()	  	   	   	    	      	   	  	
  {	  	   	   	    	      	   	  	
    Card card = cards.remove(0);	  	   	   	    	      	   	  	
    Player player1 = new Player();	  	   	   	    	      	   	  	
    Player player2 = new Player();	  	   	   	    	      	   	  	
    player1.addScore(card);	  	   	   	    	      	   	  	
    return card;	  	   	   	    	      	   	  	
	  	   	   	    	      	   	  	
  }	  	   	   	    	      	   	  	
	  	   	   	    	      	   	  	
}	  	   	   	    	      	   	  	
	  	   	   	    	      	   	  	
// this deck class shuffles all the cards and takes one out