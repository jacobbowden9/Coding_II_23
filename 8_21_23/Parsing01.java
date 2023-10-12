public class Parsing01 {
    public static void main(String[] args) {
        //Declare and intitialize 3 Strings: shirtPrice, taxRate, and gibberish
        int shirtPrice = "15";
        double taxRate = "0.05";
        String gibberish = "xdb485ogt7yifry8if5rgy";
        
        
        //Parse shirtPrice and taxRate, and print the total tax
    System.out.println(Integer.parseInt(shirtPrice) * Integer.parseInt(taxRate));
        
        
        //Try to parse taxRate as an int
        Double.parseDouble(taxRate);
        //Try to parse gibberish as an int
        Integer.parseInt(gibberish);
    }
    
}
