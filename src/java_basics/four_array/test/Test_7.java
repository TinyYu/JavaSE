package java_basics.four_array.test;

import java.util.Arrays;

/**
 * 首先定义一个5X8的二维数组，然后使用随机数填充满。
 * 借助Arrays的方法对二维数组进行排序。
 * 参考思路：
 * 先把二维数组使用System.arraycopy进行数组复制到一个一维数组
 * 然后使用sort进行排序
 * 最后再复制回到二维数组。
 */
public class Test_7 {
    public static void main(String[] args) {
        int[][] arrrays = new int[5][8];
        int[] array = new int[40];
        for (int i = 0;i < arrrays.length;i++){
            for (int j = 0;j < arrrays[i].length;j++){
                arrrays[i][j] = (int)(Math.random() * 100);
            }
        }
        int n = 0;
        for (int i = 0;i < array.length;i++){
            if (i == 0 || (i + 1) % 8== 0){
                System.arraycopy(arrrays[n],0,array,i,8);
                n++;
            } else if (n == 5){
                break;
            }
        }
        for (int a : array){
            System.out.print(a + ",");
        }
        Arrays.sort(array);
        int m = 0;
       for (int i = 0;i < array.length;i++){
           if (i == 0 || (i + 1) % 8== 0){
               System.arraycopy(array,i,arrrays[m],0,8);
               m++;
           } else if (m == 5){
               break;
           }
       }
        System.out.println();
       for (int i = 0;i < arrrays.length;i++){
           for (int j = 0;j < arrrays[i].length;j++){
               System.out.print(arrrays[i][j] + ",");
           }
       }

    }
}
