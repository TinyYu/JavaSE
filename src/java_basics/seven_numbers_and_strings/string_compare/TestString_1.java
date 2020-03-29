package java_basics.seven_numbers_and_strings.string_compare;

/**
 * 内容是否相同
 **/
public class TestString_1 {
    public static void main(String[] args) {
        String str1 = "the";
        String str2 = "The";

        //大小写必须一致，equals才为true
        System.out.println(str1.equals(str2));

        //忽略大小写判断内容是否一致
        System.out.println(str1.equalsIgnoreCase(str2));
    }
} 
