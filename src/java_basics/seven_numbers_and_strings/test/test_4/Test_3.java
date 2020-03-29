package java_basics.seven_numbers_and_strings.test.test_4;

/**
 * 1. 生成一个长度是3的随机字符串，把这个字符串作为当做密码
 * 2. 使用穷举法生成长度是3个字符串，匹配上述生成的密码
 **/
public class Test_3 {
    public static void main(String[] args) {
        char[] cs = new char[3];
        for (int i = 0; i < cs.length; i++) {
            int num = (int) (Math.random() * 100);
            cs[i] = (char) num;
        }
        String str = new String(cs);
        System.out.println(str);
    }
} 
