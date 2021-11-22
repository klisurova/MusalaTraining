package OOP;

import java.util.Arrays;
import java.util.concurrent.Callable;

public class ComputerVlatko {
    private String model;
    private double procSpeed;
    private String[] fileNames;

    public ComputerVlatko(String model) {
        this.model = model;
    }

    public ComputerVlatko(String model, double procSpeed) {
        super(model);
        this.procSpeed = procSpeed;

    }

    public ComputerVlatko(String model, double procSpeed, String[] fileNames) {
        //super(model, procSpeed);
        this.fileNames = fileNames;
        this.model = model;
        this.procSpeed = procSpeed;
    }

    public ComputerVlatko() {
        System.out.println("Default constructor that creates empty object");
    }

    public void setModel(String model) {
        if (model == null) {
            System.out.println("No Computer type specified");
        } else this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setProcSpeed(double procSpeed) {
        if (procSpeed < 1.1) {
            System.out.println("Unidentified Processor Speed");
        } else this.procSpeed = procSpeed;
    }

    public double getProcSpeed() {
        return procSpeed;
    }

    public void setFileNames(String[] fileNames) {
        if (fileNames == null) {
            System.out.println("The computer has no files stored");
        } else this.fileNames = fileNames;
    }

    public String[] getFileNames() {
        return fileNames;
    }

    // public String toString();


    //System.out.println(this.model);
//System.out.println(this.procSpeed);
//System.out.println(Arrays.toString(this.fileNames));
    // }

    public static void main(String[] args) {

        System.out.println("Initial computers' data ");
        System.out.println("*************************");
        System.out.println();

        Computer computer1 = new Computer("HP", 2.4);
        Computer computer2 = new Computer("MAC");
        Computer computer3 = new Computer("MAC", 2.4, new String[]{"file1", "file2"});


        System.out.println(computer1);
        System.out.println(computer2);
        System.out.println(computer3);

        System.out.println();
        System.out.println("Data after modifications ");
        System.out.println("*************************");
        System.out.println();

        computer1.setProcSpeed(10.5);
        computer2.setModel("ASUS");
        computer3.setFileNames(new String[]{"file3", "file4"});

        computer1.toString();
        computer2.toString();
        computer3.toString();


    }
}