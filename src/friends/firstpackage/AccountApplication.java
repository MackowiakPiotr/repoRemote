package friends.firstpackage;

public class AccountApplication {
    public static void main(String[] args) {
        Account account = new Account();
        account.setName("Konto Premium");
        System.out.println("Nazwa: " + account.getName());
        System.out.println("Stan konta: " + account.getBalance());
        Account otherAccount = new Account();
        account.deposit(1250);
        System.out.println(account);
        account.deposit(-123);
        account.withdraw(56);
       // System.out.println(account);
        account.withdraw(2000);
        account.withdraw(300);
        System.out.println(account);
        System.out.println(otherAccount);
        otherAccount.setName("konto inne");
        account.transfer(otherAccount,150);
        System.out.println(account);
        System.out.println(otherAccount);
    }
}
