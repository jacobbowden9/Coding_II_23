import java.util.Scanner;

public class Project5 {
     public static void main(String args[]) {
    Scanner sc =  new Scanner(System.in);
     Scanner sct =  new Scanner(System.in);
     Scanner scth =  new Scanner(System.in);
     Scanner scf =  new Scanner(System.in);
    int one;
     int two;
     int three;
     int four;
     System.out.println("Input first number ");
    one = sc.nextInt();
     System.out.println("Input second number ");
    two = sct.nextInt();
     System.out.println("Input third number ");
     three = scth.nextInt();
      System.out.println("Input fourth number ");
      four = scf.nextInt();
    if(one== two && two == three && three == four){System.out.println("your numbers are equal" );}
     if(one > two || two > one){System.out.println("Numbers are not equal!" );}
      
     
                sc.close();
                sct.close();
                scth.close();
                scf.close();
}
}
