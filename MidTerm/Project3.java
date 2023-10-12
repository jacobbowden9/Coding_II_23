import java.util.*;


public class Project3 {
    public static void main(String args[]) {
    Scanner in =  new Scanner(System.in);
     Scanner sc =  new Scanner(System.in);
    int month;
     int year;
     System.out.println("Input a month number: ");
    month = in.nextInt();
     System.out.println("Input a year: ");
    year = sc.nextInt();
      
    if(month == 1){System.out.println("January " + year + " has 31 days" );}
     if(month == 2){System.out.println("February " + year + "  has 28 days and 29 in every leap year" );}
      if(month == 3){System.out.println("March " + year + " has 31 days" );}
       if(month == 4){System.out.println("April " + year + " has 30 days" );}
        if(month == 5){System.out.println("May " + year + " has 31 days" );}
         if(month == 6){System.out.println("June " + year + " has 30 days" );}
          if(month == 7){System.out.println("July " + year + " has 31 days" );}
           if(month == 8){System.out.println("August " + year + " has 31 days" );}
            if(month == 9){System.out.println("September " + year + " has 30 days" );}
             if(month == 10){System.out.println("October " + year + " has 31 days" );}
              if(month == 11){System.out.println("November " + year + " has 30 days" );}
               if(month == 12){System.out.println("December " + year + " has 31 days" );}
                if(month >12){System.out.println("type a number below 12" );}
                if(month < 1){System.out.println("type a number higher than 1" );}
                sc.close();
                in.close();
}
}
