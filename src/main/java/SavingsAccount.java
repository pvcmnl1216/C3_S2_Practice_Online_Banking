/*
 * Author Name: Philip Meshach
 * Date: 24-08-2022
 * Praise The Lord
 */

public class SavingsAccount {
    long accountNumber;
    String accountHolderName;
    double accountBalance;
    String accountStatus;

    public SavingsAccount(long accountNumber, String accountHolderName, double accountBalance, String accountStatus) {
        this.accountStatus = accountStatus;
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountBalance = accountBalance;

    }

    public SavingsAccount() {

    }


    public void customer(String withdraw, String deposit, String checkBalance) {
    }

    public void savingsAccount(String debitCash, String creditCash, String transferFund) {
    }

    public double debitCash(double debitCash) {
        double balance = accountBalance - debitCash;
        return balance;
    }

    public double creditCash(double creditCash) {
        double balance = accountBalance + creditCash;
        return balance;
    }

    double fundTransfer() {
        return 0;
    }

}
