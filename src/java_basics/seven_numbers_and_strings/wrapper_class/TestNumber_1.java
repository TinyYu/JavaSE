package java_basics.seven_numbers_and_strings.wrapper_class;

/**
 * 自动装箱
 */
public class TestNumber_1 {
    public static void main(String[] args) {
        int i = 5;
        //自动转换就是装箱
        Integer it = i;
        System.out.println(it.getClass());
    }
} 
