import java.util.Scanner;
public class CheckingAccount{
    String name ;
    double balance ;
    public void withdraw(double amountToWithraw){
        if (amountToWithraw > balance){
            System.out.println("your too poor");
        }else if (amountToWithraw < 0){
            System.out.println("no negatives");
        }else balance-= 0;
        System.out.println("ok");
        }
    }
    public void displayCustomer(){
        System.out.println("Customer: " + name);
        System.out.println("Balance: " + balance);
        
        
        
}
}