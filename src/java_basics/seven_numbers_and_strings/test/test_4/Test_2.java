package java_basics.seven_numbers_and_strings.test.test_4;

/**
 * 创建一个长度是8的字符串数组
 * 使用8个长度是5的随机字符串初始化这个数组
 * 对这个数组进行排序，按照每个字符串的首字母排序(无视大小写)
 **/
public class Test_2 {
    public static void main(String[] args) {
        String[] strs = new String[8];
        for (int j = 0;j < strs.length;j++) {
            char[] cs = new char[5];
            for (int i = 0; i < cs.length; i++) {
                int num = (int) (Math.random() * 100);
                cs[i] = (char) num;
            }
            String str = new String(cs);
            strs[j] = str;
            System.out.println(strs[j]);
        }
    }
} 
