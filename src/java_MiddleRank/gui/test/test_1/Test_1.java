package java_MiddleRank.gui.test.test_1;

import javax.swing.*;
import java.io.*;

/**
 * 使用这个窗口，导致窗口被移动到了右下角。 关闭这个窗口，下一次再启动的时候，就会自动出现在右下角。
 */
public class Test_1 {
    public static void main(String[] args) {
        JFrame f = new JFrame("TEST");
        File file = new File("F:\\java\\JavaSE\\src\\java_MiddleRank\\gui\\test\\test_1\\location.txt");

        Thread t = new Thread(){
            public void run() {
                while (true) {
                    try {
                        push(file, f);
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        t.start();

        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            while (true){
                String line = br.readLine();
                if (line == null){
                    gui(200,200,false,f);
                    break;
                }
                int sx = line.charAt(0);
                int sy = line.charAt(1);
                gui(sx,sy,true,f);
                break;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fr != null){
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void gui(int x,int y,boolean boo,JFrame f){
        if (!boo) {
            x = 200;
            y = 200;
        }
        f.setSize(400, 300);
        f.setLocation(x, y);
        f.setLayout(null);
        JButton b = new JButton("确定");
        b.setBounds(50, 50, 280, 30);
        f.add(b);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void push(File file,JFrame f){
        FileWriter fw = null;
        PrintWriter pw = null;
        try {
            fw = new FileWriter(file);
            pw = new PrintWriter(fw);
            int x = f.getX();
            int y = f.getY();
            System.out.println(f.getX() + " " +f.getY());
            pw.write(x);
            pw.write(y);
            pw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (pw != null){
                pw.close();
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
