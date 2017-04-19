public class Term{
  // this is a class to work on the terms

private char opperator;
  //opperator is a variabele
private int coefficient;
  //coefficient is a variable
private char variable;
  //variable is a variable
private int power;
  //power is a variable
  
  public Term(){
    //this is a place to work on term

  }

   public Term(char newOpperator, int newCoefficient, char newVariable, int newPower){
     // thsi is a place to work on term using all of the variables in the ()
     opperator = newOpperator;
     //opperator is a variable
     coefficient = newCoefficient;
     //variable coefficient = a new Coefficient
     variable = newVariable;
     //variable variable = a new Variable
     power = newPower;
     //variable power = variable a newPower
   }
  
  public char getOpperator(){
    //this is a place where we get the value of variable newOpperator
    return opperator;
    //return the original opperator
  }
  
  public void setOpperator(char newOpperator){
    //this is where we will set the opperaor using char newOpperator
    opperator = newOpperator;
    //seting opperator = newOpperator
  }

   public int getCoefficient(){
     //this is a place where we get the value of variable coefficient
     return coefficient;
     //give back the orignal coefficeient
   }
  
   public void setCoefficiont(int newCoefficient){
     //this is where we work on seting the coefficeint using the new Coefficient
      coefficient = newCoefficient;
     //seting coefficent = to newCoefficient
   }
  
    public char getVariable(){
      //this is a place where we get the value of varible 
     return variable;
      //return the original varable
   }
      
   public void setVariable(char newVariable){
     //this is a plave where we set
      variable = newVariable;
     //this is seting the value of variable to the value of the new variable
    }
  
    public int getPower(){
      // this is where we get the value of power
     return power;
      //this is where we reurn power
   }
  
   public void setPower(int newPower){
     //this is where we set the value of power using newPower
      power = newPower;
     //seting power = to newPower
    }
  
   public String toString(){
     //this is where we create the final terms
      return opperator + "" + coefficient + "" + variable + "^" + power + " ";
     // this is the ordering of the terms
    }


}