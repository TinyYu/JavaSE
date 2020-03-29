package java_MiddleRank.exception.test.test_4;

/**
 * @author: ly
 * @date: 2020/03/12
 **/
public class OverdraftException extends Exception {
    private double deficit;//透支额

    public OverdraftException(String message,double deficit){
        super(message);
        this.deficit = deficit;
    }

    public double getDeficit(){
        return deficit;
    }
} 
