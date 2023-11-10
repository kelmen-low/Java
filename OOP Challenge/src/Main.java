// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

//        BankAccount account = new BankAccount(123456, 1000.00, "Bob Brown", "email@", 1234516);

        BankAccount account = new BankAccount();
        System.out.println(account.getAccountNumber());
        account.depositFunds(100.00);
        account.withdrawFunds(1000.00);

    }
}