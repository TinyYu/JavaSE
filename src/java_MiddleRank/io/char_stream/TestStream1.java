package java_MiddleRank.io.char_stream;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Reader读取文件
 **/
public class TestStream1 {
    public static void main(String[] args) {
        File f = new File("F:\\LOLFolder\\sk\\ss.txt");
        FileReader fr = null;
        try {
            fr = new FileReader(f);
            char[] chars = new char[(int) f.length()];
            fr.read(chars);
            for (char c : chars){
                System.out.println(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fr != null){
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
} 
