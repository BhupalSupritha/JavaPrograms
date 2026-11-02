class BankAccountNew {
    private String accountNumber;
    private double balance;

    static int accountCount = 0;
    final String accountId;

    // Constructor
    BankAccountNew(String accountNumber, double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Invalid balance");
        }

        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountId = "ACC" + (++accountCount);
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit");
        } else {
            balance = balance + amount;
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal");
        } else if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance = balance - amount;
        }
    }

    // Get balance method
    public double getBalance() {
        return balance;
    }
}

// Main class
public class BankTest {
    public static void main(String[] args) {

        BankAccountNew account =
                new BankAccountNew("123456", 1000);

        account.deposit(500);
        account.withdraw(200);

        System.out.println("Balance: "
                + account.getBalance());

        System.out.println("Accounts created: "
                + BankAccountNew.accountCount);
    }
}