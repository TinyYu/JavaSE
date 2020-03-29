package java_basics.seven_numbers_and_strings.test.test_3;

import java.util.Scanner;

//通过Scanner从控制台读取字符串，然后把字符串转换为字符数组
public class Test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        char[] cs = str.toCharArray();

        for (int i = 0;i < cs.length;i++){
            if (Character.isUpperCase(cs[i]) || Character.isDigit(cs[i])){
                System.out.println(cs[i]);
            }
        }
    }
} 
