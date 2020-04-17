package java_MiddleRank.gui.gui_4;

import javax.swing.*;
import java.awt.*;

/**
 * setPreferredSize(向布局器建议该组件显示的大小.)
 * 只对部分布局器起作用，比如FlowLayout可以起作用。 比如GridLayout就不起作用，因为网格布局器必须对齐
 **/
public class TestGUI_5 {
    public static void main(String[] args) {
        JFrame f = new JFrame("TEST'");
        f.setSize(400,300);
        f.setLocation(200,200);
        f.setLayout(new FlowLayout());

        JButton b1 = new JButton("英雄1");
        JButton b2 = new JButton("英雄2");
        JButton b3 = new JButton("英雄3");

        b3.setPreferredSize(new Dimension(180,40));
        f.add(b1);
        f.add(b2);
        f.add(b3);

        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
} 
