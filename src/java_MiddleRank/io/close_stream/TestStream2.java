package java_MiddleRank.io.close_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * 在finally中关闭流
 **/
public class TestStream2 {
    public static void main(String[] args) {
        File f = new File("f:/LOLFolder");
        FileInputStream fis = null;

        try {
            fis = new FileInputStream(f);
            byte[] all = new byte[(int) f.length()];
            fis.read(all);
            for (byte b : all){
                System.out.println(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //在finally中关闭流
            if (null != fis){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
} 
