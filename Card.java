public class Card{
  
  //declaring the properties
  //private String color;
  private String suit;
  private char rank;
  
  //constructor - makes the object
  //zero argument constructor
 public Card(){
    
  }
  
  
  //loaded constructior
  public Card(String newSuit, char newRank){
    
    //color = newColor;
    suit = newSuit;
    rank = newRank;
    
  }
/*
  //the following are mutators
  //color
  public String getColor(){
    return color;
  }
  
  public void setColor(String newColor){
    color = newColor;
  }
  */
  //suit
  public String getSuit(){
    return suit;
  }
  public void setSuit(String newSuit){
    suit = newSuit;
  }
  //rank
  public char getRank(){
    return rank;
  }
  public void setRank(char newRank){
    rank = newRank;
  }
  
  //this prints out the object
  public String toString(){
    return suit + " " + rank;
    
  }
  
}

//this is the end of the class