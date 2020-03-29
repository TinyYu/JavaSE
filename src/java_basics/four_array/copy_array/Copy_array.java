package java_basics.four_array.copy_array;

/**
 * 复制数
 * System.arraycopy(src, srcPos, dest, destPos, length)
 * src: 源数组
 * srcPos: 从源数组复制数据的起始位置
 * dest: 目标数组
 * destPos: 复制到目标数组的起始位置
 * length: 复制的长度
 */
public class Copy_array {
    public static void main(String[] args) {
        //把一个数组的值，复制到另一个数组中
        int[] a = {13,23,233,4};
        int[] b = new int[3];//长度为3
        System.arraycopy(a,0,b,0,3);
        for (int i = 0;i < b.length;i++){
            System.out.println(b[i]);
        }
    }
}
