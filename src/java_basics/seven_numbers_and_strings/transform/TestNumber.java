package java_basics.seven_numbers_and_strings.transform;

/**
 * 数字转字符串
 */
public class TestNumber {
    public static void main(String[] args) {
        int i = 5;

        //方法1
        String str = String.valueOf(i);

        //方法2
        Integer it = i;
        str = it.toString();
    }
} 
