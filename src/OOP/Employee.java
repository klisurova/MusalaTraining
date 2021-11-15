package OOP;

public class Employee {
    String FirstName;
    String LastName;
    double MonthSalary;

    public Employee(String FirstName, String LastName, double MonthSalary) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.MonthSalary = MonthSalary;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setMonthSalary(double MonthSalary) {
        if (MonthSalary > 0) {
            this.MonthSalary = MonthSalary;
        } else this.MonthSalary = 0.0;

    }

    public double getMonthSalary() {
        return MonthSalary;
    }

    public class EmployeeTest {
    }

    public static void main(String[] args) {

        Employee employee1 = new Employee("Veselina", "Klisurova", 1000.50);
        Employee employee2 = new Employee("Roger", "Federer", 1023.78);
        double YearSalary1 = 12 * employee1.MonthSalary;
        double YearSalary2 = 12 * employee2.MonthSalary;
        System.out.println("Veselina's yearly salary is " + YearSalary1 + "$");
        System.out.println("Roger'a yearly salary is " + YearSalary2 + "$");
        System.out.println("After a 10% raise, Veselina will get on yearly basis " + (YearSalary1 * 0.1 + YearSalary1) + "$");
        System.out.println("After a 10% raise, Roger will get on yearly basis " + (YearSalary2 * 0.1 + YearSalary2) + "$");

    }
}
