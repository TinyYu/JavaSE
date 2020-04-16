package java_MiddleRank.gui.test.test_3;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test_1 {
    public static void main(String[] args) {
        JFrame f = new JFrame("外部窗体");
        f.setSize(800,600);
        f.setLocation(100,100);
        f.setLayout(null);
        JButton b = new JButton("打开一个模态窗体");
        b.setBounds(50,50,280,30);

        JDialog d = new JDialog(f);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                d.setModal(true);
                d.setTitle("模态对话框");
                d.setSize(400,300);
                d.setLocation(200,200);
                d.setResizable(false);
                d.setVisible(true);
            }
        });

        JButton b1 = new JButton("解锁窗体大小");
        b1.setBounds(50,50,280,30);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (b1.getText().equals("解锁窗体大小")){
                    d.setResizable(true);
                    b1.setText("锁定窗体大小");
                } else {
                    d.setResizable(false);
                    b1.setText("解锁窗体大小");
                }
            }
        });
        d.add(b1);
        f.add(b);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
} 
