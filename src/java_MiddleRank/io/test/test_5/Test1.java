package java_MiddleRank.io.test.test_5;

import java.io.*;

/**
 * @author: ly
 * @date: 2020/03/16
 **/
public class Test1 {
    public static void main(String[] args) {
        write();
        read();
    }

    public static void write(){
        File f = new File("F:\\LOLFolder\\sk\\ss.txt");
        FileOutputStream fos = null;
        DataOutputStream dos = null;

        try {
            fos = new FileOutputStream(f);
            dos = new DataOutputStream(fos);

            dos.writeInt(31);
            dos.writeChar('@');
            dos.writeInt(15);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (dos != null){
                try {
                    dos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void read(){
        File f = new File("F:\\LOLFolder\\sk\\ss.txt");
        FileInputStream fis = null;
        DataInputStream dis = null;

        try {
            fis = new FileInputStream(f);
            dis = new DataInputStream(fis);

            System.out.println(dis.readInt());
            dis.readChar();
            System.out.println(dis.readInt());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
} 
