package java_MiddleRank.io.caching_stream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * PrintWriter缓存字符输出流
 **/
public class TestStream2 {
    public static void main(String[] args) {
        File f = new File("F:\\LOLFolder\\sk\\ss1.txt");
        FileWriter fw = null;
        PrintWriter pw = null;

        try {
            //创建文件字符流
            fw = new FileWriter(f);
            //缓存流必须建立在一个存在的流的基础上
            pw = new PrintWriter(fw);

            //写入数据会覆盖源文件数据
            pw.println("garen kill teemo");
            pw.println("teemo revive after 1 minutes");
            pw.println("teemo try to garen, but killed again");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fw != null){
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (pw != null){
                pw.close();
            }
        }
    }
} 
