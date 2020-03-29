package java_basics.four_array.test;

/**
 * 首先准备两个数组，他俩的长度是5-10之间的随机数，并使用随机数初始化这两个数组
 * 然后准备第三个数组，第三个数组的长度是前两个的和
 * 通过System.arraycopy 把前两个数组合并到第三个数组中
 */
public class Test_5 {
    public static void main(String[] args) {
        int[] a = new int[5];
        int[] b = new int[5];
        int[] array = new int[10];
        for (int i = 0;i < a.length;i++){
            a[i] = (int)(Math.random() * 100);
            b[i] = (int)(Math.random() * 100);
            System.out.println(a[i]);
            System.out.println(b[i]);
        }

        System.out.println("-----------------------------------------");
        //合并数组a
        System.arraycopy(a,0,array,0,5);
        //合并数组b
        System.arraycopy(b,0,array,5,5);
        for (int i = 0;i < array.length;i++){
            System.out.println(array[i]);
        }
    }
}
