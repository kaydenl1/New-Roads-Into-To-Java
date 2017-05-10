import java.util.Scanner;
// this inports the scanner which is what makes it so that the program can take in user input

public class MathTool{
  // this is declaring that MathTool is a class
  
  public static void main(String[] args){
    //this is the main method
  
   Scanner input = new Scanner(System.in);
    //this is declaring the scanner is a input
    
   System.out.println(" ");
   System.out.println("Hello user, this is my programing project. It finds the inverses of funcions");

   System.out.println("                  ***************************");
   System.out.println("                  *                         *");
   System.out.println("                  *                         *");
   System.out.println("                  *         INVERSES        *");
   System.out.println("                  *                         *");
   System.out.println("                  *                         *");
   System.out.println("                  ***************************");
    
   System.out.println("                             Rules  ");
   System.out.println("             -----------------------------------------");
   System.out.println("     1. Enter as many terms as you want at your computers own risk  ");
   System.out.println(" 2. Use only addition, subtraction, multiplication, and devision signes  ");
   System.out.println("       ");
   System.out.println("       ");
   System.out.println("This is the friendly math tool. Enter in the number of terms you want to use.");
    
    //that was the starting sequence that says the rules
  
   int numTerm = input.nextInt();
    // this is an int (number variable) and says that it is an input
  
   System.out.println("enter the equation term by term");
    
    //this is just more instructions
  
  Equation equation = new Equation();
    
    //this is creating a verable equation (makes a space in memory)
  
    char opperator;
    
  for(int i = 0; i < numTerm; i++){
    //this is saying to keep the loop running untill the game has outputed all of the terms
    
    System.out.println("Give the coefficient");
    //instrustions to the user
    int cof = input.nextInt();
    //stores a number in cof for coefficient
    System.out.println("Give the variable");
    //instrustions to the user
    char var = input.next().charAt(0);
    //stores a variable
    System.out.println("Give the power");
    //instrustions to the user
    int pow = input.nextInt();
    //stores a number in the variable for power
    System.out.println("give the opperator");
    //instrustions to the user
    opperator = input.next().charAt(0);
    //this stores the opperator to go in front of the term
    equation.addTerm(opperator, cof, var, pow);
    //this is telling the program how to organize each term
    System.out.println("enter in the next term");
    //instrustions to the user
    
   }
    
  //  if(opperator == "+"){
    
   // }
   // if(opperator == "-"){
    
   // }
    
    if (opperator == '+'){
      opperator = '-';
    }
    if (opperator == '-'){
      opperator = '+';
    }
    
    System.out.println(" ");
    System.out.println(equation);
    //This line prints out the equation
    
  }

}