public class termTester{
  //this is creating a class called termTester to work on terms

public static void main(String[] args){
  //main method
    
    Term t = new Term();
  //creating a term
    t.setCoefficient(4);
  //seting term coefficient
    t.setVariable('x');
  //seting variable
    t.setPower(2);
  //setting the power
  
    Term t2 = new Term();
  //creating a new term
    t2.setCoefficient(-35);
  //seting Coefficient
    t2.setVariable('x');
  //setting variable
    t2.setPower(-2);
  //seting power
    
    Equation eq = new Equation();
  //creating a term for an equation
  
    eq.addTerm(t);
  //adding terms
    eq.addTerm(t2);
  //adding terms

    System.out.println(eq);
  //printing the equation

    System.out.println("Coefficient of first term: " + eq.getTerm(0));
  //this is prining out instructions and the first term
    
 }
}