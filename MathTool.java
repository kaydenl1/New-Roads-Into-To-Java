import java.util.Scanner;

public class MathTool{
  
  public static void main(String[] args){
  
   Scanner input = new Scanner(System.in);

   System.out.println("This is the friendly math tool. Enter in the number of terms you want to use.");
  
   int numTerm = input.nextInt();
  
   System.out.println("enter the equation term by term");
  
  Equation equation = new Equation();
  
  for(int i = 0; i < numTerm; i++){
    
    System.out.println("Give the coefficient");
    int cof = input.nextInt();
    System.out.println("Give the variable");
    char var = input.next().charAt(0);
    System.out.println("Give the power");
    int pow = input.nextInt();
    
    equation.addTerm(cof, var, pow);
    
   }
    
    System.out.println(equation);
    
  }

}