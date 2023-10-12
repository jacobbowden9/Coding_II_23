package Section7;

public class Card {
    private int ballance;
     private int ticket;
       private int cardNumber;
        private int totalCards;
    
      
       //Constructor
       public Card (int ballance, int ticket,  int totalCards){
      this.ballance = ballance;
      this.ticket = ticket;
      
        this.totalCards = totalCards; 
        totalCards++;
        cardNumber = totalCards;
       }
       
       //Methods
    
          
       
       public void display(){
           System.out.println( "ballance" + getballance());
           System.out.println("ticket: " +getticket());
           System.out.println("totalCards: " +gettotalCards());
         
       }
       
       //Getters
       public int getballance() {
           return ballance;
       }
       public int getticket() {
           return ticket;
       }
       public int gettotalCards() {
           return totalCards;
       }
       
       
       //Setters
       public void setballance(int ballance) {
           this.ballance = ballance;
       }
       public void setticket(int ticket) {
           this.ticket = ticket;
       }
      
public void settotalCards(int totalCards) {
           this.totalCards = totalCards;
}
}