package java_MiddleRank.exception.test.test_2;

import java.io.File;
import java.io.FileInputStream;

/**
 * @author: ly
 * @date: 2020/03/12
 **/
public class Test {
    public static void main(String[] args) {
        try {
            menthod1();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    private static void menthod1() throws Throwable {
        File f = new File("f:/lol.exe");
        new FileInputStream(f);
        System.out.println("打开成功");
    }
} 
