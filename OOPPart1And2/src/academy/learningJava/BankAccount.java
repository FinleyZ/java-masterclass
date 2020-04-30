package academy.learningJava;

public class BankAccount {
    private String accountNumber;
    private double  balance;
    private String name;
    private String email;
    private String phoneNumber;

    public BankAccount(){
        this("110",200,"name","123@gmail.123","123");
        System.out.println("empty constructor called");
    }



    public BankAccount(String accountNumber, double balance, String name, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit amount is: " + depositAmount + ". Now balance is: "+ this.balance);
    }

    public void withdrawal(double withdrawalAmount){
        if ( (this.balance - withdrawalAmount) < 0) {
            System.out.println( "Only " + this.balance + " available. Withdrawal not processed");
        }else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal amount is: " + withdrawalAmount + ". Now balance is: "+ this.balance);
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
