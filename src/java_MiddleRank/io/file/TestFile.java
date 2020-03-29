package java_MiddleRank.io.file;

import java.io.File;

/**
 * 创建文件对象
 **/
public class TestFile {
    public static void main(String[] args) {
        //绝对路径
        File f = new File("F:/");
        System.out.println("f的绝对路径:" + f.getAbsolutePath());

        //相对路径,相对于工作目录
        File f2 = new File("TestFile.java");
        System.out.println("f2的绝对路径:" + f2.getAbsolutePath());

        //以f作为父目录创建文件对象
        File f3 = new File(f,"Test2.java");
        System.out.println("f3的绝对路径:" + f3.getAbsolutePath());
    }
} 
