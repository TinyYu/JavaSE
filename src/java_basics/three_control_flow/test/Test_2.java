package java_basics.three_control_flow.test;

import java.util.Scanner;

/**
 * 判断闰年
 * 1. 如果能够被4整除，但是不能被100整除
 * 2. 能够被400整除
 */
public class Test_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("输入年份");
        int year = s.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println("是闰年");
        }else {
            System.out.println("不是闰年");
        }
    }
}
