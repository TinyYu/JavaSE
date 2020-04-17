package java_MiddleRank.gui.gui_5;

import javax.swing.*;
import java.awt.*;

/**
 * 进度条
 **/
public class TestGUI_9 {
    public static void main(String[] args) {
        JFrame f = new JFrame("test");
        f.setSize(400,300);
        f.setLocation(580,240);
        f.setLayout(new FlowLayout());

        //创建进度条
        JProgressBar pb = new JProgressBar();
        Thread t = new Thread(){
            int i = 1;
            public void run(){
                while (i != 101) {
                    try {
                        Thread.sleep(100);
                        dd(i++,f,pb);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        t.start();
    }

    public static void dd(int value,JFrame f,JProgressBar pb){
        //进度条最大100
        pb.setMaximum(100);
        //当前进度
        pb.setValue(value);
        //显示当前进度
        pb.setStringPainted(true);
        f.add(pb);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void test1(){
        JFrame f = new JFrame("test");
        f.setSize(400,300);
        f.setLocation(580,240);
        f.setLayout(new FlowLayout());

        JProgressBar pb = new JProgressBar();
        //进度条最大100
        pb.setMaximum(100);
        //当前进度
        pb.setValue(50);
        //显示当前进度
        pb.setStringPainted(true);
        f.add(pb);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
