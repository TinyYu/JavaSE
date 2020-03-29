package java_MiddleRank.exception.test.test_5;

/**
 * @author: ly
 * @date: 2020/03/12
 **/
public class CheckingAccount extends Account {
    private double overdraftProtection;//透支额度

    public CheckingAccount(){

    }

    public CheckingAccount(double balance){
        this.overdraftProtection = balance;
    }

    public void withdrav(double amt) throws OverdraftException {
        if (amt > overdraftProtection){
            throw new OverdraftException("支票透支余额不足,透支余额:" + (overdraftProtection - amt),overdraftProtection - amt);
        }
        overdraftProtection -= amt;
        System.out.println("支票余额:" + getOverdraftProtection());
    }

    public double getOverdraftProtection(){
        return overdraftProtection;
    }
}
