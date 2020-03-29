package java_MiddleRank.exception.test_1;

import java.io.File;

/**
 * 文件不存在异常
 **/
public class TestException {
    public static void main(String[] args) {
        File f = new File("f:/lol.exe");

        ////试图打开文件LOL.exe，
        // 会抛出FileNotFoundException，如果不处理该异常，就会有编译错误
//        new FileInputStream(f);
    }
} 
