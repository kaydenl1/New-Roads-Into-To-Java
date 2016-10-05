import java.util.Scanner;


public class TestLoop{


public static void main(String[] args){
  
  Scanner input = new Scanner(System.in);
  
  int num = input.nextInt();

// this is what you would do without a for loop
/*
System.out.println("0");
System.out.println("1");
System.out.println("2");
System.out.println("3");
System.out.println("4");
System.out.println("5");

*/
/*
for(int i = 0; i <= 5; i++){
  

  
  if(i % 2 == 0){
    System.out.println(i);
  }



}
*/
  System.out.println("Enter a hole number");
  
  int i;
  while(num < 10){
    
    System.out.println(num + "dogs");
    
    System.out.println ("Enter a hole number: ");
    num = input.nextInt();

  }

}

}