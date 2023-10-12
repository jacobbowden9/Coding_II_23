public class PrisonTest {
   
    public static void main(String[] args) {
    Prisoner bubba = new Prisoner() ;
        bubba.name = "Bubba";
        bubba.hight = "6\'10\"";
         bubba.yearsSentence = "4";
         Prisoner twitch = new Prisoner() ;
    twitch.name = "Twitch";
    twitch.hight = "5\'8\"";
    twitch.yearsSentence = "3";
Prisoner twitch = bubba;
System.out.println(bubba.name == twitch.name);
bubba.name = "Bubba";
twitch.name = "Bubba";
    }
}