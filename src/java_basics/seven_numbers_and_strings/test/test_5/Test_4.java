package java_basics.seven_numbers_and_strings.test.test_5;

/**
 * 把 lengendary 最后一个字母变大写
 **/
public class Test_4 {
    public static void main(String[] args) {
        String str = "lengendary";
        char[] chars = str.toCharArray();
        chars[chars.length - 1] -= 32;
        String str_new = String.valueOf(chars);
        System.out.println(str_new);
    }
} 
