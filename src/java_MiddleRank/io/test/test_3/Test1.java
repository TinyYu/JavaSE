package java_MiddleRank.io.test.test_3;

import java.io.*;

/**
 * 文件加密
 **/
public class Test1 {
    public static void main(String[] args) {
        File f1 = new File("F:\\LOLFolder\\TestStream1.java");
        File f2 = new File("F:\\LOLFolder\\TestStream1_new.java");
        encodeFile(f1,f2);

        File f3 = new File("F:\\LOLFolder\\TestStream1_new.java");
        File f4 = new File("F:\\LOLFolder\\TestStream1_new_1.java");
        decodeFile(f3,f4);
    }

    public static void encodeFile(File encodingFile,File encodedFile){
        FileReader fr = null;
        FileWriter fw = null;

        try {
            fr = new FileReader(encodingFile);
            fw = new FileWriter(encodedFile);
            char[] chars1 = new char[(int) encodingFile.length()];
            fr.read(chars1);
            for (int i = 0;i < chars1.length;i++){
                if ((chars1[i] >= 'a' && chars1[i] <= 'z') || (chars1[i] >= 'A' && chars1[i] <= 'Z')){
                    if (chars1[i] != 'z' || chars1[i] != 'Z') {
                        chars1[i] = (char)(chars1[i] + 1);
                    } else {
                        chars1[i] = (char)(chars1[i] - 25);
                    }
                }

                if (chars1[i] >= '0' && chars1[i] <= '9'){
                    if (chars1[i] != '9'){
                        chars1[i] = (char)(chars1[i] + 1);
                    } else {
                        chars1[i] = '0';
                    }
                }
            }
            fw.write(chars1);
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

            if (fw != null){
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void decodeFile(File decodingFile,File decodeFile){
        FileReader fr = null;
        FileWriter fw = null;

        try {
            fr = new FileReader(decodingFile);
            fw = new FileWriter(decodeFile);
            char[] chars1 = new char[(int) decodingFile.length()];
            fr.read(chars1);
            for (int i = 0;i < chars1.length;i++){
                if ((chars1[i] >= 'a' && chars1[i] <= 'z') || (chars1[i] >= 'A' && chars1[i] <= 'Z')){
                    if (chars1[i] != 'z' || chars1[i] != 'Z') {
                        chars1[i] = (char)(chars1[i] - 1);
                    } else {
                        chars1[i] = (char)(chars1[i] + 25);
                    }
                }

                if (chars1[i] >= '0' && chars1[i] <= '9'){
                    if (chars1[i] != '0'){
                        chars1[i] = (char)(chars1[i] - 1);
                    } else {
                        chars1[i] = '9';
                    }
                }
            }
            fw.write(chars1);
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

            if (fw != null){
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
} 
