package OOP;

import java.util.concurrent.Callable;

public class Computer {
    private String model;
    private double procSpeed;
    private String[] fileNames;

    public  Computer(String model) {
        this.model = model;
    }

    public  Computer(String model, double procSpeed) {
        this.procSpeed = procSpeed;
        this.model = model;
    }

    public  Computer(double procSpeed, String[] fileNames) {
        this.fileNames = fileNames;
        this.procSpeed = procSpeed;
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

    public static void main(String[] args) {

Computer computer1 = new Computer("HP", 2.4);



            }
        }




