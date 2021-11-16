package OOP;

public class Computer {
    private String type;
    private double procSpeed;
    private String[] stringArray;

    public void Computer(String type) {//, double procSpeed, String[] stringArray) {
        this.type = type;
    }

    public void Computer(String type, double procSpeed) {
        this.procSpeed = procSpeed;
        this.type = type;
    }

    public void Computer(double procSpeed, String[] stringArray) {
        this.stringArray = stringArray;
        this.procSpeed = procSpeed;
    }

    public void setType(String type) {
        if (type == null) {
            System.out.println("No Computer type specified");
        } else this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setProcSpeed(double procSpeed) {
        if (procSpeed < 1.1) {
            System.out.println("Unidentified Processor Speed");
        } else this.procSpeed = procSpeed;
    }

    public double getProcSpeed() {
        return procSpeed;
    }

    public void setStringArray(String[] stringArray) {
        if (stringArray == null) {
            System.out.println("The computer has no files stored");
        } else this.stringArray = stringArray;
    }

    public String[] getStringArray() {
        return stringArray;
    }

    public static void main(String[] args) {


    }

}
