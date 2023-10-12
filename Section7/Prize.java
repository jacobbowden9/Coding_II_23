package Section7;

public class Prize {
    private String name;
    private int ticketsneeded ;
    private int iteams; 
    
    public Prize (String name, int iteams,  int ticketsneeded){
        this.name = name;
        this.ticketsneeded = ticketsneeded;
          this.iteams = iteams; 
          
    }
    public int getname() {
        return name;
    }
    public int getticket() {
        return ticketsneeded;
    }
    public int gettotalCards() {
        return totalCards;
    }
    
    
    //Setters
    public void setballance(int ballance) {
        this.name = name;
    }
    public void setticketsneeded(int ticketsneeded) {
        this.ticketsneeded = ticketsneeded;
    }
   
public void settotalCards(int totalCards) {
        this.totalCards = totalCards;
}
}
