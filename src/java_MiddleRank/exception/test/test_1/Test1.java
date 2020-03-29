package java_MiddleRank.exception.test.test_1;


/**
 * 假设有一个方法 public int method()， 会返回一个整数
 * 在这个方法中有try catch 和 finally.
 * try 里返回 1
 * catch 里 返回 2
 * finally 里 返回3
 * 那么，这个方法到底返回多少？
 **/
public class Test1 {
    public static void main(String[] args) {
        Test1 t = new Test1();
        /**
         * fianlly中的代码一定执行
         *
         * 先执行try中代码，如果try中代码没有异常且有返回值 ，
         * 先会执行 finally中代码 ，如果finally没有返回值，
         * 会回过头执行try的return;如果finally中有返回值。
         * 则直接返回。不会执行try中的return了；
         *
         * catch同理
         */
        System.out.println(t.method());
    }

    public int method(){
        try {
            return 1;
        } catch (Exception e){
            return 2;
        } finally {
            return 3;
        }
    }
} 
