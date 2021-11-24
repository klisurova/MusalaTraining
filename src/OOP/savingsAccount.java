package OOP;

public class savingsAccount {

    private static double annualInterestRate = 2.5;
    private double savingsBalance;
    private int number;

    // public savingsAccount(double AnnualInterestRate) {
    //   this.AnnualInterestRate = AnnualInterestRate;
    // }

    public savingsAccount(double savingsBalance) {
        this.savingsBalance = savingsBalance;
        annualInterestRate = 2.5;
    }

    //public savingsAccount(savingsAccount account) {
      //  savingsBalance = account.savingsBalance;
        //annualInterestRate = account.getannualInterestRate();
    //}

    public double getannualInterestRate() {
        return annualInterestRate;
    }

    public void setsavingsBalance(double savingBalance) {
        this.savingsBalance = savingBalance;
    }

    public double getsavingsBalance() {
        return savingsBalance;
    }

    public void setnumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    double calculateMonthlyInterest;

    public double calculateMonthlyInterest() {
        calculateMonthlyInterest = (this.savingsBalance * annualInterestRate) / 12;
        return (calculateMonthlyInterest + this.savingsBalance);
    }

    public String toString() {
        System.out.println(this.savingsBalance);
        System.out.println(calculateMonthlyInterest);
        return null;
    }

    double modifyInterestRate;

    public static void modifyInterestRate(double modifyInterestRate) {
        annualInterestRate = modifyInterestRate;
    }


    public boolean isGreater(savingsAccount account) {
        return this.savingsBalance > account.savingsBalance;
    }

    public static void main(String[] args) {

        savingsAccount account1 = new savingsAccount(1232.5);
        savingsAccount account2 = new savingsAccount(1452.8);
        if (account1.isGreater(account2)) {
            System.out.println("Account1 savings balance is greater than Account2");
        } else System.out.println("Account1 savings balance is NOT greater than Account2");

        System.out.println();
        savingsAccount account3 = new savingsAccount(1232.5);
        if (account1.savingsBalance == account3.savingsBalance) {
            System.out.println("Account1 and Account3 have equal saving balances");
        } else System.out.println("Account1 and Account3 haven't equal saving balances");


    }

}
