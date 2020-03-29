package java_MiddleRank.io.byte_stream;

import java.io.File;
import java.io.FileInputStream;

/**
 * InputStream字节输入流
 **/
public class TestStream {
    public static void main(String[] args) {
        File f = new File("F:\\LOLFolder\\sk\\ss.txt");
        FileInputStream fis = null;

        try {
            fis = new FileInputStream(f);
            byte[] by = new byte[(int) f.length()];
            //以字节流的形式读取文件所有内容
            fis.read(by);
            for (byte b : by){
                //打印出来的是对应的ASCII码
                System.out.println(b);
            }
            //关闭流
            fis.close();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
} 
