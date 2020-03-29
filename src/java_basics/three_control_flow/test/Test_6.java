package java_basics.three_control_flow.test;

/**
 * 打印 1-100 之间的数，如果这个数，要么是3，要么5的倍数，就忽略掉
 */
public class Test_6 {
    public static void main(String[] args) {
        for (int i = 1;i <= 100;i++){
            if (i % 3 == 0 || i % 5 == 0){
                continue;
            }else {
                System.out.println(i);
            }
        }
    }
}
