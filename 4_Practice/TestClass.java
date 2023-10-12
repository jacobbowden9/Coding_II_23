import java.util.Scanner;

public class TestClass {

    public static void main(String args[]) 
         Scanner cell = new Scanner(System.in);
    Scanner hyp = new Scanner(System.in);
    
int temp = cell.nextInt();
int hip = hyp.nextInt();
double roll = Math.random(2 , 12);
 System.out.println("Temp in celsius is " + temp ); 
 System.out.println("Hypotenuse is " + hip);
 System.out.println("The sum of the dice values is  + roll");   

 int temp = cell.nextInt();
 int hip = cell.nextInt();
 double roll = Math.random()/Math.nextDown(1.0);
 System.out.println("Temp in celsius is " + temp ); 
 System.out.println("Hypotenuse is " + hip);
 System.out.println("The sum of the dice values is"  + roll);   
        //Create an instance of ComputeMethods, 
        //invoke the 3 methods and dispay their results
    }
}
