package java_MiddleRank.gui.gui_2;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

/**
 * 鼠标监听
 * MouseListener 鼠标监听器
 *      mouseReleased 鼠标释放
 *      mousePressed 鼠标按下
 *      mouseExited 鼠标退出
 *      mouseEntered 鼠标进入
 *      mouseClicked 鼠标点击
 **/
public class TestGUI_3 {
    public static void main(String[] args) {
        JFrame f = new JFrame("TEST");
        f.setSize(400,300);
        f.setLocation(200,200);
        f.setLayout(null);

        final JLabel l = new JLabel();
        ImageIcon i = new ImageIcon("C:\\Users\\ZHANGF-PC\\Pictures\\shana_heiheihei.png");
        l.setIcon(i);
        l.setBounds(50,50,i.getIconWidth(),i.getIconHeight());
        f.add(l);

        l.addMouseListener(new MouseListener() {
            // 按下释放组合动作为点击鼠标
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            // 按下鼠标
            @Override
            public void mousePressed(MouseEvent e) {

            }

            // 释放鼠标
            @Override
            public void mouseReleased(MouseEvent e) {

            }

            // 鼠标进入
            @Override
            public void mouseEntered(MouseEvent e) {
                Random r = new Random();
                int x = r.nextInt(f.getWidth() - l.getWidth());
                int y = r.nextInt(f.getHeight() - l.getHeight());
                l.setLocation(x,y);
            }

            // 鼠标退出
            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
} 
