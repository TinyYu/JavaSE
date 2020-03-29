package java_MiddleRank.exception.test.test_4;

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

    public void withdraw(double m) throws OverdraftException{
        if (m > balance){
            throw new OverdraftException("余额不足透支额,透支额度:" + (balance - m),balance - m);
        }
        balance -= m;
    }

    public static void main(String[] args) {
        Account a = new Account(1000);
        System.out.println("余额:" + a.getBalance());
        try {
            a.withdraw(100);
            System.out.println("取款成功,当前余额:" + a.getBalance());
        } catch (OverdraftException e) {
            System.out.println("取款失败:" + e.getMessage());
            e.printStackTrace();
        }

    }

} 
