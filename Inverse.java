public class Inverse{

private Equation e = new Equation();
  
  public Inverse(){
    
  }
  
  public Equation getEquation(){
    return e;
  }
  
   public Equation getE(){
     return e;
   }
  
  public void setE(Equation newE){
    e = newE;
  }

  public String getInverse(){
    Term term = e.getTerm(0);
    
    return "x=" + term.getCoefficient() + "y^" + term.getPower();
  }

}