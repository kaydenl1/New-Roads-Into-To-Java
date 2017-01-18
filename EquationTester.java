public class EquationTester{
  
  public static void main(String[] args){
    
    Equation e = new Equation();
     
    e.setOpporator('+');
    e.setNumber(8);
    e.setVariable2('x');
    e.setVariable1('y');
    e.setEquals('=');
    
    System.out.println(e.toString());
    
  }
}