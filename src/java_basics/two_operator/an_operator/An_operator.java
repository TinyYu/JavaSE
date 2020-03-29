package java_basics.two_operator.an_operator;

/**
 * 位操作符
 */
public class An_operator {
    public static void main(String[] args) {
        /**
         * 一个整数的二进制表达
         */
        int i = 5;
        System.out.println(Integer.toBinaryString(i));

        /**
         * 位或 |
         */
        int i1 = 5;
        int i2 = 6;
        System.out.println(i1 | i2);//5的二进制位101，6的二进制位110,位或得111，111的十进制为7

        /**
         * 位与 &
         */
        int i3 = 5;
        int i4 = 6;
        System.out.println(i3 & i4);//5的二进制位101，6的二进制位110,位与得100，100的十进制为4

        /**
         * 异或 ^
         */
        int i5 = 5;
        int i6 = 6;
        System.out.println(i5 ^ i6);//5的二进制位101，6的二进制位110,异或得011,011的十进制为3

        /**
         * 取非 ~
         */
        int i7 = 5;
        System.out.println(~i7);//5的二进制位101,取非得010,010的十进制为-6

        /**
         * << 左移  根据一个整数的二进制表达，将其每一位都向左移动，最右边一位补0
         * >> 右移  根据一个整数的二进制表达，将其每一位都向右移动
         */
        int i8 = 6;
        //6的二进制是110
        System.out.println(Integer.toBinaryString(i8));
        //6向左移1位后，变成1100，对应的10进制是12
        System.out.println(i8<<1);
        //6向右移1位后，变成11，对应的10进制是3
        System.out.println(i8>>1);
    }
}
