package java_MiddleRank.io.test.test_4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 设计一个方法，用于移除Java文件中的注释
 **/
public class Test1 {
    public static void main(String[] args) {
        File f = new File("F:\\LOLFolder\\TestStream3.java");
        removeComments(f);
    }

    public static void removeComments(File javaFile){
        FileReader fr = null;
        BufferedReader br = null;
        FileWriter fw = null;
        PrintWriter pw = null;

        try {
            fr = new FileReader(javaFile);
            br = new BufferedReader(fr);
            List<String> list = new ArrayList();
            while (true){
                String line = br.readLine();
                if (null == line)
                    break;
                list.add(line.replaceFirst("//",""));
            }
            fw = new FileWriter(javaFile);
            pw = new PrintWriter(fw);
            for (String l : list){
                pw.println(l);
                pw.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
} 
