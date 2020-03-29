package java_MiddleRank.io.byte_stream;

import java.io.File;
import java.io.FileOutputStream;

/**
 * OutputStream字节输出流
 **/
public class TestStream2 {
    public static void main(String[] args) {
        File f = new File("F:\\LOLFolder\\sk\\ss1.txt");
        byte[] bytes = {23,34};
        FileOutputStream fos = null;
        try {
            //如果f路径不存在，写出操作会自动创建文件
            fos = new FileOutputStream(f);
            //把数据写入到输出流
            fos.write(bytes);
            fos.close();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
} 
