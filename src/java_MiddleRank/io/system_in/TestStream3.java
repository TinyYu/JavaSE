package java_MiddleRank.io.system_in;

import java.util.Scanner;

/**
 * Scanner读取整数
 **/
public class TestStream3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.println("第一个整数:" + a);
        int b = s.nextInt();
        System.out.println("第二个整数:" + b);
    }
} 
