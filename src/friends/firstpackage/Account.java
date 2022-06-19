package friends.firstpackage;

public class Account {
    private static final int MAX_Debit = -1000;
    private String name;
    private int balance = 0;
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
        int balanceBeforeDeposit = balance;
        if (amount > 0) {
            balance += amount;
            System.out.println("Stan konta: " + balanceBeforeDeposit + " | " + "Wpłata: " + amount + " | Po operacji: " + balance);
            if (balance > 0) {
                debit = false;
            }

        } else System.out.println("Kwota wpłaty musi być dodatnia!");
    }

    public void withdraw(int amount) {
        int balanceBeforeWithdraw = balance;

        if (amount > 0) {
            if (balance - amount < MAX_Debit) {
                System.out.println("Nie można wykonać operacji przekraczającej debet");
            } else {

                balance -= amount;
                System.out.println("Stan konta: " + balanceBeforeWithdraw + " | " + "Wypłata: " + amount + " | Po operacji: " + balance);

                if (balance < 0) {
                    debit = true;
                    System.out.println("Masz ujemny stan konta");
                }
            }
        } else System.out.println("Kwota wypłaty musi być dodatnia!");

    }
    public void transfer(Account other, int amount) {

        if (balance - amount >= MAX_Debit) {
            balance -=amount;
            other.balance += amount;
        }else System.out.println(" Nie można wykonać operacji - brak środków na koncie");
    }

    public String toString() {
        return " Account{name: " + name + ", balance: " + balance + "}";
    }
}

