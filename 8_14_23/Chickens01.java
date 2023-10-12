public class Chickens01 {
    public static void main(String[] args) {
        //Put yout code here
        int eggsPerChicken = 4;
        int chickenCount = 8;
        int totalEggs = 0;
        
  
        totalEggs = eggsPerChicken * chickenCount;

        totalEggs +=  ++chickenCount * eggsPerChicken;

        totalEggs += chickenCount / 2 * eggsPerChicken;
        System.out.println(totalEggs);
    }   
}
