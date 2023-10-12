public class CalculatorTest4 {
    public static void main(String[] args) {
        
        Calculator4 calc = new Calculator4();
        double total = 0;
        total += calc.findTotal(10, null );
        //Name your friends
        calc.findTotal(10, "jacob");
        calc.findTotal(12, "Tanner");
        calc.findTotal(9,  "doc");
        calc.findTotal(8,  "chole");
        calc.findTotal(7,  "Mr.gilmore");
        calc.findTotal(15, "Alex");
        calc.findTotal(11, "gabe");
        calc.findTotal(30, "Forgetful");

        //Find and print the entire table's total, including tax and tip
       System.out.println(total);
    } 
}
