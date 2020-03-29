package java_basics.two_operator.logical_operator;

/**
 * 逻辑操作符
 */
public class Logical_operator {
    public static void main(String[] args) {
        /**
         * && / &
         */
        int i = 2;
        //长路与 无论第一个表达式的值是true或者false，第二个的值，都会被运算
        System.out.println(i == 1 & i++ ==2);//无论如何，i++都会被运算，i的值为3
        System.out.println(i);

        int i1 = 2;
        //短路与 如果第一个的表达式为false，第二个表达式不会被运算
        System.out.println(i1 == 1 && i1++ ==2);
        System.out.println(i1);//第二个表达式不会被运算，i1的值为2

        /**
         * || / |
         */
        int i2 = 2;
        //长路或 无论第一个表达式的值是true或者false，第二个的值，都会被运算
        System.out.println(i2 == 1 | i2++ == 2);//无论如何i2++都会被运算，i2的值为3
        System.out.println(i2);

        int i3 = 2;
        //短路或 只要第一个表达式的值是true，第二个表达式不会被运算
        System.out.println(i3 == 1 || i3++ == 2);//第一个表达式的值为false，第二个表达式会被运算，i3++的值为3
        System.out.println(i3);

        /**
         * 取反 !
         */
        boolean b = true;
        System.out.println(b);//true
        System.out.println(!b);//false

        /**
         * 异或^
         * 不同返回真
         * 相同返回假
         */
        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b1^b2);//true
        System.out.println(b1^!b2);//false


    }
}
