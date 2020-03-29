package java_MiddleRank.io.test.test_8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * @author: ly
 * @date: 2020/03/17
 **/
public class Test3 {
    public static void main(String[] args) {
        File f = new File("f:/java");
        search(f,"//只能存放一个字符");
    }

    public static void search(File folder,String search){
        File[] files = folder.listFiles();
        for (File f : files){
            if (f.isDirectory()){
                search(f,search);
            } else {
                FileReader fr = null;
                BufferedReader br = null;

                try {
                    fr = new FileReader(f);
                    br = new BufferedReader(fr);
                    while (true){
                        String line = br.readLine();
                        if (line == null)
                            break;
                        if (line.indexOf(search) != -1){
                            System.out.println(f);
                            break;
                        }
                    }
                } catch (java.io.IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
} 
