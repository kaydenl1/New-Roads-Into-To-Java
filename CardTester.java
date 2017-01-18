public class CardTester{
  
  public static void main(String[]args){
    
   // Card card = new Card("red" , "Dimond" , '8');
    
      //System.out.println(card);
    
    RedCard rCard = new RedCard();
     System.out.println(rCard);
    
    BlackCard bCard = new BlackCard();
      
    rCard.setSuit("dismonds");
    rCard.setRank('9');
      
    bCard.setSuit("Spaids");
    bCard.setRank('8');
   
      System.out.println(bCard);
  /*
    //creating a card object
    Card c = new Card();
    
    c.setColor("black");
    c.setSuit("Clubs");
    c.setRank('3');
    
    System.out.println(c.toString());
    
    Card c2 = new Card();
    
    c2.setColor("red");
    c2.setSuit("dimonds");
    c2.setRank('5');
    
    System.out.println(c2.toString());
    
    Card c3 = new Card();
    
    c3.setColor("green");
    c3.setSuit("spades");
    c3.setRank('T');
    
    System.out.println(c3.toString());
    
    Card c4 = new Card();
    
    c4.setColor("red");
    c4.setSuit("hearts");
    c4.setRank('J');
    
    System.out.println(c4.toString());
    
    Card c5 = new Card();
    
    c5.setColor("black");
    c5.setSuit("spades");
    c5.setRank('Q');
    
    System.out.println(c5.toString());
    
  }
  


*/
  }
}