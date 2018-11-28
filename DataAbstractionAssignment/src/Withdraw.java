import java.util.Date;

public class Withdraw {
    private double amount;
    private Date date;
    private String account;

    Withdraw(double amount, Date date, String account){
        this.amount = amount;
        this.date = date;
        this.account = account;
    }

    //Effects: Prints out how much withdrawn, the date of withdraw, and into which account
    public String toString(){
        return "Withdraw of: " + amount + " Date: " + date + "into account: " + account;
    }
}
