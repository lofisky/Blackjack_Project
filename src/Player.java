public class Player	  	   	   	    	      	   	  	
{	  	   	   	    	      	   	  	
  private int score;	  	   	   	    	      	   	  	
	  	   	   	    	      	   	  	
  public Player()	  	   	   	    	      	   	  	
  {	  	   	   	    	      	   	  	
    this.score = 0;	  	   	   	    	      	   	  	
  }	  	   	   	    	      	   	  	
	  	   	   	    	      	   	  	
  public int getScore()	  	   	   	    	      	   	  	
  {	  	   	   	    	      	   	  	
     return score;	  	   	   	    	      	   	  	
  }	  	   	   	    	      	   	  	
	  	   	   	    	      	   	  	
	  	   	   	    	      	   	  	
  //score adding method	  	   	   	    	      	   	  	
  public int addScore(Card card)	  	   	   	    	      	   	  	
  {	  	   	   	    	      	   	  	
    if (card.getValue().equals("2"))	  	   	   	    	      	   	  	
    {	  	   	   	    	      	   	  	
      return this.score = this.score + 2;	  	   	   	    	      	   	  	
    }	  	   	   	    	      	   	  	
    if (card.getValue().equals("3"))	  	   	   	    	      	   	  	
    {	  	   	   	    	      	   	  	
      return this.score = this.score + 3;	  	   	   	    	      	   	  	
    }	  	   	   	    	      	   	  	
    if (card.getValue().equals("4"))	  	   	   	    	      	   	  	
    {	  	   	   	    	      	   	  	
      return this.score = this.score + 4;	  	   	   	    	      	   	  	
    }	  	   	   	    	      	   	  	
    if (card.getValue().equals("5"))	  	   	   	    	      	   	  	
    {	  	   	   	    	      	   	  	
      return this.score = this.score + 5;	  	   	   	    	      	   	  	
    }	  	   	   	    	      	   	  	
    if (card.getValue().equals("6"))	  	   	   	    	      	   	  	
    {	  	   	   	    	      	   	  	
      return this.score = this.score + 6;	  	   	   	    	      	   	  	
    }	  	   	   	    	      	   	  	
    if (card.getValue().equals("7"))	  	   	   	    	      	   	  	
    {	  	   	   	    	      	   	  	
      return this.score = this.score + 7;	  	   	   	    	      	   	  	
    }	  	   	   	    	      	   	  	
    if (card.getValue().equals("8"))	  	   	   	    	      	   	  	
    {	  	   	   	    	      	   	  	
      return this.score = this.score + 8;	  	   	   	    	      	   	  	
    }	  	   	   	    	      	   	  	
    if (card.getValue().equals("9"))	  	   	   	    	      	   	  	
    {	  	   	   	    	      	   	  	
      return this.score = this.score + 9;	  	   	   	    	      	   	  	
    }	  	   	   	    	      	   	  	
    if (card.getValue().equals("10"))	  	   	   	    	      	   	  	
    {	  	   	   	    	      	   	  	
      return this.score = this.score + 10;	  	   	   	    	      	   	  	
    }	  	   	   	    	      	   	  	
    if (card.getValue().equals("King") || card.getValue().equals("Queen") || card.getValue().equals("Jack"))	  	   	   	    	      	   	  	
    {	  	   	   	    	      	   	  	
      return this.score = this.score + 10;	  	   	   	    	      	   	  	
    }	  	   	   	    	      	   	  	
	  	   	   	    	      	   	  	
    if (card.getValue().equals("Ace"))	  	   	   	    	      	   	  	
    {	  	   	   	    	      	   	  	
      if (this.score >= 12)	  	   	   	    	      	   	  	
      {	  	   	   	    	      	   	  	
        return this.score = this.score + 1;	  	   	   	    	      	   	  	
      }	  	   	   	    	      	   	  	
      else	  	   	   	    	      	   	  	
      {	  	   	   	    	      	   	  	
        return this.score = this.score + 10;	  	   	   	    	      	   	  	
      }	  	   	   	    	      	   	  	
    }	  	   	   	    	      	   	  	
    return this.score;	  	   	   	    	      	   	  	
  }	  	   	   	    	      	   	  	
}	  	   	   	    	      	   	  	
	  	   	   	    	      	   	  	
	  	   	   	    	      	   	  	
	  	   	   	    	      	   	  	
//this class is just going to score up the player points, maybe i will add a name thing too lol