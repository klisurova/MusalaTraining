package Basics;

public class SalaryCalculator {
    public static void main(String[] args) {
        //Let's create a variable to define our career
        //Declare variable
        String career;
        System.out.println("Program is starting");

        //Define variable
        career = "Software Engineer";
        System.out.println("My career is: " + career);

        //Declare&Define
        int hoursPerWeek=40;
        int weekPerYear=50;
        double rate=42.50;

        double salary = hoursPerWeek*weekPerYear*rate;

        System.out.println("My salary is: " + salary );

// Compute our annual salary
        // rate*hoursPerWeek*weeksPerYear

    }
}
