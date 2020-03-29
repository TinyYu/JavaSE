package java_MiddleRank.io.test.test_8;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: ly
 * @date: 2020/03/17
 **/
public class Test1 {
    public static void main(String[] args) {
        copyFile("f:/class_test.java","f:/class_test_1.java");
    }

    public static void copyFile(String srcFile,String destFile){
        FileReader fr = null;
        BufferedReader br = null;
        FileWriter fw = null;
        PrintWriter pw = null;

        try {
            fr = new FileReader(srcFile);
            br = new BufferedReader(fr);
            fw = new FileWriter(destFile);
            pw = new PrintWriter(fw);

            List<String> list = new ArrayList<>();
            while (true){
                String line = br.readLine();
                if (line == null)
                    break;
                list.add(line);
            }

            for (String s : list){
                pw.println(s);
                pw.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
} 
