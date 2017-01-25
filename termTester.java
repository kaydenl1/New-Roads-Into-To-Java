public class termTester{

public static void main(String[] args){
    
    Term t = new Term();
    t.setCoefficient(4);
    t.setVariable('x');
    t.setPower(2);
  
    Term t2 = new Term();
    t2.setCoefficient(-35);
    t2.setVariable('x');
    t2.setPower(-2);
    
    Equation eq = new Equation();
  
    eq.addTerm(t);
    eq.addTerm(t2);

    System.out.println(eq);

    System.out.println("Coefficient of first term: " + eq.getTerm(0));
    
 }
}