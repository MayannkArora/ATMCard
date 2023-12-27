import java.util.ArrayList;

public class Account {
    private int savingsAccount;
    private int checkingAccount;

    private int savingsID;
    private int checkingID;

    private Branch branch;
    private ArrayList<User> users;


    public Account(){
        this.checkingAccount=0;
        this.savingsAccount=0;
        users = new ArrayList<>();
    }

    public void addUser(User user){
        users.add(user);
    }

    public void addBalanceToSavings(int amount){
        this.savingsAccount+=amount;
    }

    public void addBalanceToChecking(int amount){
        this.checkingAccount+=amount;
    }

    public void withdrawFromSavings(int amount){
        if(this.savingsAccount-amount>=0){
            this.savingsAccount-=amount;
        }
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }


    public void withdrawFromChecking(int amount){
        if(this.checkingAccount-amount>=0){
            this.checkingAccount-=amount;
        }
    }

    public int getCheckingID() {
        return checkingID;
    }

    public int getSavingsID() {
        return savingsID;
    }

    public void setCheckingID(int checkingID) {
        this.checkingID = checkingID;
    }

    public void setSavingsID(int savingsID){
        this.savingsID=savingsID;
    }

    public void transferAmountFromSavings(int amount, Account account){
        if(this.savingsAccount-amount>=0) {
            account.addBalanceToSavings(amount);
            this.savingsAccount-=amount;
        }
    }

    public int getCheckingAccount() {
        return checkingAccount;
    }

    public int getSavingsAccount() {
        return savingsAccount;
    }

    public String returnBalance(){
        return "Balance of saving account: " + " is " + this.getSavingsAccount() +"\n" +
                "Balance of checking account: " +" is " + this.getCheckingAccount();
    }
}
