public class EquationTester{
  //making a class to test the equations this is an oraginization and space in memory
  
  public static void main(String[] args){
    //main method
    
    Equation e = new Equation();
    //saying that e is an equation
     
    e.addTerm('-', 2, 'x', 4);
    //these thigs will be in equation e
    
    System.out.println(e.toString());
    //this prints out the equation
    
    Inverse in = new Inverse();
    //this is crating a space to store an inverseS
    
    in.setE(e);
    //this is making e into an inverse
      
    System.out.println(in.getE().toString());
    //this is printing out the the origninal eqaution
    System.out.println(in.getInverse());
    //this is printing out the inverse
    
  }
}