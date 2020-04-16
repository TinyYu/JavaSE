package java_MiddleRank.gui.gui_4;

import javax.swing.*;

/**
 * 绝对定位
 **/
public class TestGUI_1 {
    public static void main(String[] args) {
        JFrame f = new JFrame("TEST");
        f.setSize(400,300);
        f.setLocation(200,200);
        // 设置布局器为null，即进行绝对定位，容器上的组件都需要指定位置和大小
        f.setLayout(null);

        JButton b = new JButton("hero1");
        //指定位置和大小
        b.setBounds(50,50,80,30);

        JButton b1 = new JButton("hero2");
        //指定位置和大小
        b1.setBounds(150,50,80,30);

        JButton b2 = new JButton("hero3");
        //指定位置和大小
        b2.setBounds(250,50,80,30);

        //未指定大小的组件不会出现在窗体中
        JButton b3 = new JButton("hero3");

        f.add(b);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
} 
