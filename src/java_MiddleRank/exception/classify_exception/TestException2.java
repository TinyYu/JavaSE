package java_MiddleRank.exception.classify_exception;

/**
 * 运行时异常
 **/
public class TestException2 {
    public static void main(String[] args) {
        /**
         * 运行时异常RuntimeException指： 不是必须进行try catch的异常
         * Java之所以会设计运行时异常的原因之一，是因为下标越界，
         * 空指针这些运行时异常太过于普遍，如果都需要进行捕捉，代码的可读性就会变得很糟糕。
         */
        //常见运行时异常
        //任何除数不能为0:ArithmeticException
        int k = 5/0;
        //下标越界异常:ArrayIndexOutofBoundsException
        int[] j = new int[5];
        j[6] = 5;
        //空指针异常:NullPointerException
        String str = null;
        str.length();
    }
} 
