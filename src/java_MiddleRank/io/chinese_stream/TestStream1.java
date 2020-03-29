package java_MiddleRank.io.chinese_stream;

import java.io.File;
import java.io.FileInputStream;

/**
 * FileInputStream字节流读取中文
 **/
public class TestStream1 {
    public static void main(String[] args) {
        File f = new File("F:\\LOLFolder\\sk\\ss.txt");
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(f);
            byte[] all = new byte[(int) f.length()];
            fis.read(all);
            System.out.println("读取到的数据:");
            for (byte b : all){
                int i = b&0x000000ff;//只取16进制的后两位
                System.out.println(Integer.toHexString(i));
            }

            System.out.println("UTF-8:");
            //注意文件使用的编码格式
            String str = new String(all,"UTF-8");
            System.out.println(str);
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
} 
