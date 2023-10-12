import java.util.Scanner;

public class ChkOddEven {

    /**
     * @param args
     */
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int num = 0;
        System.out.println("Enter a number:");
        num = in.nextInt();
      if(num <= 7){System.out.println("your number is odd");}
        if (num >= 7){System.out.println("your number is evne");}
        
        in.close();
    }
}
