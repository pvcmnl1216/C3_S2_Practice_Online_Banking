/*
 * Author Name: Philip Meshach
 * Date: 24-08-2022
 * Praise The Lord
 */

public class SavingsAccountImpl {
    public static void main(String[] args){
        SavingsAccount savingsAccount = new SavingsAccount();
        double savingsAccountDebitCash = savingsAccount.debitCash();
        double savingsAccountCreditCash = savingsAccount.creditCash();
        double savingsAccountFundTransfer = savingsAccount.fundTransfer();
        System.out.println("Debited Cash : Rs." + savingsAccountDebitCash);
        System.out.println("Credited Cash : Rs." + savingsAccountCreditCash);
        System.out.println("Fund Transfer : Rs." + savingsAccountFundTransfer);

    }
}
