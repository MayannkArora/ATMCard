import java.util.HashMap;
import java.util.Objects;

public class Bank {
    HashMap<Integer,User> bank = new HashMap<>();


    private int numberOfUsers = 0;

    public void addUser (User user){

        bank.put(numberOfUsers,user);
        numberOfUsers++;
        System.out.println("User successfully added, user ID is " + (numberOfUsers) );
    }

    public String getBalance(int userID){
        String user = "Hi "+bank.get(userID-1).getFirstName() + " " + bank.get(userID-1).getBalance();
        return user;
    }

    public void makeDeposit(int userID, int amount, int accountPosition){
        bank.get(userID-1).depositMoneyInSaving(amount,accountPosition);
    }

    public void withdrawMoney(int userID, int amount, int accountPosition){
        bank.get(userID-1).depositMoneyInSaving(amount,accountPosition);
    }
    public String viewAccount(int i){
        return bank.get(i).test();
    }

    public boolean accountExists(int userID){
        if(bank.containsKey(userID-1)){
            return true;
        }
        return false;
    }
}
