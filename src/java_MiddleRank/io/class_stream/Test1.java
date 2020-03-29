package java_MiddleRank.io.class_stream;

import java.io.*;

/**
 * 对象流
 **/
public class Test1 {
    public static void main(String[] args) {
        //对象必须可序列化（必须实现Serializable接口）
        Hero h = new Hero();
        h.setName("garen");
        h.setHp(616);

        //准备一个文件保存该对象
        File f = new File("f:/garen.lol");

        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            //对象输出流
            fos = new FileOutputStream(f);
            oos = new ObjectOutputStream(fos);

            //对象输入流
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);

            //输出对象到保存文件
            oos.writeObject(h);
            //读取对象
            Hero h2 = (Hero) ois.readObject();
            System.out.println(h2);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
} 
