package java_MiddleRank.gui.gui_5;

import javax.swing.*;
import java.awt.*;

/**
 * Label 显示文字
 **/
public class TestGUI_1 {
    public static void main(String[] args) {
        JFrame f = new JFrame("test");
        f.setSize(400,300);
        f.setLocation(200,200);
        f.setLayout(null);

        JLabel l = new JLabel("test");
        //文字颜色
        l.setForeground(Color.BLUE);
        l.setBounds(50,50,280,30);
        f.add(l);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
} 
