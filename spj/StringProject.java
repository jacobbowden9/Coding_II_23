package spj;
import java.io.*;


public class StringProject {
private String myString;
public StringProject (String str) {
myString = str;
}
public String toString() {
return myString;

}
public String reverString() {
    String str = myString;
    String reveString = "";
       for (int i = 0; i < str.length(); i++) {
          char c = str.charAt(i);
          if(Character.isUpperCase(c)){
            c = Character.toLowerCase(c);
          }else {
            c = Character.toUpperCase(c);
        }
       
         reveString += c;
    }
    return reveString;
 }
public StringProject() {
    
}
/*public String reverseCase() {
  
    
    
}*/
public class Main {
  // Function to count occurrences of a character in a string
  public static int characterCount(char ch, int idx, String s) {
    
      if (idx == s.length())
          return 0;
       
      int characterCount = 0;

      
      if (s.charAt(idx) == ch)
          characterCount++;

      characterCount += characterCount(ch, idx + 1, s);

      return characterCount;
  }

  
      
  }
public String characterCount(String string) {
    return "2";
}
public String reverseString() {
    return "t;
}

}



 

 
class GFG {
    public static void main (String[] args) {
       
  
        String str = "This land is your land.", reverseString="";
        char ch;
       
      
      //Example word
       
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); //extracts each character
        reverseString= ch+reverseString; //adds each character in front of the existing string
      }
      System.out.println(reverseString);}
     
       
}



