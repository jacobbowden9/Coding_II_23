import java.util.Scanner;

public class SquareRootWhile {
    public static void main(String args[])
    {
    System.out.print("Type a non-negative integer: ");
     Scanner console = new Scanner(System.in);
	double root = 0;
    int number = console.nextInt();
     root =  Math.sqrt(number) ;  
        System.out.println("The square root of " + number + " " + root);
    while (number < 0) {
        System.out.println("nu huh");
         
       console.close();
        }//end while
   
    }
    
}
