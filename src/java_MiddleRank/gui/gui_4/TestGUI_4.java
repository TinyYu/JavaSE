package java_MiddleRank.gui.gui_4;

import javax.swing.*;
import java.awt.*;

/**
 * GidLayout网格布局器
 **/
public class TestGUI_4 {
    public static void main(String[] args) {
        JFrame f = new JFrame("test");
        f.setSize(400,300);
        f.setLocation(200,200);
        //表示网格是2行3列
        f.setLayout(new GridLayout(2,3));

        JButton b1 = new JButton("hero1");
        JButton b2 = new JButton("hero2");
        JButton b3 = new JButton("hero3");
        JButton b4 = new JButton("hero4");
        JButton b5 = new JButton("hero5");

        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);

        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
