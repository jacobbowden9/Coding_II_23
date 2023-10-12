import java.util.Scanner;

public class ComputeAvg {

    public static void main(String args[]) {
        int [] score =new int[5];
        
        Scanner sc = new Scanner(System.in);

        System.out.println("enter 5 scores");
        int scores1 = sc.nextInt();
        int scores2 = sc.nextInt();
         int scores3 = sc.nextInt();
          int scores4 = sc.nextInt();
           int scores5 = sc.nextInt();
        score[0] = (scores1, scores2 ,scores3 ,scores4 ,scores5);
        
            System.out.println("the avarge is :");
            for (int avg: score) {
                avg = (scores1 + scores2 + scores3 + scores4 + scores5) / 5;
                System.out.println(avg);
                sc.close();
                }
        
    }

}
