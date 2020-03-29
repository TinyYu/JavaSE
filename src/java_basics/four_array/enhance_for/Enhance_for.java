package java_basics.four_array.enhance_for;

/**
 * 增强for循环
 */
public class Enhance_for {
    public static void main(String[] args) {
//        注：增强型for循环只能用来取值，却不能用来修改数组里的值
        int[] values = {18,65,65,56};
        //增强循环
        for (int i : values){
            System.out.println(i);
        }
    }
}
