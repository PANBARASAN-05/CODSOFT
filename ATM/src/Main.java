public class Main {
    public static void main(String[] args) {
        // Create a bank account with an initial balance of $1000
        BankAccount userAccount = new BankAccount(1000);

        // Create an ATM with the user's bank account
        ATM atm = new ATM(userAccount);

        // Display the ATM menu and allow transactions
        atm.showMenu();
    }
}
