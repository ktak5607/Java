public class BankAccount {
    private int accountNumber;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;

    public BankAccount(){
        //call to another constructor has to be the first line in method
        this(1234, 0.0, "Default Name", "", "555-5555");
    }
    public BankAccount(int aNum, double bal, String nm, String eml, String pNum){
        //don't call setters from constructors, can cause problems with
        //inheritance and subclasses, and don't always know build order
        this.name = nm;
        this.accountNumber = aNum;
        this.balance = bal;
        this.email = eml;
        this.phoneNumber = pNum;
    }

    public BankAccount(String name, String email, String phoneNumber) {
        this(1111, 100.00, name, email, phoneNumber);
    }


    public void setAccountNumber(int acntNumber){
        this.accountNumber = acntNumber;
    }
    public void setBalance (double bal){
        this.balance = bal;
    }
    public void setName(String nm){
        this.name =  nm;
    }
    public void setEmail(String eml){
        this.email = eml;
    }
    public void setPhoneNumber(String pNum){
        this.phoneNumber =  pNum;
    }

    public int getAccountNumber(){
        return this.accountNumber;
    }
    public double getBalance(){
        return this.balance;
    }
    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public void deposit(double amount){
        if(amount <= 0){
            System.out.println("Error: Invalid deposit amount.");
        }
        else{
            this.balance += amount;
            System.out.println("The new balance is " + this.balance);
        }
    }
    public void withdraw(double amount){
        if(amount <= 0){
            System.out.println("Error: Invalid withdrawal amount.");
        }
        else if(this.balance - amount < 0){
            System.out.println("Error: Insufficient funds. Current balance is " + this.balance);
        }
        else{
            this.balance -= amount;
            System.out.println("The new balance is " + this.balance);
        }
    }

}
