package java_MiddleRank.thread.test.test_1;

import java.io.*;
import java.nio.Buffer;
import java.util.Date;

/**
 * 同步查找文件内容
 **/
public class Test1 {
    public static void main(String[] args) {
        File file = new File("F:\\java\\list");
        search(file,"Hero");
    }
    public static void search(File folder,String search){
        File[] files = folder.listFiles();
        for (File file : files){
            if (file.isDirectory()){
                search(file,search);
            } else {
                Thread t1 = new Thread(){
                    public void run(){
                        FileReader fr = null;
                        BufferedReader br = null;
                        try {
                            fr = new FileReader(file);
                            br = new BufferedReader(fr);
                            while (true){
                                String line = br.readLine();
                                if (line == null)
                                    break;
                                if (line.indexOf(search) != -1) {
                                    System.out.println(file);
                                    break;
                                }
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
                };
                t1.start();
            }
        }
    }
} 
