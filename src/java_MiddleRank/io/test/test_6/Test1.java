package java_MiddleRank.io.test.test_6;

import java.io.*;

/**
 * @author: ly
 * @date: 2020/03/17
 **/
public class Test1 {
    public static void main(String[] args) {
        Hero[] heroes = new Hero[10];
        for (int i = 0;i < heroes.length;i++){
            heroes[i] = new Hero("Hero" + String.valueOf(i),i);
        }

        File f = new File("f:/heros.lol");

        FileInputStream fis = null;
        ObjectInputStream ois = null;

        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream(f);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(heroes);

            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            Hero[] heroes1 = (Hero[]) ois.readObject();

            for (Hero h : heroes1){
                System.out.println(h);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (ois != null){
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (oos != null){
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
} 
