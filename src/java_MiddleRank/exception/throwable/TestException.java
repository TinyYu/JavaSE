package java_MiddleRank.exception.throwable;

import java.io.File;
import java.io.FileInputStream;

/**
 * Throwable
 **/
public class TestException {
    public static void main(String[] args) {
        File f = new File("f:/lol.exe");

        try {
            new FileInputStream(f);
            //Throwable是类，Exception和Error都继承了该类
            //使用Throwable捕捉异常
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
} 
