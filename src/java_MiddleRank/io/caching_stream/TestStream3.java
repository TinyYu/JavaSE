package java_MiddleRank.io.caching_stream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * flush
 **/
public class TestStream3 {
    public static void main(String[] args) {
        File f = new File("F:\\LOLFolder\\sk\\ss1.txt");
        FileWriter fw = null;
        PrintWriter pw = null;

        try {
            fw = new FileWriter(f);
            pw = new PrintWriter(fw);
            pw.println("garen kill teemo");
            //强制把缓存中的数据写入硬盘，无论缓存是否已满
            pw.flush();
            pw.println("teemo revive after 1 minutes");
            pw.flush();
            pw.println("teemo try to garen, but killed again");
            pw.flush();
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
