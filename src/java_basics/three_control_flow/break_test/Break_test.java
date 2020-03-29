package java_basics.three_control_flow.break_test;

/**
 * break
 */
public class Break_test {
    public static void main(String[] args) {
        //打印单数
        for (int i = 1;i <= 10;i++){
            if (i % 2 == 0){
                break;//如果是双数，直接结束循环
            }
            System.out.println(i);
        }
    }
}
