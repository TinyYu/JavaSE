package java_basics.four_array.sort;

/**
 * 选择法排序
 * 选择法排序的思路：
 * 把第一位和其他所有的进行比较，只要比第一位小的，就换到第一个位置来
 * 比较完后，第一位就是最小的
 * 然后再从第二位和剩余的其他所有进行比较，只要比第二位小，就换到第二个位置来
 * 比较完后，第二位就是第二小的
 * 以此类推
 */
public class Selection_sort {
    public static void main(String[] args) {
        int[] a = new int[5];
        for (int i = 0;i < a.length;i++){
            a[i] = (int)(Math.random() * 100);
            System.out.println(a[i]);
        }

        //选择法排序

        //第一步: 把第一位和其他所有位进行比较
        //如果发现其他位置的数组比第一位小，就进行交换
        for (int i = 1;i < a.length;i++){
            if (a[0] > a[i]){
                int num = a[0];
                a[0] = a[i];
                a[i] = num;
            }
        }

        //第二步: 把第二位的和神仙的说有位进行比较
        for (int i = 2;i < a.length;i++){
            if (a[1] > a[i]){
                int num = a[1];
                a[1] = a[i];
                a[i] = num;
            }
        }

        //可以发现一个规律
        //移动的位置是从0 逐渐增加的
        //所以可以在外面套一层循环
        for (int i = 0;i < a.length;i++){
            for (int j = 0;j < a.length;j++){
                if (a[i] < a[j]){
                    int num = a[i];
                    a[i] = a[j];
                    a[j] = num;
                }
            }
        }
        System.out.println("------------------------------");
        for (int i = 0;i < a.length;i++){
            System.out.println(a[i]);
        }
    }
}
