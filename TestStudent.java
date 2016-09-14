import java.util.Scanner;


public class TestStudent{

  public static void main(String[] args) {
  
    // get user input
    Scanner input = new Scanner(System.in);
    
    //prompt the user for input
    System.out.println("Enter your name: ");
    
    //get user input
    String name = input.next();
    
    System.out.println("Your name is " + name);
    
    System.out.println("What year so you graduate?");
    
    int graduationYear = input.nextInt();
    
    System.out.println("Year of graduation: " + graduationYear);
    
    String classes = "";
    
     // is for when it is true or fase
    if (graduationYear == 17){
      
      classes = "Senior";
      
    }
    else if (graduationYear == 18){
      classes = "Junior";
    }
    else if (graduationYear == 19){
      classes = "Sophmore";
    }
    else{
      classes = "Freshmen";
    }
    
    System.out.println("you are a " + classes);
    
  }

}