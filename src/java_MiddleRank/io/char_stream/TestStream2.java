package java_MiddleRank.io.char_stream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Writer写入数据
 **/
public class TestStream2 {
    public static void main(String[] args) {
        File f = new File("F:\\LOLFolder\\sk\\ss.txt");
        FileWriter fw = null;
        try {
            //创建基于文件的Writer
            fw = new FileWriter(f);
            String data = "abcdefghijklmnopqrst";
            char[] cs = data.toCharArray();
            fw.write(cs);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != fw){
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
} 
