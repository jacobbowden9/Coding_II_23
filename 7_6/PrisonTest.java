//Section 7, Lesson 6 Starter for Exercise 2 - Slide 16

public class PrisonTest {
    public static void main(String[] args){
        Cell cellA1 = new Cell("A1", false, 1234);
        Cell cellB1 = new Cell("B1", false, 1234);
        Cell cellC1 = new Cell("C1", false, 1234);
        Cell cellD1 = new Cell("D1", false, 1234);
        
        Prisoner bubba = new Prisoner("Bubba", 2.08, 4, cellA1);
         Prisoner coda = new Prisoner("coda", 1, 4, cellB1);
          Prisoner tanner = new Prisoner("tanner", 1.5, 4, cellC1);
           Prisoner doc = new Prisoner("doc", 8, 4, cellD1);

         
        
        
        
    }
}
