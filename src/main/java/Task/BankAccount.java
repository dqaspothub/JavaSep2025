package Task;

public class BankAccount {
    // Static variable
    static String bankName = "ABC Bank";

    // Instance variable
    String accountHolder;

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        account1.accountHolder = "Alice";

        System.out.println("Bank Name: " + BankAccount.bankName);
        System.out.println("Account Holder: " + account1.accountHolder);
    }
}
