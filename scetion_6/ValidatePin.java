import java.util.Scanner;

public class ValidatePin {
    public static void main(String args[])
    {
    System.out.print("Type your pin: ");
     Scanner console = new Scanner(System.in);
	
    int number = console.nextInt();
      
        
    while (number > 2385 || number< 2385) {
        System.out.println("nu huh");
        number= console.nextInt();
       
    }
       System.out.println("yes that is your pin scammer get scamed bud");
       console.close();
    //end while
   
    }
    
}
