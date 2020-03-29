package java_MiddleRank.io.chinese_stream;

import java.io.*;
import java.nio.charset.Charset;

/**
 * FileReader字符流读取中文
 **/
public class TestStream2 {
    public static void main(String[] args) {
        File f = new File("F:\\LOLFolder\\sk\\ss.txt");
        //FileReader得到的是字符，所以一定是已经把字节根据某种编码识别成了字符了
        //而FileReader使用的编码方式是Charset.defaultCharset()的返回值
        System.out.println("默认编码格式:" + Charset.defaultCharset());

        FileReader fr = null;
        try {
            fr = new FileReader(f);
            char[] cs = new char[(int) f.length()];
            fr.read(cs);
            System.out.printf("FileReader使用的默认编码范方式%s,识别出来的字符是:%n",Charset.defaultCharset());
            System.out.println(new String(cs));
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

        //InputStream设置编码
        InputStreamReader isr = null;
        try {
            isr = new InputStreamReader(new FileInputStream(f),Charset.forName("GBK"));
            char[] cs = new char[(int) f.length()];
            isr.read(cs);
            System.out.println("InputStreamReader指定编码GBK,识别出来的字符是:");
            System.out.println(new String(cs));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
} 
