class BankAccount {
    String account_holder_name;
    double balance;

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited Amount: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn Amount: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void checkBalance() {
        System.out.println("Account Holder: " + account_holder_name);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();

        b1.account_holder_name = "Rahul";
        b1.balance = 5000;

        b1.deposit(2000);
        b1.withdraw(1000);
        b1.checkBalance();
    }
}
