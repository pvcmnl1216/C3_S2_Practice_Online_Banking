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

    public SavingsAccount(long accountNumber,String accountHolderName,double accountBalance,String accountStatus){
        this.accountStatus = accountStatus;
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountBalance = accountBalance;

    }
    public SavingsAccount() {

    }


    public void customer(String withdraw, String deposit, String checkBalance){
        return;
    }

    public void savingsAccount(String debitCash,String creditCash,String transferFund){
        return;
    }
    double debitCash() {
        return 0;
    }

    double creditCash() {
        return 0;
    }

    double fundTransfer() {
        return 0;
    }

}
