package java_basics.four_array.test;

/**
 * 首先创建一个长度是5的数组
 * 然后给数组的每一位赋予随机整数
 * 通过for循环，遍历数组，找出最小的一个值出来
 * 0-100的 随机整数的获取办法有多种，下面是参考办法之一:
 * (int) (Math.random() * 100)
 */
public class Test_1 {
    public static void main(String[] args) {
        int[] a = new int[5];
        for (int i = 0;i < a.length;i++){
            a[i] = (int)(Math.random() * 100);
            System.out.println(a[i]);
        }

        int x = a[0];
        for (int i = 0;i < a.length;i++){
            if (x > a[i]){
                x = a[i];
            }
        }
        System.out.println("最小值是:" + x);
    }
}
