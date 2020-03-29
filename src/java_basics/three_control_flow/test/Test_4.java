package java_basics.three_control_flow.test;

import java.util.Scanner;

/**
 * 练习阶乘
 * N的阶乘 = N * (N-1) * (N-2) * ... *1
 */
public class Test_4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("输入数字:");
        long l = s.nextLong();

        long sum = 1;
        for (int i = 0;i < l;i++){
            sum *= (l - i);
        }
        System.out.println(sum);
    }
}
