package java_MiddleRank.gui.gui_5;

import javax.swing.*;
import java.awt.*;

/**
 * 密码框
 **/
public class TestGUI_7 {
    public static void main(String[] args) {
        JFrame f = new JFrame("test");
        f.setSize(400,300);
        f.setLocation(580,240);
        f.setLayout(new FlowLayout());
        JLabel l = new JLabel("密码:");
        //密码框
        JPasswordField pf = new JPasswordField("");
        pf.setPreferredSize(new Dimension(80,30));

        //与文本框不同，获取密码框里的内容，推荐使用getPassword，该方法会返回一个字符数组，而非字符串
        char[] password = pf.getPassword();
        String p = String.valueOf(password);
        System.out.println(p);
        f.add(l);
        f.add(pf);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
