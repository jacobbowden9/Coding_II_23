

public class Cell {
    private String  name;
    private boolean doorIsOpen;
    private int funcode;
    public String getName(){
        return name;}

        public boolean isDoorIsOpen() {
        return doorIsOpen;
    }

    public void setDoorIsOpen(boolean doorIsOpen) {
        this.doorIsOpen = doorIsOpen;
    }

        public boolean getdoorIsOpen(){
            return isDoorIsOpen();}
    public Cell(String name, boolean door , int code){
    this.name = name;
    this.setDoorIsOpen(door);
    this.funcode = code;
}
public void setIsOpen(int code){
    if(code != funcode){
        setDoorIsOpen(false);
        System.out.println("door is closed");
    }else{setDoorIsOpen(true);
    System.out.println("door is open ");}

}
}
