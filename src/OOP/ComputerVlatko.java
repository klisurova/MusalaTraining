package OOP;

import java.util.Arrays;

public class ComputerVlatko {
    private String model;
    private double procSpeed;
    private String[] fileNames;

    public ComputerVlatko(String model) {
        this.model = model;
    }

    public ComputerVlatko(String model, double procSpeed) {
        this.procSpeed = procSpeed;
        this.model = model;

    }

    public ComputerVlatko(String model, double procSpeed, String[] fileNames) {
        this.fileNames = fileNames;
        this.model = model;
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
        this.procSpeed = procSpeed;
    }

    public double getProcSpeed() {
        if (procSpeed <= 1.1) {
            System.out.println("Unidentified Processor Speed");
        } else this.procSpeed = procSpeed;
        return procSpeed;
    }

    public void setFileNames(String[] fileNames) {
        this.fileNames = fileNames;
    }

    public String[] getFileNames() {
        if (fileNames == null) {
            System.out.println("The computer has no files stored");
        } else this.fileNames = fileNames;
        return fileNames;
    }

    public String toString() {
        System.out.print(this.model + " " + "|" + " ");
        System.out.print(this.procSpeed + " " + "|" + " ");
        System.out.print(Arrays.toString(this.fileNames) + " " + "|" + " ");
        System.out.println();
        return null;
    }

    public static void main(String[] args) {

        System.out.println("Initial Computers' Data ");
        System.out.println("*************************");
        System.out.println();

        ComputerVlatko computer1 = new ComputerVlatko("HP", 2.4);
        ComputerVlatko computer2 = new ComputerVlatko("MAC");
        ComputerVlatko computer3 = new ComputerVlatko("MAC", 2.4, new String[]{"file1", "file2"});

        System.out.print("Computer1: ");
        computer1.toString();
        System.out.print("Computer2: ");
        computer2.toString();
        System.out.print("Computer3: ");
        computer3.toString();

        System.out.println();
        System.out.println("Data After Modifications ");
        System.out.println("*************************");
        System.out.println();

        computer1.setProcSpeed(0.2);
        computer2.setModel("ASUS");
        computer3.setFileNames(new String[]{"file3", "file4"});

        System.out.print("Computer1: ");
        computer1.toString();
        System.out.print("Computer2: ");
        computer2.toString();
        System.out.print("Computer3: ");
        computer3.toString();

        System.out.println();
        System.out.println("Computer1 Model: " + computer1.getModel());
        System.out.println("Computer1 Processor Speed: " + computer1.getProcSpeed());
        System.out.println("Computer1 Files Stored: " + computer1.getFileNames());

        System.out.println();
        System.out.println("Computer2 Model: " + computer2.getModel());
        System.out.println("Computer2 Processor Speed: " + computer2.getProcSpeed());
        System.out.println("Computer2 Files Stored: " + computer2.getFileNames());

        System.out.println();
        System.out.println("Computer3 Model: " + computer3.getModel());
        System.out.println("Computer3 Processor Speed: " + computer3.getProcSpeed());
        System.out.println("Computer3 Files Stored: " + computer3.getFileNames());

    }
}