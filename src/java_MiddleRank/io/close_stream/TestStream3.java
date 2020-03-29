package java_MiddleRank.io.close_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * 使用try()的方式
 **/
public class TestStream3 {
    public static void main(String[] args) {
        File f = new File("f:/LOLFolder");

        //把流定义在try()中，try，catch或者finally结束的时候，会自动关闭
        try (FileInputStream fis = new FileInputStream(f)){
            byte[] all = new byte[(int) f.length()];
            fis.read(all);
            for (byte b : all){
                System.out.println(b);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
} 
