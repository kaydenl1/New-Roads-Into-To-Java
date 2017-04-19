public class Inverse{
  //this is a class called inverse

private Equation e = new Equation();
  //e is an equation so set asside memory
  
  public Inverse(){
    //a place to work on the inverse
    
  }
  
  public Equation getEquation(){
    //get the equation
    return e;
    //return equation e
  }
  
   public Equation getE(){
     //work on equation getE in here
     return e;
     //return equation e
   }
  
  public void setE(Equation newE){
    // set E using newE
    e = newE;
    //seting the two equal to one another
  }

  public String getInverse(){
    //a place to work on the inverse
    Term term = e.getTerm(0);
    //get the terms
    
    return "x=" + term.getCoefficient() + "y^" + term.getPower();
    //use these inportant variables
  }

}