
class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Getters...
    public String getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        try {
            if (amount < 0) {
                throw new NegativeNumberException();
            } 
            balance += amount;
            System.out.println("Deposited: $" + amount);
            System.out.println("Balanance: $"+balance+"\n");
            
        } catch (NegativeNumberException e) {
             System.out.println("Deposit amount must be positive.");
            
        }
        
        
        
    }

    public void withdraw(double amount) {
        try{
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance, can't withdraw. Current balance: $" + balance);
           
        } else {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
            System.out.println("Balanance: $"+balance+"\n");
        }}
        catch(InsufficientBalanceException e)
        {
            System.out.println("catched here Enter amount less than or equal to balance amount...");
        }
    }   
    @Override
    public String toString() {
        return "BankAccount [accountNumber=" + accountNumber + ",\n\t     balance=" + balance + "]";
    }
}
class InsufficientBalanceException extends Exception
{
    InsufficientBalanceException(String message)
    {
        System.out.println(message);
    }
}
public class BankMain {
    public static void main(String[] args) {
        BankAccount bk=new BankAccount("1234", 1000);
        System.out.println("Account number:"+bk.getAccountNumber());
        System.out.println("Balance: "+bk.getBalance());

        bk.deposit(-90);
        bk.deposit(304);
        
        bk.withdraw(30);

        bk.withdraw(100000);
        System.out.println(bk.toString());
    }
}