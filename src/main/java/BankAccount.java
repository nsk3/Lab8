/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    /**
     * enum array with different types of bank account.
     */
    public enum BankAccountType {
        /**checking account.**/
        CHECKINGS,
        /**savings account.**/
        SAVINGS,
        /**student account.**/
        STUDENT,
        /**workplace account.**/
        WORKPLACE
    }

    /**number of the account.**/
    private int accountNumber;
    /**type of bank account.**/
    public BankAccountType accountType;
    /**amount of money in the account.**/
    private double accountBalance;
    /**Name of the owner of the account.**/
    private String ownerName;
    /**The intrest rate of the account balance.**/
    public double interestRate;
    /**How much interest the owner is earning.**/
    private double interestEarned;

    /**
     * constructor for the bank account class.
     * @param name the name of the owner
     * @param accountCategory the type of bank account
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        this.ownerName = name;
        this.accountType = accountCategory;
        this.interestRate = 0;
        this.interestEarned = 0;
        this.accountNumber = Bank.getNumberOfAccount() + 1;
        Bank.totalAccounts++;
    }

    /**
     * getter for the accountNumber variable.
     * @return returns accountNumber
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * setter for the accountNumber variable.
     * @param number the number of the account
     */
    public void setAccountNumber(final int number) {
        this.accountNumber = number;
    }

    /**
     * getter for the accountBalance variable.
     * @return returns accountBalance
     */
    public double getAccountBalance() {
        return accountBalance;
    }

    /**
     * setter for the accountBalance variable.
     * @param balance the balance of the account
     */
    public void setAccountBalance(final double balance) {
        this.accountBalance = balance;
    }

    /**
     * getter for the ownerName variable.
     * @return returns ownerName
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * sets the owner name to the passed parameter.
     * @param name the name that the accountOwner variable should be set to.
     */
    public void setOwnerName(final String name) {
        ownerName = name;
    }

    /**
     * getter for the interestEarned variable.
     * @return returns variable interestEarned
     */
    public double getInterestEarned() {
        return interestEarned;
    }

    /**
     * sets the interest earned to the passed parameter.
     * @param earned the amount of interest that interestEarned is set to.
     */
    public void setInterestEarned(final double earned) {
        this.interestEarned = earned;
    }



    /*
     * Implement getters and setters as appropriate for private variables.
     */
}
