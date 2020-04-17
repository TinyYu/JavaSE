package java_MiddleRank.gui.gui_5;

import javax.swing.*;
import java.awt.*;

/**
 * 文本域
 **/
public class TestGUI_8 {
    public static void main(String[] args) {
        JFrame f = new JFrame("test");
        f.setSize(400,300);
        f.setLocation(580,240);
        f.setLayout(new FlowLayout());

        JLabel l = new JLabel("文本域");
        JTextArea ta = new JTextArea();
        ta.setPreferredSize(new Dimension(200,150));
        //\n换行符
        ta.setText("herorrr\n");
        //追加数据
        ta.append("csasdsad");
        //设置自动换行
        ta.setLineWrap(true);
        f.add(l);
        f.add(ta);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
