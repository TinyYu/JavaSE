package java_basics.one_variable.transform;

/**
 * 高精度向低精度转换
 */
public class High_to_low {
    public static void main(String[] args) {
        byte b= 5;
        int i1 = 10;
        int i2 = 300;

        //i1的值是在byte范围之内，所以强制转换得到的值是10
        b = (byte) i1;
        System.out.println(b);

        //i2的值在byte范围之外，强制转换按照byte的长度进行截取
        //i2的值是300，对应的二进制是100101100
        //按照byte的长度8位，截取后其值位00101100 即44
        b = (byte) i2;
        System.out.println(b);

        //查看一个整数对应的二进制方法
        System.out.println(Integer.toBinaryString(i2));
    }
}
