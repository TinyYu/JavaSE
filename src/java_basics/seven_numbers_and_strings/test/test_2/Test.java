package java_basics.seven_numbers_and_strings.test.test_2;

/**
 * @author: ly
 * @date: 2020/03/09
 **/
public class Test {
    public static void main(String[] args) {
        //转换为字符串
        float f = 3.14f;
        String str = String.valueOf(f);

        //转换为浮点数
        float f2 = Float.parseFloat(str);

        String str2 = "3.1a4";
        float f3 = Float.parseFloat(str2);
        System.out.println(f3);
    }
} 
