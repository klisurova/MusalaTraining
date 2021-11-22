package OOP;

import java.util.Scanner;
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

    public  Computer(String model, double procSpeed, String[] fileNames) {
        this.model = model;
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

        System.out.println("Creation of 3 objects");
        System.out.println(" Enter data for Computer1");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Computer1's model: ");



            }
        }




