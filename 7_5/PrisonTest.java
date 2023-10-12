//Section 7, Lesson 5 Starter for Exercise 1 - Slide 10

public class PrisonTest {
    public static void main(String[] args){
        Cell cell1 = new Cell("854", false, 69420);
        Prisoner bubba = new Prisoner("Bubba", 2.08, 4, cell1, 0);
       bubba.display(false);
       cell1.setIsOpen(69420);
       cell1.setIsOpen(68419);
       cell1.setIsOpen(65418);
       cell1.setIsOpen(64417);
       cell1.setIsOpen(63416);
    }
}
