package java_basics.four_array.sort;

/**
 * 冒泡排序
 * 冒泡法排序的思路：
 * 第一步：从第一位开始，把相邻两位进行比较
 * 如果发现前面的比后面的大，就把大的数据交换在后面，循环比较完毕后，最后一位就是最大的
 * 第二步： 再来一次，只不过不用比较最后一位
 * 以此类推
 */
public class Bubble_sort {
    public static void main(String[] args) {
        int[] array = new int[6];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.println(array[i]);
        }

        System.out.println("---------------------------------");
        //冒泡排序
        //第一步: 从第一步开始，把相邻两位进行比较
        //如果发现前面的比后面的大，就把大的数据交换到后面
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                int num = array[i];
                array[i] = array[i + 1];
                array[i + 1] = num;
            }
        }
        //最大的数到了最后一位
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("----------------------------------------");
        //第二步:不比较最后一位
        for (int i = 0; i < array.length - 2; i++) {
            if (array[i] > array[i + 1]) {
                int num = array[i];
                array[i] = array[i + 1];
                array[i + 1] = num;
            }
        }
        //第二大的数到了倒数第二位
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("---------------------------------------------");
        //可以发现一个规律
        //后边界在收缩
        //所以可以在外面套一层循环
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int num = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = num;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
