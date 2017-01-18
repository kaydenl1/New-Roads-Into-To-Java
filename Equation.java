public class Equation{

  private char opporator;
  private char variable1;
  private char variable2;
  private char equals;
  private int number;
  
  public Equation(){
    
  }
  
  
  public Equation(char newOpporator, char newVariable1, char newVariable2, int newNumber, char newEquals){
    opporator = newOpporator;
    variable1 = newVariable1;
    variable2 = newVariable2;
    equals = newEquals;
    number = newNumber;
  }
  
  public char getOpporator(){
    return opporator;
  }
  public void setOpporator(char newOpporator){
    opporator = newOpporator;
  }
  public char getVariable1(){
    return variable1;
  }
   public void setVariable1(char newVariable1){
    variable1 = newVariable1;
  }
  public char getVariable2(){
    return variable2;
  }
   public void setVariable2(char newVariable2){
    variable2 = newVariable2;
  }
  public char getEquals(){
    return equals;
  }
   public void setEquals(char newEquals){
    equals = newEquals;
  }
   public int getNumber(){
    return number;
  }
   public void setNumber(int newNumber){
    number = newNumber;
  }
  
  
   public String toString(){
    return variable1 + " " + equals + " " + opporator + " " + variable2 + " " + opporator + " " + number;
  }

}