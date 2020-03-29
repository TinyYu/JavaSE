package java_basics.one_variable.transform;

/**
 * 低精度向高精度转换
 */
public class Low_to_high {
    public static void main(String[] args) {
        long l = 50;
        int i =50;

        //int 比 long 小，小到大自动转
        l = i;
        System.out.println(l);
//        i = l;编译错误
    }
}
