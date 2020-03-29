package java_basics.seven_numbers_and_strings.test.test_4;

/**
 * 随机字符串
 */
public class Test_1 {
    public static void main(String[] args) {
        char[] cs = new char[5];
        for (int i = 0;i < cs.length;i++){
            int num = (int)(Math.random() * 100);
            cs[i] = (char)num;
        }
        String str = new String(cs);
        System.out.println(str);
    }
} 
