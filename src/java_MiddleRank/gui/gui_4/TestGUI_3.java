package java_MiddleRank.gui.gui_4;

import javax.swing.*;
import java.awt.*;

/**
 * BorderLayout(容器上的组件按照上北 下南 左西 右东 中的顺序摆放)
 **/
public class TestGUI_3 {
    public static void main(String[] args) {
        JFrame f = new JFrame("test");
        f.setSize(400,300);
        f.setLocation(200,200);
        f.setLayout(new BorderLayout());

        JButton b1 = new JButton("hero1");
        JButton b2 = new JButton("hero2");
        JButton b3 = new JButton("hero3");
        JButton b4 = new JButton("hero4");
        JButton b5 = new JButton("hero5");

        //指定位置
        f.add(b1,BorderLayout.NORTH);
        f.add(b2,BorderLayout.SOUTH);
        f.add(b3,BorderLayout.WEST);
        f.add(b4,BorderLayout.EAST);
        f.add(b5,BorderLayout.CENTER);

        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
} 
