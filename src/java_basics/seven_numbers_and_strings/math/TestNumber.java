package java_basics.seven_numbers_and_strings.math;

/**
 * 四舍五入, 随机数，开方，次方，π，自然常数
 **/
public class TestNumber {
    public static void main(String[] args) {
        float f1 = 5.4f;
        float f2 = 5.5f;
        //四舍五入
        System.out.println(Math.round(f1) + " " + Math.round(f2));

        //随机数
        //得到0 - 1之间的随机浮点数（取不到1）
        System.out.println(Math.random());
        //得到0 - 10之间的随机整数（娶不到10）
        System.out.println((int)Math.random() * 10);

        //开方
        System.out.println(Math.sqrt(9));

        //次方(2的4次方)
        System.out.println(Math.pow(2,4));

        //π
        System.out.println(Math.PI);

        //自然常熟
        System.out.println(Math.E);
    }
} 
