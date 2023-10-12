import java.util.Scanner;

public class AgeValidity {

    public static void main(String[] args) {
       int age = 18;
        Scanner console = new Scanner(System.in);
        boolean drivingUnderAge = false ;
        drivingUnderAge = age <= 18;
        System.out.println("you are driving under: " + drivingUnderAge); 
        console.close();
        {
       }
    }
}
