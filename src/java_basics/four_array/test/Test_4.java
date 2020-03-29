package java_basics.four_array.test;

/**
 * 用增强型for循环找出最大的那个数
 */
public class Test_4 {
    public static void main(String[] args) {
        int[] value = {1,32,34,31};
        int max = 0;
        for (int i : value){
            if (max < i){
                max = i;
            }
        }
        System.out.println(max);
    }
}
