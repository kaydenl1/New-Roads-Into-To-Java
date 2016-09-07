import java.util.Scanner;
//this is a java class
public class Average{
  
  //this is the main method
  //where the application starts

public static void main(String[] args){

    //this are examples of data types
   /* int x = 3;
    double number = 3.0;
    String word = "hsjfhsdjfhdskjfshkfjhds";
    //hold things that look like text
    char letter = 'x';
   */ //char is carachter
  
    //get user input
    Scanner input = new Scanner(System.in);
    
  //prompt the user
  System.out.println("Enter 3 numbers: ");
    double num1 = input.nextDouble();
    double num2 = input.nextDouble();
    double num3 = input.nextDouble();
    
    double average = (num1 + num2 + num3)/3;
  
  System.out.println("This is the average" + average);
  
  }

}