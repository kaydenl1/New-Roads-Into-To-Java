public class EquationTester{
  
  public static void main(String[] args){
    
    Equation e = new Equation();
     
    e.addTerm(2, 'x', 4);
    
    System.out.println(e.toString());
    
    Inverse in = new Inverse();
    
    in.setE(e);
      
    System.out.println(in.getE().toString());
    System.out.println(in.getInverse());
    
  }
}