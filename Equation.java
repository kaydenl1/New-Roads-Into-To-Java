import java.util.ArrayList;
//this is inporting an Array into the code

public class Equation{
  //this is saying that Equation is a class

 private ArrayList<Term> list = new ArrayList<Term>();
  //this is saying to set asside a memory slot for an array
  
  public Equation(){
    //this is a class to work on Equation
    
  }
  
  public void addTerm(char opperator, int coefficient, char variable, int power){
    //this is crating a place to put all of the terms into one aray
    list.add(new Term(opperator, coefficient, variable, power));
    //this is creating one list of variables (compiling them)
  }
  public Term getTerm(int index){
    //this is a cpot to get the index
    return list.get(index);
    //geting the index
  }
  
  public String toString(){
    //this is where we can create the equation
    String equation = "y=";
    //this is one part of the equation
    
    for(int i = 0; i < list.size(); i++){
      //saying to add untill terms until the program has satysfied the first user input
      equation = equation + list.get(i);
      //puting the terms in the equation
    }
    
    return equation;
    //the new equation is now stored in equation;
  }
  
}