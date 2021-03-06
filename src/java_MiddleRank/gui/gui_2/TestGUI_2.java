package java_MiddleRank.gui.gui_2;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * 键盘监听
 **/
public class TestGUI_2 {
    public static void main(String[] args) {
        JFrame f = new JFrame("TEST");
        f.setSize(400,300);
        f.setLocation(200,200);
        f.setLayout(null);

        final JLabel l = new JLabel();
        ImageIcon i = new ImageIcon("C:\\Users\\ZHANGF-PC\\Pictures\\shana.png");
        l.setIcon(i);
        l.setBounds(50,50,i.getIconWidth(),i.getIconHeight());

        //添加键盘监听
        f.addKeyListener(new KeyListener() {
            //一个按下弹起的组合动作
            @Override
            public void keyTyped(KeyEvent e) {

            }

            //按键被按下
            @Override
            public void keyPressed(KeyEvent e) {
                //39代表“右键”
                if (e.getKeyCode() == 39){
                    //图片向右移动(y坐标不变,x坐标增加)
                    l.setLocation(l.getX() + 10,l.getY());
                }

                if (e.getKeyChar() == 'w'){
                    l.setLocation(l.getX(),l.getY() - 10);
                }

                if (e.getKeyChar() == 's'){
                    l.setLocation(l.getX(),l.getY() + 10);
                }

                if (e.getKeyChar() == 'a'){
                    l.setLocation(l.getX() - 10,l.getY());
                }

                if (e.getKeyChar() == 'd'){
                    l.setLocation(l.getX() + 10,l.getY());
                }
            }

            //按键被弹起
            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
        f.add(l);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }
} 
