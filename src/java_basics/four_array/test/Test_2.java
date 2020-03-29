package java_basics.four_array.test;

/**
 * 数组反转
 */
public class Test_2 {
    public static void main(String[] args) {
        int[] a = new int[5];
        for (int i = 0;i < a.length;i++){
            a[i] = (int)(Math.random() * 100);
            System.out.println(a[i]);
        }
        System.out.println("------------------------------");
        for (int i = 0;i < a.length / 2;i++){
            int x = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = x;
        }

        for (int i = 0;i < a.length;i++){
            System.out.println(a[i]);
        }
    }
}
