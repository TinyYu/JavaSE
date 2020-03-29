package java_MiddleRank.io.test.test_8;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: ly
 * @date: 2020/03/17
 **/
public class Test2 {
    public static void main(String[] args) {
        copyFolder("f:/LOLFolder","f:/Lolfolder_1");
    }

    public static void copyFile(String srcFile,String destFile){
        File srcf = new File(srcFile);
        File destf = new File(destFile);
        destf.getParentFile().mkdirs();
        FileReader fr = null;
        BufferedReader br = null;
        FileWriter fw = null;
        PrintWriter pw = null;

        try {
            fr = new FileReader(srcf);
            br = new BufferedReader(fr);
            fw = new FileWriter(destf);
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

    public static void copyFolder(String srcFolder,String destFolder){
        File file = new File(srcFolder);
        File[] files = file.listFiles();
        for (File f : files){
            if (f.isDirectory()){
                copyFolder(f.getAbsolutePath(),destFolder + "/" + f.getName());
            } else {
                copyFile(f.getAbsolutePath(),destFolder + "/" + f.getName());
            }
        }
    }
} 
