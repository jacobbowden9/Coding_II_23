import java.util.Scanner;

public class ComputeSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number (0 to quit): ");
        int num = sc.nextInt();
        for (int i = 0; num != 0 ;  sum--) {
        sum = sum + num;
        System.out.println("Enter a number (0 to quit): ");
        num = sc.nextInt();
        }//end while
        System.out.println("The sum is " + sum);
        sc.close();
        }//end method main

    }

