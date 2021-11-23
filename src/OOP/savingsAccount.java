package OOP;

public class savingsAccount {

    private double AnnualInterestRate;
    private double SavingsBalance;
    private int Number;

    public savingsAccount(double AnnualInterestRate) {
        this.AnnualInterestRate = AnnualInterestRate;
    }

    public savingsAccount(double SavingsBalance, int Number) {
        this.SavingsBalance = SavingsBalance;
        this.Number = Number;
    }

    public savingsAccount(double AnnualInterestRate, double SavingsBalance, int Number) {
        this.AnnualInterestRate = AnnualInterestRate;
        this.SavingsBalance = SavingsBalance;
        this.Number = Number;
    }

    public void setAnnualInterestRate(double AnnualInterestRate) {
        this.AnnualInterestRate = AnnualInterestRate;
    }

    public double getAnnualInterestRate() {
        return AnnualInterestRate;
    }

    public void setSavingsBalance(double SavingBalance) {
        this.SavingsBalance = SavingBalance;
    }

    public double getSavingsBalance() {
        return SavingsBalance;
    }

    public void setNumber(int Number) {
        this.Number = Number;
    }

    public int getNumber() {
        return Number;
    }

    double calculateMonthlyInterest;
    public double calculateMonthlyInterest(){
        calculateMonthlyInterest = (this.SavingsBalance*this.AnnualInterestRate)/12;
        return calculateMonthlyInterest;
    }

    public String toString() {
        System.out.println(this.SavingsBalance);
        System.out.println(calculateMonthlyInterest);
        return null;
    }


    public static void main(String[] args) {

    }


}
