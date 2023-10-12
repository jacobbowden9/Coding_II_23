import java.util.ArrayList;

import java.util.ListIterator;

public class ArrayListEx2 {
    public static void main(String args[]) {
        ArrayList<Integer>nums = new ArrayList<>();
        ListIterator<Integer> num = nums.listIterator();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        
        
while (num.hasNext()) {
    int numb = num.next();
        System.out.println(num);
    if(numb  % 2 == 0){
        num.remove();
    }
}
System.out.println(num);
    }
    }

