package java_basics.two_operator.arithmetic_operator;

/**
 * 基本算数操作符
 */
public class Arithmetic_operator {
    public static void main(String[] args) {
        int i = 5;
        int j = 10;
        int a = i + j;
        int b = i * j;
        int c = j / i;
        int d = j - i;

        //运算单位长度不同
        int a1 = 5;
        long b1 = 6;
        //运算结果是long型
        long b2 = a1 + b1;

        //% 取余数(取模)
        int i1 = 5;
        int j1 = 2;
        System.out.println(i1 % j);//输出为1

        //自增、自减
        int i2 = 5;
        System.out.println(i2++);//先取值，再运算,输出为5
        System.out.println(i);//输出为6

        int i3 = 5;
        System.out.println(++i3);//先运算，在取值，输出为6
        System.out.println(i3);//输出为6
    }
}
