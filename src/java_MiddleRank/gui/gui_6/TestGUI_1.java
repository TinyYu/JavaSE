package java_MiddleRank.gui.gui_6;

import javax.swing.*;
import java.awt.*;

/**
 * 基本面板  JPanel
 */
public class TestGUI_1 {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(400,300);
        f.setLocation(200,200);
        f.setLayout(null);

        JPanel p1 = new JPanel();
        //设置面板大小
        p1.setBounds(50,50,300,60);
        //设置面板背景颜色
        p1.setBackground(Color.red);

        //可以不写，JPanel默认采用FlowLayout
        p1.setLayout(new FlowLayout());

        JButton b1 = new JButton("英雄1");
        JButton b2 = new JButton("英雄1");
        JButton b3 = new JButton("英雄1");

        //把按钮加入面板
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);

        //把面板加入窗口
        f.add(p1);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
