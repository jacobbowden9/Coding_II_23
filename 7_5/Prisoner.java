//Section 7, Lesson 5 Starter for Exercise 1 - Slide 10

public class Prisoner{
    //Fields 
     String name;
    private double height;
    private int sentence;
    private Cell jailcell;
    private int code;
    public double getheight(){
        return height;}
        public int getcode(){
            return code;}
            public int getsentence(){
                return sentence;}
                public Cell getjailcell(){
                    return jailcell;}
                    
    //Constructor
    public Prisoner(String name, double height, int sentence, Cell jailcell,  int code){
 	this.name = name;
 	this.height = height;
 	this.sentence = sentence;
    this.jailcell = jailcell;
    this.code = code;
}
    
    
    //Methods
        
public Prisoner(String string, double d, int i) {
    }

public void opendoor(){
    if(jailcell.getdoorIsOpen()){
        jailcell.setDoorIsOpen(false);
        System.out.println("The door is closed. ");
    }else{
        jailcell.setDoorIsOpen(true);
        System.out.println("the door is open. ");
    }
}
    public void think(){
        System.out.println("I'll have my revenge.");
    }
    public void display(boolean b){
        System.out.println("Name: " +name);
        System.out.println("Height: " +height);
        System.out.println("Sentence: " +sentence);
        System.out.println("Cell " + jailcell);
    }
    
}
