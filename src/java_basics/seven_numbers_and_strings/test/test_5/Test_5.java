package java_basics.seven_numbers_and_strings.test.test_5;

/**
 * Nature has given us that two ears, two eyes, and but one tongue, to the end that we should hear and see more than we speak
 * 把最后一个two单词首字母大写
 **/
public class Test_5 {
    public static void main(String[] args) {
        String str = "Nature has given us that two ears, two eyes, " +
                "and but one tongue, to the end that we should hear and" +
                " see more than we speak";
        System.out.println(str);
        int str_indexof = str.lastIndexOf("two");
        String str_1 = str.substring(str_indexof);
        String str_2 = str.substring(0,str_indexof);
        char[] c = str_1.toCharArray();
        c[0] -= 32;
        String str_new = str_2 + String.valueOf(c);
        System.out.println(str_new);
    }
} 
