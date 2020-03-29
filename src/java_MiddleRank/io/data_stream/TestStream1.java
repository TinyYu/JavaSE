package java_MiddleRank.io.data_stream;

import java.io.*;

/**
 * 数据流
 **/
public class TestStream1 {
    public static void main(String[] args) {
        write();
        // 要用DataInputStream 读取一个文件，
        // 这个文件必须是由DataOutputStream 写出的，
        // 否则会出现EOFException，因为DataOutputStream
        // 在写出的时候会做一些特殊标记，只有DataInputStream 才能成功的读取。
        read();

    }
    public static  void write(){
        File f = new File("F:\\LOLFolder\\sk\\ss.txt");
        FileOutputStream fos = null;
        DataOutputStream dos = null;

        try {
            fos = new FileOutputStream(f);
            dos = new DataOutputStream(fos);

            //顺序写入数据
            dos.writeBoolean(true);
            dos.writeInt(300);
            dos.writeUTF("123 this");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void read(){
        File f = new File("F:\\LOLFolder\\sk\\ss.txt");
        FileInputStream fis = null;
        DataInputStream dis = null;

        try {
            fis = new FileInputStream(f);
            dis = new DataInputStream(fis);

            //顺序读取数据
            boolean b= dis.readBoolean();
            int i = dis.readInt();
            String str = dis.readUTF();
            System.out.println(b);
            System.out.println(i);
            System.out.println(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
} 
