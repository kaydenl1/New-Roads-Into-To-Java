public class InverseTester{
  //this is sayign that InverseTester is a class to be worked in

public static void main(String[] args){
  //main method

Equation e = new Equation();
  //this is saying that e is a equation (setting asside a spot in memory for it)

e.addTerm("+", 2, 'x', 4);
  //adding terms

System.out.println(e.toString());
  //printing put the original equation
  
 Inverse in = new Inverse();
  //this is saying to set asside a spot in memory for in which is an inverse
  
  in.setE(e);
  //seting the equation e
  
  System.out.println(in.getE().toString());
  //print out the original equation
  System.out.println(in.getInverse());
  //print out the inverse

}

}