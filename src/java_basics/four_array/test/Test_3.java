package java_basics.four_array.test;

/**
 * 首先创建一个长度是5的数组,并填充随机数。 (向数组填充随机数的办法，参考这里)
 *
 * 首先用选择法正排序，然后再对其使用冒泡法倒排序
 *
 * 注 所谓的正排序就是从小到大排序，倒排序就是从大到小排序
 */
public class Test_3 {
    public static void main(String[] args) {
        int[] a = new int[5];
        for (int i = 0;i <  a.length;i++){
            a[i] = (int)(Math.random() * 100);
            System.out.print(a[i] + ",");
        }

        System.out.println();
        //选择法排序
        for (int i = 0;i < a.length;i++){
            for (int j = 0;j < a.length;j++){
                if (a[i] < a[j]){
                    int num = a[i];
                    a[i] = a[j];
                    a[j] = num;
                }
            }
        }
        System.out.println("选择法排序:");
        for (int i = 0;i < a.length;i++){
            System.out.print(a[i] + ",");
        }

        System.out.println();

        int[] a1 = new int[5];
        for (int i = 0;i <  a1.length;i++){
            a1[i] = (int)(Math.random() * 100);
            System.out.print(a1[i] + ",");
        }
        System.out.println();
        //冒泡排序
        for (int i = 0;i < a1.length;i++){
            for (int j = 0;j < a1.length - i -1;j++){
                if (a1[j] > a1[j + 1]){
                    int num = a1[j];
                    a1[j] = a1[j + 1];
                    a1[j + 1] = num;
                }
            }
        }
        System.out.println("冒泡排序:");
        for (int i = 0;i < a1.length;i++){
            System.out.print(a1[i] + ",");
        }
    }
}
