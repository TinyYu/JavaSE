package java_basics.seven_numbers_and_strings.test.test_1;

/**
 * 1. 对byte,short,float,double进行自动拆箱和自动装箱
 *
 * 2. byte和Integer之间能否进行自动拆箱和自动装箱
 *
 * 3. 通过Byte获取byte的最大值
 */
public class Test {
    public static void main(String[] args) {
        //1. 对byte,short,float,double进行自动拆箱和自动装箱
        //byte
        byte b1 = 1;
        //装箱
        Byte b = b1;
        //拆箱
        byte b2 = b;

        //short
        short s = 2;
        //装箱
        Short s1 = s;
        //拆箱
        short s2 = s1;

        //float
        float f = 3.1f;
        //装箱
        Float f1 = f;
        //拆箱
        float f2 = f1;

        //double
        double d = 5.555;
        //装箱
        Double d1 = d;
        //拆箱
        double d2 = d1;


        //2. byte和Integer之间能否进行自动拆箱和自动装箱
        byte bb = 1;
        //不能自动装箱
//        Integer ii = bb;
        //不能自动拆箱
        Integer I = 1;
//        byte bs = I;

        //3. 通过Byte获取byte的最大值
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
    }
} 
