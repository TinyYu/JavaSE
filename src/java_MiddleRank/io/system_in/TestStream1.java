package java_MiddleRank.io.system_in;


import java.io.IOException;
import java.io.InputStream;

/**
 * System.in
 **/
public class TestStream1 {
    public static void main(String[] args) {
        InputStream is = null;

        try {
            is = System.in;
            while (true){
                int i = is.read();
                //输入a，输出97 10,10表示回车符
                System.out.println(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (is != null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
} 
