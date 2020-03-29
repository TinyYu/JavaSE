package java_basics.one_variable.literal;

/**
 * 整型字面值
 */
public class Int_Literal {
    public static void main(String[] args) {
        long val = 26L; //以L结尾的字面值表示long类型
        int decVal = 26;//默认是int型
        int hexVal = 0x1a;//16进制
        int oxVal = 032;//8进制
        int binVal = 0b11010;//2进制
        System.out.println(oxVal);
    }
}
