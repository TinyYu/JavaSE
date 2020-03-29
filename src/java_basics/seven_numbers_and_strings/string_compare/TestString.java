package java_basics.seven_numbers_and_strings.string_compare;

/**
 * 是否是同一个对象
 **/
public class TestString {
    public static void main(String[] args) {
        String str1 = "the";

        String str2 = new String(str1);//内容一样但不是同一个对象
        System.out.println(str1 == str2);

        //已存在the字面值，不会创建新的对象
        String str3 = "the";
        System.out.println(str1 == str3);
    }
} 
