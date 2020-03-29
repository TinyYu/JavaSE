package java_MiddleRank.io.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author: ly
 * @date: 2020/03/13
 **/
public class TestStream1 {
    public static void main(String[] args) {
        File f = new File("f:/LOLFoldar");
        FileInputStream fis = null;
        try {
            //创建基于文件的输入流
            //通过这个输入流，把数据从硬盘读取到java虚拟机中，也就是内存中
            fis = new FileInputStream(f);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
} 
