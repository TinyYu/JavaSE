package java_basics.two_operator.test;

/**
 * 带符号右移和无符号右移
 */
public class Test_2 {
    public static void main(String[] args) {
        /**
         * 带符号右移 >>
         */
        int i = -10;
        //-10二进制为: 11111111111111111111111111110110
        System.out.println(Integer.toBinaryString(i));
        //对于负数， 带符号右移 >> 会把所有的位右移，并在最前面补1
        //右移一位得到: 11111111111111111111111111111011
        System.out.println(Integer.toBinaryString(i >> 1));
        System.out.println(i >> 1);

        int i1 = 10;
        //10二进制为: 1010
        System.out.println(Integer.toBinaryString(i1));
        //对于正数， 带符号右移 >> 会把所有的位右移，并在最前面补0
        //右移一位得到: 101
        System.out.println(Integer.toBinaryString(i1 >> 1));
        System.out.println(i1 >> 1);


        /**
         * 无符号右移 >>>
         */
        int i2 = -10;
        //-10二进制为: 11111111111111111111111111110110
        System.out.println(Integer.toBinaryString(i2));
        //-10无符号向右移1位，符号位也会向右移，第一位就变成了0
        //得到01111111111111111111111111111011，对应的十进制是2147483643
        System.out.println(Integer.toBinaryString(i2 >>> 1));
        System.out.println(i2 >>> 1);

        int i3 = 10;
        //10的二进制为: 1010
        System.out.println(Integer.toBinaryString(i3));
        //10无符号向右移1位，符号位也会向右移，第一位就变成了0
        //得到0101，对应的十进制是5
        System.out.println(Integer.toBinaryString(i3 >>> 1));
        System.out.println(i3 >>> 1);
    }
}
