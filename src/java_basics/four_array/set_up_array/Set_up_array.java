package java_basics.four_array.set_up_array;

/**
 * 创建数组
 */
public class Set_up_array {
    public static void main(String[] args) {
        //声明一个数组
        int[] a;
        //创建一个长度是5的数组，并且使用引用a指向该数组
        a = new int[5];

        //声明并创建
        int[] b = new int[5];

        //访问数组
        a[0] = 1;//数组下标从0开始
        a[1]= 2;
        a[2]= 3;
        a[3]= 4;
        a[4]= 5;

        System.out.println(a.length); //打印数组的长度

        a[4]=100; //下标4，实质上是“第5个”，即最后一个
//        a[5]=101; //下标5，实质上是“第6个”，超出范围 ,产生数组下标越界异常
    }
}
