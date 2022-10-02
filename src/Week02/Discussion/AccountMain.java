package Week02.Discussion;

public class AccountMain {
    public static void main(String[] args) {
        // construct new instance of class Account
        Account alexsAccount = new Account(9605547,
                0.0, "Alex", "alex@myemail.com",
                "(626)-555-5557");
        // use get methods to retrieve Account attributes
        System.out.println(alexsAccount.getAccountNumber());
        System.out.println(alexsAccount.getBalance());
        System.out.println(alexsAccount.getName());
        System.out.println(alexsAccount.getEmail());
        System.out.println(alexsAccount.getPhoneNumber());

        // use Account methods to withdraw/deposit
        alexsAccount.withdraw(100.0);
        alexsAccount.deposit(50.0);
        alexsAccount.withdraw(100.0);
        alexsAccount.deposit(51.0);
        alexsAccount.withdraw(100.0);
    } // end main
} // end class