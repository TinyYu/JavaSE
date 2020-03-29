package java_basics.six_interface_and_inheritance.polymorphism;

/**
 * 操作符的多态
 */
public class Test_1 {
    public static void main(String[] args) {
        int i = 5;
        int j = 5;
        int k = i + j;//如果+号两边是整形，那么+代表数字相加

        int a = 5;
        String b = "5";
        String c = a + b;//如果+号两侧，任意一个是字符串，那么加号表示连接
    }
}
