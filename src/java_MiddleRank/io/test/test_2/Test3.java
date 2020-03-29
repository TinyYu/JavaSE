package java_MiddleRank.io.test.test_2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * @author: ly
 * @date: 2020/03/13
 **/
public class Test3 {
    public static void main(String[] args) {
        File f = new File("f:/LOLFolder/skin");
        File[] files = f.listFiles();
        FileInputStream fis = null;
        FileOutputStream fos = null;
        File f_new = new File("f:/LOLFolder/skin/MEMORY.DMP");
        for (int i = 0;i < files.length;i++){
            try {
                fis = new FileInputStream(files[i]);
                byte[] bytes = new byte[files.length];
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
} 
