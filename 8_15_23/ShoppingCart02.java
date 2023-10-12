public class ShoppingCart02 {
    public static void main(String[] args) {
        String custName = "Alex";
        String itemDesc = "Shirts";
        String message = custName+" wants to purchase a "+itemDesc;
        
        // Declare and initialize numeric fields: price, tax, quantity.   
        double price = 75000;
        double tax = 0.10;
        int quantity = 75;
        String mesage = "Total price: "+((price*tax+price)*quantity);
        
        // Declare and assign a calculated totalPrice
        
        
        // Modify message to include quantity 
        
        System.out.println(message);
        System.out.println(mesage);
        
        // Print another message with the total cost
        
    }    
}
