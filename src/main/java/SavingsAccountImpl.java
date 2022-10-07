/*
 * Author Name: Philip Meshach
 * Date: 24-08-2022
 * Praise The Lord
 */

public class SavingsAccountImpl {
    public static void main(String[] args){
        SavingsAccount savingsAccount = new SavingsAccount(22334455l, "Meshach", 5454555.99, "open");
        System.out.println("accountNumber = " + savingsAccount.accountNumber);
        System.out.println("accountBalance = " + savingsAccount.accountBalance);
        System.out.println("accountHolderName = " + savingsAccount.accountHolderName);
        System.out.println("accountStatus = " + savingsAccount.accountStatus);
        double creditCash = savingsAccount.creditCash(12345.55);
        System.out.println("creditCash = " + creditCash);
        double debitCash = savingsAccount.debitCash(123456.77);
        System.out.println("debitCash = " + debitCash);
        System.out.println("TotalBalance = " + (savingsAccount.accountBalance + creditCash - debitCash));
    }
}
