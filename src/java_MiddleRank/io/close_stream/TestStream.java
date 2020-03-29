package java_MiddleRank.io.close_stream;

import java.io.File;
import java.io.FileInputStream;

/**
 * 在try中关闭流
 **/
public class TestStream {
    public static void main(String[] args) {
        File f = new File("F:\\LOLFolder");
        try {
            FileInputStream fis = new FileInputStream(f);
            byte[] bytes = new byte[(int) f.length()];
            fis.read(bytes);
            for (byte b : bytes){
                System.out.println(b);
            }
            //在try中关闭流
            fis.close();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
} 
