package java_MiddleRank.exception.custom_exception;



/**
 * 创建自定义异常
 **/
public class TestException extends Exception{
    //无参构造方法
    public TestException(){

    }

    //有参构造方法，并调用父类的对应的构造方法
    public TestException(String msg){
        super(msg);
    }
} 
