package java_basics.three_control_flow.continue_test;

/**
 * continue
 */
public class Continue_test {
    public static void main(String[] args) {
        //打印单数
        for (int i = 1;i <= 10;i++){
            if (i % 2 == 0){
                continue;//如果满足条件，不执行后面代码，直接进行下一次循环
            }else {
                System.out.println(i);
            }
        }
    }
}
