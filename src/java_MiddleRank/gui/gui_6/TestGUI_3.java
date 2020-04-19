package java_MiddleRank.gui.gui_6;

import javax.swing.*;

/**
 * JScrollPanel 滚动条
 */
public class TestGUI_3 {
    public static void main(String[] args) {
        JFrame f = new JFrame("test");
        f.setSize(400,300);
        f.setLocation(200,200);
        f.setLayout(null);

        //准备一个文本域
        JTextArea ta = new JTextArea();
        for (int i = 0;i < 1000;i++){
            ta.append(String.valueOf(i));
        }
        //自动换行
        ta.setLineWrap(true);
        JScrollPane sp = new JScrollPane(ta);
        f.setContentPane(sp);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
