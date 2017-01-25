import java.util.ArrayList;

public class Equation{

 private ArrayList<Term> list = new ArrayList<Term>();
  
  public Equation(){
    
  }
  
  public void addTerm(Term term){
    list.add(term);
  }
  public Term getTerm(int index){
    return list.get(index);
  }
  
  public String toString(){
    String equation = "y=";
    
    for(int i = 0; i < list.size(); i++){
      equation = equation + list.get(i);
    }
    
    return equation;
  }
  
}