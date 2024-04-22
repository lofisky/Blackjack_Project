import java.util.Scanner;	 
 	   	   	    	      	   	  	
public class Main	  	   	   	    	      	   	  	
{	  	   	   	    	      	   	  	
  public static void main(String[] args)	  	   	   	    	      	   	  	
  {	  	   	   	    	      	   	  	
    Player player1 = new Player();	  	   	   	    	      	   	  	
    Player player2 = new Player();	  	   	   	    	      	   	  	
    String choice1 = "";	  	   	   	    	      	   	  	
    String choice2 = "";	  	   	   	    	      	   	  	
    String twist = "twist";	  	   	   	    	      	   	  	
    String stick = "stick";	  	   	   	    	      	   	  	
    Deck deck = new Deck();	  	   	   	    	      	   	  	
    deck.shuffle();	  	   	   	    	      	   	  	
	  	   	   	    	      	   	  	
    System.out.println("////////////////////////////////////////");	  	   	   	    	      	   	  	
    System.out.println("Welcome to Blackjack!");	  	   	   	    	      	   	  	
    System.out.println("////////////////////////////////////////");	  	   	   	    	      	   	  	
    System.out.println(" ");	  	   	   	    	      	   	  	
	  	   	   	    	      	   	  	
    Scanner scanner = new Scanner(System. in );	  	   	   	    	      	   	  	
    Card P1Card = deck.deal();	  	   	   	    	      	   	  	
    System.out.println("----------------------------------------");	  	   	   	    	      	   	  	
    System.out.println("Player 1 Current Stats:");	  	   	   	    	      	   	  	
    System.out.println(" ");	  	   	   	    	      	   	  	
    System.out.println("Card: " + P1Card);	  	   	   	    	      	   	  	
    System.out.println("Score: " + player1.addScore(P1Card));	  	   	   	    	      	   	  	
    System.out.println("----------------------------------------");	  	   	   	    	      	   	  	
    System.out.println(" ");	  	   	   	    	      	   	  	
    Card P2Card = deck.deal();	  	   	   	    	      	   	  	
    System.out.println("----------------------------------------");	  	   	   	    	      	   	  	
    System.out.println("Player 2 Current Stats:");	  	   	   	    	      	   	  	
    System.out.println(" ");	  	   	   	    	      	   	  	
    System.out.println("Card: " + P2Card);	  	   	   	    	      	   	  	
    System.out.println("Score: " + player2.addScore(P2Card));	  	   	   	    	      	   	  	
    System.out.println("----------------------------------------");	  	   	   	    	      	   	  	
    System.out.println(" ");	  	   	   	    	      	   	  	
	  	   	   	    	      	   	  	
    int p1turn = 1;	  	   	   	    	      	   	  	
    int p2turn = 1;	  	   	   	    	      	   	  	
	  	   	   	    	      	   	  	
	  	   	   	    	      	   	  	
    while (p1turn == 1 || p2turn == 1)	  	   	   	    	      	   	  	
    {	  	   	   	    	      	   	  	
      if (p1turn == 1 && player1.getScore() < 21)	  	   	   	    	      	   	  	
      {	  	   	   	    	      	   	  	
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");	  	   	   	    	      	   	  	
        System.out.println("~ Player 1, Do you want to Stick or Twist? ~");	  	   	   	    	      	   	  	
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");	  	   	   	    	      	   	  	
        choice1 = scanner.nextLine().toUpperCase();	  	   	   	    	      	   	  	
        System.out.println(" ");	  	   	   	    	      	   	  	
	  	   	   	    	      	   	  	
        while (!choice1.equals(twist.toUpperCase()) && !choice1.equals(stick.toUpperCase()))	  	   	   	    	      	   	  	
        {	  	   	   	    	      	   	  	
          System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");	  	   	   	    	      	   	  	
          System.out.println("Enter Stick or Twist >:(");	  	   	   	    	      	   	  	
          System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");	  	   	   	    	      	   	  	
          choice1 = scanner.nextLine().toUpperCase();	  	   	   	    	      	   	  	
        }	  	   	   	    	      	   	  	
      }	  	   	   	    	      	   	  	
	  	   	   	    	      	   	  	
      if (choice1.equals(twist.toUpperCase()) && p1turn == 1)	  	   	   	    	      	   	  	
      {	  	   	   	    	      	   	  	
        Card turn1 = deck.deal();	  	   	   	    	      	   	  	
        System.out.println("----------------------------------------");	  	   	   	    	      	   	  	
        System.out.println("New Card: " + turn1);	  	   	   	    	      	   	  	
        player1.addScore(turn1);	  	   	   	    	      	   	  	
        System.out.println("Player 1 Score: " + player1.getScore());	  	   	   	    	      	   	  	
        System.out.println("----------------------------------------");	  	   	   	    	      	   	  	
        System.out.println(" ");	  	   	   	    	      	   	  	
        if (p1turn == 1 && player1.getScore() > 21)	  	   	   	    	      	   	  	
        {	  	   	   	    	      	   	  	
          System.out.println("*****************************************");	  	   	   	    	      	   	  	
          System.out.println("Player 1 went bust!! Player 2 wins :>");	  	   	   	    	      	   	  	
          System.out.println("*****************************************");	  	   	   	    	      	   	  	
          p1turn = 0;	  	   	   	    	      	   	  	
          p2turn = 0;	  	   	   	    	      	   	  	
        }	  	   	   	    	      	   	  	
      }	  	   	   	    	      	   	  	
	  	   	   	    	      	   	  	
      else if (choice1.equals(stick.toUpperCase()) && p1turn == 1)	  	   	   	    	      	   	  	
      {	  	   	   	    	      	   	  	
        System.out.println("You chose to Stick.");	  	   	   	    	      	   	  	
        System.out.println("Player 1 Score: " + player1.getScore());	  	   	   	    	      	   	  	
        System.out.println(" ");	  	   	   	    	      	   	  	
        p1turn = 0;	  	   	   	    	      	   	  	
      }	  	   	   	    	      	   	  	
	  	   	   	    	      	   	  	
      if (p2turn == 1 && player2.getScore() < 21)	  	   	   	    	      	   	  	
      {	  	   	   	    	      	   	  	
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");	  	   	   	    	      	   	  	
        System.out.println("~ Player 2, Do you want to Stick or Twist? ~");	  	   	   	    	      	   	  	
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");	  	   	   	    	      	   	  	
        choice2 = scanner.nextLine().toUpperCase();	  	   	   	    	      	   	  	
        System.out.println(" ");	  	   	   	    	      	   	  	
	  	   	   	    	      	   	  	
        while (!choice2.equals(twist.toUpperCase()) && !choice2.equals(stick.toUpperCase()))	  	   	   	    	      	   	  	
        {	  	   	   	    	      	   	  	
          System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!");	  	   	   	    	      	   	  	
          System.out.println("Enter Stick or Twist >:(");	  	   	   	    	      	   	  	
          System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!");	  	   	   	    	      	   	  	
          choice2 = scanner.nextLine().toUpperCase();	  	   	   	    	      	   	  	
        }	  	   	   	    	      	   	  	
      }	  	   	   	    	      	   	  	
      if (choice2.equals(twist.toUpperCase()) && p2turn == 1)	  	   	   	    	      	   	  	
      {	  	   	   	    	      	   	  	
        Card turn2 = deck.deal();	  	   	   	    	      	   	  	
        System.out.println("----------------------------------------");	  	   	   	    	      	   	  	
        System.out.println("New card: " + turn2);	  	   	   	    	      	   	  	
        player2.addScore(turn2);	  	   	   	    	      	   	  	
        System.out.println("Player 2 Score: " + player2.getScore());	  	   	   	    	      	   	  	
        System.out.println("----------------------------------------");	  	   	   	    	      	   	  	
        System.out.println(" ");	  	   	   	    	      	   	  	
        if (p2turn == 1 && player2.getScore() > 21)	  	   	   	    	      	   	  	
        {	  	   	   	    	      	   	  	
          System.out.println("*****************************************");	  	   	   	    	      	   	  	
          System.out.println("Player 2 went bust!! Player 1 wins :>");	  	   	   	    	      	   	  	
          System.out.println("*****************************************");	  	   	   	    	      	   	  	
          p2turn = 0;	  	   	   	    	      	   	  	
          p1turn = 0;	  	   	   	    	      	   	  	
        }	  	   	   	    	      	   	  	
      }	  	   	   	    	      	   	  	
      else if (choice2.equals(stick.toUpperCase()) && p2turn == 1)	  	   	   	    	      	   	  	
      {	  	   	   	    	      	   	  	
        System.out.println("You chose to Stick.");	  	   	   	    	      	   	  	
        System.out.println("Player 2 Score: " + player2.getScore());	  	   	   	    	      	   	  	
        System.out.println(" ");	  	   	   	    	      	   	  	
        p2turn = 0;	  	   	   	    	      	   	  	
      }	  	   	   	    	      	   	  	
    }	  	   	   	    	      	   	  	
	  	   	   	    	      	   	  	
    if (choice1.equals(stick.toUpperCase()) && choice2.equals(stick.toUpperCase()))	  	   	   	    	      	   	  	
    {	  	   	   	    	      	   	  	
      if (player1.getScore() > player2.getScore())	  	   	   	    	      	   	  	
      {	  	   	   	    	      	   	  	
        System.out.println("*****************************************");	  	   	   	    	      	   	  	
        System.out.println("Player 1 wins! :D");	  	   	   	    	      	   	  	
        System.out.println("*****************************************");	  	   	   	    	      	   	  	
      }	  	   	   	    	      	   	  	
      else if (player2.getScore() > player1.getScore())	  	   	   	    	      	   	  	
      {	  	   	   	    	      	   	  	
        System.out.println("*****************************************");	  	   	   	    	      	   	  	
        System.out.println("Player 2 wins! :D");	  	   	   	    	      	   	  	
        System.out.println("*****************************************");	  	   	   	    	      	   	  	
      }	  	   	   	    	      	   	  	
      else	  	   	   	    	      	   	  	
      {	  	   	   	    	      	   	  	
        System.out.println("*****************************************");	  	   	   	    	      	   	  	
        System.out.println("It's a tie! :O");	  	   	   	    	      	   	  	
        System.out.println("*****************************************");	  	   	   	    	      	   	  	
      }	  	   	   	    	      	   	  	
    }	  	   	   	    	      	   	  	
  }	  	   	   	    	      	   	  	
}	  	   	   	    	      	   	  	
// this main goes through the game speaking to the player and using methods from the other classes