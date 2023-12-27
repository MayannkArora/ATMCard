import java.util.ArrayList;

public class User extends Person{
    private ArrayList<Account> accounts = new ArrayList<>();;

    public User(String firstName, String lastName, String email, String dateOfBirth, String houseAddress
            ,String city, String province, String postalCode) {
        super(firstName,lastName,email,dateOfBirth,houseAddress,city,province,postalCode);
        Account account = new Account();
        accounts.add(account);
    }

    public void depositMoneyInSaving(int amount, int accountPosition){
        accounts.get(accountPosition).addBalanceToSavings(amount);
        System.out.println(getBalance());

    }

    public void withdrawMoneyFromSavin(int amount, int accountPosition){
        accounts.get(accountPosition).withdrawFromSavings(amount);
        System.out.println(getBalance());
    }
    public void getMoney(int amount){

    }

    public String test(){
        return "test";
    }
    public String getBalance() {
        StringBuilder balance = new StringBuilder();

        for (Account account : accounts) {
            balance.append(account.returnBalance());
        }

        return balance.toString();
    }




}
