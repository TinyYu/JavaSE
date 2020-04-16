package java_MiddleRank.gui.test.test_2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 切换显示
 **/
public class Test_2 {
    public static void main(String[] args) {
        JFrame f = new JFrame("test");
        f.setSize(400,300);
        f.setLocation(200,200);
        f.setLayout(null);

        final JLabel l = new JLabel();
        ImageIcon i = new ImageIcon("C:\\Users\\ZHANGF-PC\\Pictures\\shana.png");
        l.setIcon(i);
        l.setBounds(50,50,i.getIconWidth(),i.getIconHeight());
        JButton b = new JButton("隐藏");
        b.setBounds(150,200,100,30);

        //按钮添加监听
        b.addActionListener(new ActionListener() {
            //当按钮被点击时，就会触发ActionEvent事件
            //actionPerformed方法就会被执行
            @Override
            public void actionPerformed(ActionEvent e) {
                if (b.getText().equals("隐藏")){
                    b.setText("显示");
                    l.setVisible(false);
                } else {
                    b.setText("隐藏");
                    l.setVisible(true);

                }
            }
        });
        f.add(l);
        f.add(b);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);


    }
} 
