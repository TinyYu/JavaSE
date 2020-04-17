package java_MiddleRank.gui.gui_5;

import javax.swing.*;
import java.awt.*;

/**
 * 文本框
 **/
public class TestGUI_6 {
    public static void main(String[] args) {
        JFrame f = new JFrame("test");
        f.setSize(400,300);
        f.setLocation(580,240);
        f.setLayout(new FlowLayout());

        JLabel lname = new JLabel("账号");
        //输入框
        JTextField tfname = new JTextField("");
        tfname.setText("请输入账户");
        tfname.setPreferredSize(new Dimension(80,30));

        JLabel lPassword = new JLabel("密码：");
        // 输入框
        JTextField tfPassword = new JTextField("");
        tfPassword.setText("请输入密码");
        tfPassword.setPreferredSize(new Dimension(80, 30));

        f.add(lname);
        f.add(tfname);
        f.add(lPassword);
        f.add(tfPassword);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
} 
