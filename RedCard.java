public class RedCard extends Card{
  
  private String color;

  public RedCard(){
    color = "red";
  }
  
  public String toString(){
    return super.toString() + " " + color;
  }

}