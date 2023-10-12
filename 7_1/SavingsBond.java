

 public class SavingsBond{
  Scanner sc = new Scanner(System.in);
  SavingsBond {
    public  SavingsBond{}
        int term = 0;
        double perchesPrice = 0;
        

           System.out.println("enter a month 1-60: ");
            if(term<=0  ){
              System.out.println("plese enter a higher number than 0");
            }
            if(term <=0 || term >= 11 ){
              System.out.println("you have bout " + term + " and will earn 0.5% each month");
              System.out.println("at the end of the bond you will make " +  Math.pow(term, 0.5));
            }
            if(term <=12 || term >= 23 ){
              System.out.println("you have bout " + mon + " and will earn 0.5% each month");
              System.out.println("at the end of the bond you will make " +  Math.pow(mon, 1));
            }
            if(term <=24 || term >= 35 ){
              System.out.println("you have bout " + term + " and will earn 0.5% each month");
              System.out.println("at the end of the bond you will make " +  Math.pow(mon, 1.5));
            }
            if(mon <=36 || mon >= 47 ){
              System.out.println("you have bout " + mon + " and will earn 0.5% each month");
              System.out.println("at the end of the bond you will make " +  Math.pow(mon, 2));
            }
            if(mon <=48 || mon >= 60 ){
              System.out.println("you have bout " + mon + " and will earn 0.5% each month");
              
              System.out.println("at the end of the bond you will make " +  Math.pow(mon, 2.5));
            }
          

        }
       }
  }
