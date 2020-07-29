package coe318.lab5;

import java.util.Scanner;
// Author: Daniel Khan

public class SimpleUI implements UserInterface 
{
    private BlackjackGame game;
    private Scanner user = new Scanner(System.in);

  @Override
    public void setGame(BlackjackGame game) 
    {
        // Begin the game. Explain what the game is and its instructions.
        this.game = game;
        
        System.out.println("~~~~BLACK JACK GAME~~~~");
        System.out.println("");
        System.out.println("NOTICE : in this game Ace is equal to 1 NOT 11");
    }

  @Override
    public void display() 
    {
        //FIX THIS
        // Display the the amount of cards that you and the house hold.
        System.out.println("The House holds: ");
        System.out.println("\t" + game.getHouseCards());
        System.out.println("You hold: ");
        System.out.println("\t" + game.getYourCards());
        
        
        
    }
  /*
   *  You are asked if you want another card. If you answer yes, you get another face down card and
   *  you will asked again. This continues until you say "no". This ends the game.
   * 
   * @return if you want another card.
   */
  @Override
    public boolean hitMe() 
    {
        //FIX THIS
        // Local variables.
        boolean yesContinue = false;
        char input; 
        // Prompt the user.
        System.out.println("draw another card? (y or n: case sensitive): ");
        input = user.next(".").charAt(0); // To strictly take in one character,
        
        // Check input.
        if(input == 'y')
        {
            yesContinue = true;
        }
        else
        {
            yesContinue = false;
        }

        return yesContinue;
    }

  @Override
    public void gameOver() 
    {
        //FIX THIS
        // Local Variables.
        
        // The game is over. 
        System.out.println("GAME OVER!");
        
        // Display the the amount of cards that you and the house hold.
        System.out.println("The House holds: ");
        System.out.println("" + game.getHouseCards());
        System.out.println("You hold: ");
        System.out.println("" + game.getYourCards());
        
        // Now print out the score.
        System.out.println("Your score is " + game.score(game.getYourCards()));
        System.out.println("The score of the House is " + game.score(game.getHouseCards()));
        
       
        
        if( game.score(game.getYourCards()) < 21 && game.score(game.getHouseCards()) == 21){
              System.out.println(" you lose");
        }

        else if(game.score(game.getYourCards()) == 21 && game.score(game.getHouseCards()) < 21)
            System.out.println("you win");
        
            
            else if (game.score(game.getYourCards()) == game.score(game.getHouseCards()))

                System.out.println(" no one wins");
                

            else if (   game.score(game.getHouseCards()) > 21 && game.score(game.getYourCards()) <= 21)

            System.out.println(" you win");
            
            else if(game.score(game.getHouseCards()) > 21 && game.score(game.getYourCards()) > 21)
                System.out.println("house wins");
               
            
            else if (   game.score(game.getHouseCards()) <= 21 && game.score(game.getYourCards()) > 21)

            System.out.println(" house wins");
            

                    else if ( game.score(game.getHouseCards()) < 21 && game.score(game.getYourCards())  < 21){

			if ( game.score(game.getHouseCards()) > game.score(game.getYourCards()))
					System.out.println("house wins");
                            else 
				 System.out.println("you win");}
        
        
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*
        if(  (game.score(game.getYourCards()) < 21 && game.score(game.getHouseCards()) > 21 ) 
                || ( (game.score(game.getYourCards()) + game.score(game.getHouseCards()) <= 21 )  && game.score(game.getYourCards()) > game.score(game.getHouseCards())  ) )  
        {
            
            System.out.println("YOU WIN!");
        }
        else
        if( (game.score(game.getYourCards()) > 21) 
                || (game.score(game.getYourCards()) == game.score(game.getHouseCards())) )
        {
            System.out.println("YOU .... LOSE. ");  
        }
        else
        {
            System.out.println("No one wins.");
        }
        */
        
        
        
        
        
        
        
        
        
    }

