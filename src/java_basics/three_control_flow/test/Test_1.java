package java_basics.three_control_flow.test;

import java.util.Scanner;

/**
 * 肥胖指数
 * BMI = 体重 / （身高 * 身高）
 * 体重过轻 BMI < 18.5
 * 正常范围 18.5 <= BMI < 24
 * 体重过重 24 <= BMI < 27
 * 轻度肥胖 27 <= BMI < 30
 * 中度肥胖 30 <= BMI < 35
 * 重度肥胖 35 <= BMI
 */
public class Test_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("输入身高:");
        float f = s.nextFloat();
        System.out.println("输入体重:");
        float f1 = s.nextFloat();

        float f2 = f1 / (f * f);
        if (f2 < 18.5){
            System.out.println("体重过轻");
        } else if (18.5 <= f2 && f2 < 24){
            System.out.println("正常范围");
        } else if (24 <= f2 && f2 < 27){
            System.out.println("体重过重");
        } else if (27 <= f2 && f2 < 30){
            System.out.println("轻度肥胖");
        } else if (30 <= f2 && f2 < 35){
            System.out.println("中度肥胖");
        } else if (35 <= f2){
            System.out.println("重度肥胖");
        }
    }
}
