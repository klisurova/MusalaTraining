package OOP;

public class Computer {
    String type;
    double procSpeed;
    String[] stringArray;

    public Computer(String type, double procSpeed, String[] stringArray) {
        this.type = type;
        this.procSpeed = procSpeed;
        this.stringArray = stringArray;
    }
    public void setType(String type){
        this.type=type;
    }
    public String getType(){
        return type;
    }

    public void setProcSpeed(double procSpeed){
        this.procSpeed = procSpeed;
    }
    public double getProcSpeed(){
        return procSpeed;
    }
    public void setStringArray(String[] stringArray){
        this.stringArray = stringArray;
    }
    public String[] getStringArray(){
        return stringArray;
    }

    public static void main(String[] args) {
        ...
    }

}
