public class Card{
  
  //declaring the properties
  private String color;
  private String suit;
  private char rank;
  
  //constructor - makes the object
  
  public Card(){
    color = "red";
    suit = "diamond";
    rank = 'A';
    
  }
  
  //the following are mutators
  //color
  public String getColor(){
    return color;
  }
  
  public void setColor(String newColor){
    color = newColor;
  }
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
    return color + " " + suit + " " + rank;
    
  }
  
}
//this is the end of the class