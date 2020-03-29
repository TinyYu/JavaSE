package java_basics.two_operator.ternary_operator;

/**
 * 三元操作符
 */
public class Ternary_operator {
    public static void main(String[] args) {
        int i = 9;
        int i1 = 10;

        int k = i < i1 ? 99:88;
        //相当于
        if (i < i1){
            k = 99;
        }else {
            k = 88;
        }
    }
}
