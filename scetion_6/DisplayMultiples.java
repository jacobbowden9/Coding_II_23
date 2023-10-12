import java.util.Scanner;

public class DisplayMultiples {

    public static void main(String args[]) {
        Scanner console = new Scanner(System.in);
         
        System.out.print("Enter the number :  ");
        int num = console.nextInt();
         
         System.out.println(num + " x 1 =" + Math.multiplyExact(num , 1));
         System.out.println(num + " x 2 =" +Math.multiplyExact(num , 2));
         System.out.println(num + " x 3 =" +Math.multiplyExact(num , 3));
         System.out.println(num + " x 4 =" +Math.multiplyExact(num , 4));
         System.out.println(num + " x 5 =" +Math.multiplyExact(num , 5));
         System.out.println(num + " x 6 =" +Math.multiplyExact(num , 6));
         System.out.println(num + " x 7 =" +Math.multiplyExact(num , 7));
         System.out.println(num + " x 8 =" +Math.multiplyExact(num , 8));
         System.out.println(num + " x 9 =" +Math.multiplyExact(num , 9));
         System.out.println(num + " x 10 =" +Math.multiplyExact(num , 10));
         System.out.println(num + " x 11 =" +Math.multiplyExact(num , 11));
         System.out.println(num + " x 12 =" +Math.multiplyExact(num , 12));


       
           
            console.close();
        }
    }


    


