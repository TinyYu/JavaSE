package java_basics.four_array.set_up_array;

/**
 * 初始化数组
 */
public class Set_up_array_2 {
    public static void main(String[] args) {
        int[] a = new int[5];//分配了长度是5的数组，但是没有赋值
        //因为没有赋值，使用默认值,int类型的数组默认值是0
        System.out.println(a[0]);
        //进行赋值
        a[0] = 100;
        a[1] = 101;
        a[2] = 103;
        a[3] = 120;
        a[4] = 140;


        //赋值
        //写法一: 分配空间的时候同时赋值
        int[] array = new int[]{100,102,33,23,34};

        //写法二: 省略了new int[]，效果一样
        int[] array2 = {1000,434,434,45,56};

        //写法三：同时分配空间，和指定内容
        //在这个例子里，长度是3，内容是5个，产生矛盾了
        //所以如果指定了数组的内容，就不能同时设置数组的长度
//        int[] c = new int[3]{100,102,444,836,3236};
    }
}
