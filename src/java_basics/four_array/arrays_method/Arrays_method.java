package java_basics.four_array.arrays_method;

import java.util.Arrays;

/**
 * Arrays
 * 针对数组的工具类，可以进行 排序，查找，复制填充等功能。
 */
public class Arrays_method {
    public static void main(String[] args) {
        int[] array = {1,2,23,3};
        /** 数组复制 **/
        // 第一个参数表示源数组
        // 第二个参数表示开始位置(取得到)
        // 第三个参数表示结束位置(取不到)
        int[] b = Arrays.copyOfRange(array,0,4);
        for (int i = 0;i < b.length;i++){
            System.out.println(b[i]);
        }

        /** 转换为字符串 **/
        String str = Arrays.toString(array);
        System.out.println(str);

        /** 排序 **/
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        /** 搜索 **/
        //使用binarySearch之前，必须先使用sort进行排序
        System.out.println("数字23的位置:" + Arrays.binarySearch(array,23));

        /** 判断是否相同 **/
        //比较两个数组的内容是否一样(注意: 数的位置也要相同)
        System.out.println(Arrays.equals(array,b));

        /** 填充 **/
        //使用同一个值，填充整个数组
        int[] a = new int[4];
        Arrays.fill(a,10);
        System.out.println(Arrays.toString(a));
    }
}
