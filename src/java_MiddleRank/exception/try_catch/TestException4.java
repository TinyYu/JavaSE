package java_MiddleRank.exception.try_catch;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * throws
 **/
public class TestException4 {
    public static void main(String[] args) {
        method1();
    }

    private static void method1() {
        //对异常进行处理
        try {
            method2();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void method2() throws FileNotFoundException {//抛出异常
        File f = new File("f:/lol.exe");
        System.out.println("打开f:/lol.exe");
        new FileInputStream(f);
        System.out.println("成功打开");
    }
} 
