package java_basics.one_variable.basic;

/**
 * 整数类型
 */
public class Integer {
    public static void main(String[] args) {
        byte b = 1; //长度:8位 取值范围: -128 ~ 127
        short s = 200;//长度:16位 取值范围: -332768 ~ 32767
        int i = 300;//长度:32位 取值范围: -2147483648 ~ 2147483647
        long l = 400;//长度:64位 取值范围: -9223372036854775808 ~ 9223372036854775807

//        如果试图给byte类型的变量赋予超出范围的值，就会产生编译错误
//        byte b2 = 200;
    }
}
