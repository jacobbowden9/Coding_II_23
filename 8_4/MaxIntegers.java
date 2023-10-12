public class MaxIntegers {

    public static void main(String[] args) {
        int num1 = 7, num2 = 2, num3 = 7;
        int max = 0;
       
      if (num1 > max) {
max = num1;
}//endif
if (num2 > max) {
max = num2;
}//endif
if (num3 > max) {
max = num3;
}//endif
System.out.println("The max of 3 numbers is " + max);
    }
}