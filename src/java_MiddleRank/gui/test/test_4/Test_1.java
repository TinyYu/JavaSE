package java_MiddleRank.gui.test.test_4;

import javax.swing.*;
import java.awt.*;

public class Test_1 {
    public static void main(String[] args) {
        JFrame f = new JFrame("计算器");
        f.setSize(400,300);
        f.setLocation(200,300);
        f.setLayout(new GridLayout(4,5));

        JButton b1 = new JButton("7");
        JButton b2 = new JButton("8");
        JButton b3 = new JButton("9");
        JButton b4 = new JButton("/");
        JButton b5 = new JButton("sq");

        JButton[] bs = new JButton[20];
        String[] strs = {"7","8","9","/","sq","4","5","6","*","%","1","2","3","-","1/x","0","+/-",".","+","="};
        for (int i = 0;i < bs.length;i++){
            bs[i] = new JButton();
            bs[i].setText(strs[i]);
            f.add(bs[i]);
        }

        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
