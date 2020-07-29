package coe318.lab5;
// Author: Daniel Khan

public class Card implements Comparable {
  //Symbolic constants

  public static final int CLUB = 0;
  public static final int DIAMOND = 1;
  public static final int HEART = 2;
  public static final int SPADE = 3;

  /**
   * Construct a card of the given rank, suit and whether it is faceup or
   * facedown. The rank is an integer from 2 to 14. Numbered cards (2 to 10)
   * have a rank equal to their number. Jack, Queen, King and Ace have the ranks
   * 11, 12, 13, and 14 respectively. The suit is an integer from 0 to 3 for
   * Clubs, Diamonds, Hearts and Spades respectively.
   *
   * @param rank
   * @param suit
   * @param faceUp
   */
  
  
        private int rank;
        private int suit;
        private boolean faceUp;

  public Card(int rank, int suit, boolean faceUp) {
    //FIX THIS
    
    this.rank = rank;
    this.suit = suit;
    this.faceUp = faceUp;
    
  }

  /**
   * @return the faceUp
   */
  public boolean isFaceUp() {
    return faceUp; //FIX THIS
  }

  /**
   * @param faceUp the faceUp to set
   */
  public void setFaceUp(boolean faceUp) {
    //FIX THIS
    if(faceUp){
        this.faceUp = true;}
    else
        this.faceUp = false;
    
    
  }

  /**
   * @return the rank
   */
  public int getRank() {
    return rank; //FIX THIS
  }

  /**
   * @return the suit
   */
  public int getSuit() {
    return this.suit;//FIX THIS
  }

  @Override
  public boolean equals(Object ob) {
    if (!(ob instanceof Card)) {
      return false;
    }
    Card c = (Card) ob;
    
    
    if(this.rank == c.rank && this.suit ==c.suit)
    return true;
    else 
        return false;//FIX THIS
  }

  @Override
  public int hashCode() {//DO NOT MODIFY
    int hash = 7;
    hash = 31 * hash + this.getRank();
    hash = 31 * hash + this.getSuit();
    return hash;
  }

  @Override
  public int compareTo(Object obj) {//DO NOT MODIFY
    return compareTo((Card) obj);
  }

  public int compareTo(Card c) {
   
    if(this.equals(c)){
        return 0;
    }
    else if(rank == c.getRank()){

            if(suit < c.getSuit()){
                return -1;
            }
            else if(suit > c.getSuit()){
                return 1;
            }
            else{
                return 0;
            }
        }
        else if(rank < c.getRank()){
            return -1;
        }
        else if(rank > c.getRank()){
            return 1;
        }
        else return -2;
        //FIX THIS-
    
  
      
     // return 0;//FIX THIS
}

  /**
   * Return the rank as a String. For example, the 3 of Hearts produces the
   * String "3". The King of Diamonds produces the String "King".
   *
   * @return the rank String
   */
  public String getRankString() {
      
     if(this.rank == 2)
            return "2";
        else if(this.rank == 3)
            return "3";
        else if(this.rank == 4)
            return "4";
        else if(this.rank == 5)
            return "5";
        else if(this.rank == 6)
            return "6";
        else if(this.rank == 7)
            return "7";
        else if(this.rank == 8)
            return "8";
        else if(this.rank == 9)
            return "9";
        else if(this.rank == 10)
            return "10";
        else if(this.rank == 11)
            return "Jack";
        else if(this.rank == 12)
            return "Queen";
        else if(this.rank == 13)
            return "King";
        else if (this.rank == 14) //|| this.rank == 11)
            return "Ace";
        else 
            return "Ace";
     
           
  }

  /**
   * Return the suit as a String: "Clubs", "Diamonds", "Hearts" or "Spades".
   *
   * @return the suit String
   */
  public String getSuitString() {
      
       if(this.getSuit() == 0){
            return "Clubs";
        }
        else if(this.getSuit() == 1){
            return "Diamonds";
        }
        else if(this.getSuit() == 2){
            return "Hearts";
        }
        else if(this.getSuit() == 3){
            return "Spades";
        }
        else{
            return "INVALID";
      
        }
  }

  /**
   * Return "?" if the card is facedown; otherwise, the rank and suit of the
   * card.
   *
   * @return the String representation
   */
  @Override
  public String toString() {
      if(!this.faceUp)
          return "?,";
      else if(this.faceUp) 
          return ( getRankString() + " of " + getSuitString() + "\n\t");
      else 
          return "error";
      
  }
  
  
  

  public static void main(String[] args) {
    //Create 5 of clubs
    Card club5 = new Card(5, 0, true);
    System.out.println("club5: " + club5);
    Card spadeAce = new Card(14, SPADE, true);
    System.out.println("spadeAce: " + spadeAce);
    System.out.println("club5 compareTo spadeAce: "
            + club5.compareTo(spadeAce));
    System.out.println("club5 compareTo club5: "
            + club5.compareTo(club5));
    System.out.println("club5 equals spadeAce: "
            + club5.equals(spadeAce));
    System.out.println("club5 equals club5: "
            + club5.equals(club5));
  }
}
