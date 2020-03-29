package java_basics.two_operator.Scanner;

import java.util.Scanner;

/**
 * Scanner
 */
public class Scanner_test {
    public static void main(String[] args) {
        //读取整数
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.println("第一个整数:" + a);
        int b = s.nextInt();
        System.out.println("第二个整数:" + b);


        //读取浮点数
        float f = s.nextFloat();
        System.out.println("读取的浮点数:" + f);

        //读取字符串
        String str = s.nextLine();
        System.out.println("读取的字符串:" + str);


        //读取整数后，读取字符串
        int i = s.nextInt();
        System.out.println("整数:" + i);
        String rn = s.nextLine();//读取换行符
        String str1 = s.nextLine();
        System.out.println("字符串:" + str1);
        //如果在通过nextInt()读取了整数后，再接着读取字符串，
        // 读出来的是回车换行:"\r\n",因为nextInt仅仅读取数字信息，而不会读取回车换行"\r\n".
        //所以，如果在业务上需要读取了整数后，接着读取字符串，
        // 那么就应该连续执行两次nextLine()，第一次是取走回车换行，第二次才是读取真正的字符串
    }
}
