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
    public double calculateMonthlyInterest() {
        calculateMonthlyInterest = (this.SavingsBalance * this.AnnualInterestRate) / 12;
        return (calculateMonthlyInterest + SavingsBalance);
    }

    public String toString() {
        System.out.println(this.SavingsBalance);
        System.out.println(calculateMonthlyInterest);
        return null;
    }

    double modifyInterestRate;

    //public static void setModifyInterestRate(double modifyInterestRate) {

    public void isGreater(){


    };



    public static void main(String[] args) {

        savingsAccount account1 = new savingsAccount(1232.5, 3);
        savingsAccount account2 = new savingsAccount(1452.8, 4);
        if (account1.SavingsBalance == account2.SavingsBalance) {
            System.out.println("Account1 and Account2 have equal saving balances");
        } else System.out.println("Account1 and Account2 haven't equal saving balances");

        System.out.println();
        savingsAccount account3 = new savingsAccount(1232.5,5);
        if (account1.SavingsBalance == account3.SavingsBalance) {
            System.out.println("Account1 and Account3 have equal saving balances");
        } else System.out.println("Account1 and Account3 haven't equal saving balances");
    }

}
