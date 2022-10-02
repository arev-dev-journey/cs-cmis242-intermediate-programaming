package Week02.Discussion;

public class Account {
    // class attributes
    private int accountNumber;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;

    // default constructor
    public Account() {
        this(12345, 0.0, "default name",
                "default address", "default number");
    }

    // constructor
    public Account(int accountNumber, double balance, String name,
                   String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // setter methods
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // getter methods
    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // class behaviors
    // method to deposit amount to balance
    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit of $" + depositAmount + " made. " + "New balance is $" + this.balance);
    }

    // method to withdraw amount from balance
    public void withdraw(double withdrawalAmount) {
        // validate if balance is greater than withdrawal amount
        if(this.balance - withdrawalAmount < 0) {
            System.out.println("Only $" + this.balance + " available. Withdrawal not processed.");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of $" + withdrawalAmount + " processed. Remaining " +
                    "balance is $" + this.balance);
        }
    }
} // end class

