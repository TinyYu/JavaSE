package java_MiddleRank.exception.test.test_5;

/**
 * @author: ly
 * @date: 2020/03/12
 **/
public class Account {
    protected double balance;//余额

    public Account(){

    }

    public Account(double init){
        this.balance = init;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double m){
        balance += m;
    }

    public void withdraw(double m) throws OverdraftException {
        if (m > balance){
            m -= balance;
            balance -= balance;
            System.out.println("银行账户余额不足，使用支票");
            CheckingAccount c = new CheckingAccount(10000);
            c.withdrav(m);
        } else {
            balance -= m;
        }
    }

    public static void main(String[] args) {
        Account a = new Account(1000);
        try {
            a.withdraw(10000);
            System.out.println("银行余额:" + a.getBalance());
        } catch (OverdraftException e) {
            System.out.println("取款失败:" + e.getMessage());
            e.printStackTrace();
        }
    }

} 
