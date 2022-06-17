package friends.firstpackage;

public class Account {
    private String name;
    private int balance =0;
    private boolean debit = false;


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }
    public void deposit(int amount) {
        balance += amount;
        if (balance > 0 ){
            debit = false;
        }
    }

    public void withdraw(int amount) {
        balance -= amount;
        if(balance< 0){
            debit = true;
            System.out.println("Masz ujemny stan konta");
        }
    }
}

