package java_basics.three_control_flow.test;

import java.util.Scanner;

/**
 * 假设你月收入是3000，除开平时花销，每个月留下1000块钱进行投资。
 * 然后你认真的钻研了 《股票和基金 21天从入门到精通》，达到了每年20%的投资回报率。
 *
 * 那么问题来了，以每个月投资1000块钱的节奏，持续投资多少年，总收入达到100万
 * （复利计算按照每年12000投入计算，不按照每月计息）
 *
 * 复利公式：
 * F = p* ( (1+r)^n );
 * F 最终收入
 * p 本金
 * r 年利率
 * n 存了多少年
 */
public class Test_7 {
    public static void main(String[] args) {
        double F = 0;//最终收入
        double p = 0;//本金
        double r = 0;//年利率
        double n = 0;//存了多少年
        //公式: F = p * ((1 + r) ^ n)
        Scanner s = new Scanner(System.in);
        System.out.println("输入本金:");
        p = s.nextDouble();
        System.out.println("输入年利率:");
        r = s.nextDouble();

        while (F < 1000000) {
            n++;
            F += p * Math.pow((1 + r),n);//总收入
            System.out.println("第" + n + "年，收入:" + F);
        }
        System.out.println(n);
    }
}
