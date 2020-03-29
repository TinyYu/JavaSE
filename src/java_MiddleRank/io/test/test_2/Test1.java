package java_MiddleRank.io.test.test_2;

import java.io.File;
import java.io.FileOutputStream;

/**
 * @author: ly
 * @date: 2020/03/13
 **/
public class Test1 {
    public static void main(String[] args) {
        File f = new File("f:/LOLFolder/tt/aa/tt.txt");
        if (f.exists() != true){
            f.getParentFile().mkdirs();
        }
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(f);
            byte[] bytes = {2,3,12};
            fos.write(bytes);
            fos.close();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
} 
