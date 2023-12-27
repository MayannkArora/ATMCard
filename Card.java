public class Card {
    private int pin;
    private Account account;

    public Card(Account account){
        this.account = account;
    }

    public void withdrawFromSavings(int amount){
        this.account.withdrawFromSavings(amount);
    }

    public void withdrawFromChecking(int amount){
        this.account.withdrawFromChecking(amount);
    }
}
