package java_basics.four_array.test;

/**
 * 定义一个5X5的二维数组。 然后使用随机数填充该二维数组。
 * 找出这个二维数组里，最大的那个值，并打印出其二维坐标
 */
public class Test_6 {
    public static void main(String[] args) {
        int[][] a = new int[5][5];
        for (int i = 0;i < a.length;i++){
            for (int j = 0;j < a[i].length;j++){
                a[i][j] = (int)(Math.random() * 100);
                System.out.println(a[i][j]);
            }
        }

        int x = 0;//x坐标
        int y = 0;//y坐标
        int max = 0;//最大值
        for (int i = 0;i < a.length;i++){
            for (int j = 0;j < a[i].length;j++){
                if (max < a[i][j]){
                    max = a[i][j];
                    x = i;
                    y = j;
                }
            }
        }
        System.out.println("最大值:" + max + "  坐标:[" + x + "," + y + "]");
    }
}
