package java_basics.seven_numbers_and_strings.string_compare;

/**
 * 是否以子字符串开始或者结束
 **/
public class TestString_2 {
    public static void main(String[] args) {
        String str = "the light";
        String start = "the";
        String end = "Ight";

        //以...开始
        System.out.println(str.startsWith(start));

        //以...结束
        System.out.println(str.endsWith(end));
    }
} 
