import java.util.ArrayList;
public class ArrayListEx1 {

    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
       
        students.add("Amy");
         students.add("Bob");
          students.add("Cindy");
           students.add("David");
           students.remove("Bob");
          
        students.add(0, "Nick");
        students.add(1, "Mike");
           System.out.println(students);
    }
    
}
