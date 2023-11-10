public class BankAccount {
    private int accountNumber;
    private double accountBalance;
    private String accountName;
    private String email;
    private int phoneNumber;

    public BankAccount() {
        this(234234,2.46,"Name","email",2342342);
    }

    public BankAccount(int accountNumber, double accountBalance, String accountName) {
        this(accountNumber, accountBalance,accountName,"string", 234234);
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.accountName = accountName;
    }

    public BankAccount(
            int accountNumber,
            double accountBalance,
            String accountName,
            String email,
            int phoneNumber
    ) {

        System.out.println("Accoutn constructor with parameters called");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.accountName = accountName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void depositFunds(double deposit) {
        this.accountBalance += deposit;
        System.out.println("Your current balance: " + this.accountBalance);
    }

    public void withdrawFunds(double withdrawal) {
        if(withdrawal > this.accountBalance) {
            System.out.println("You do not have the requisite funds!");
            System.out.println("Your current balance: " + this.accountBalance);
        } else {
            this.accountBalance -= withdrawal;
            System.out.println("Successful Withdrawal!\nYour current balance: " + this.accountBalance);
        }


    }
}
