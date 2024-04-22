import java.util.ArrayList;	  	   	   	    	      	   	  	
	  	   	   	    	      	   	  	
public class Card	  	   	   	    	      	   	  	
{	  	   	   	    	      	   	  	
  private String suit;	  	   	   	    	      	   	  	
  private String value;	  	   	   	    	      	   	  	
	  	   	   	    	      	   	  	
  public Card(String suit, String value)	  	   	   	    	      	   	  	
  {	  	   	   	    	      	   	  	
    this.suit = suit;	  	   	   	    	      	   	  	
    this.value = value;	  	   	   	    	      	   	  	
  }	  	   	   	    	      	   	  	
	  	   	   	    	      	   	  	
  public String getSuit()	  	   	   	    	      	   	  	
  {	  	   	   	    	      	   	  	
    return suit;	  	   	   	    	      	   	  	
  }	  	   	   	    	      	   	  	
	  	   	   	    	      	   	  	
  public String getValue()	  	   	   	    	      	   	  	
  {	  	   	   	    	      	   	  	
    return value;	  	   	   	    	      	   	  	
  }	  	   	   	    	      	   	  	
	  	   	   	    	      	   	  	
    public String toString()	  	   	   	    	      	   	  	
    {	  	   	   	    	      	   	  	
      return value + " of " + suit;	  	   	   	    	      	   	  	
    }	  	   	   	    	      	   	  	
}	  	   	   	    	      	   	  	
	  	   	   	    	      	   	  	
 //this class just sorts out the display of the given cards