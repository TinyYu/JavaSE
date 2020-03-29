package java_MiddleRank.exception.try_catch;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * finally
 **/
public class TestException3 {
    public static void main(String[] args) {
        File f = new File("f:/lol.exe");

        try {
            System.out.println("打开f:/lol.exe");
            new FileInputStream(f);
            System.out.println("成功");
        } catch (FileNotFoundException e) {
            System.out.println("未找到该文件");
            e.printStackTrace();
        } finally {
            System.out.println("无论文件是否存在，都会执行");
        }
    }
} 
