package java_MiddleRank.io.caching_stream;

import java.io.*;

/**
 * BufferedReader缓存字符输入流
 **/
public class TestStream {
    public static void main(String[] args) {
        File f = new File("F:\\LOLFolder\\sk\\ss1.txt");
        FileReader fr = null;
        BufferedReader br = null;

        try {
            //创建文件字符流
            fr = new FileReader(f);
            //缓存流必须建立在一个存在的流的基础上
            br = new BufferedReader(fr);

            while (true){
                //一次读取一行
                String line = br.readLine();
                if (null == line)
                    break;
                System.out.println(line);
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

            if (br != null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
} 
