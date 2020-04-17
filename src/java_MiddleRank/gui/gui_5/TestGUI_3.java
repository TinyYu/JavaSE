package java_MiddleRank.gui.gui_5;

import javax.swing.*;

/**
 * 单选框,按钮组
 **/
public class TestGUI_3 {
    public static void main(String[] args) {
        JFrame f = new JFrame("test");
        f.setSize(400,300);
        f.setLocation(200,200);
        f.setLayout(null);

        JRadioButton b1 = new JRadioButton("ADHero");
        //设置为默认选中
        b1.setSelected(true);
        b1.setBounds(50,50,130,30);
        JRadioButton b2 = new JRadioButton("APHero");
        b2.setBounds(50,100,130,30);

        //按钮分组
        ButtonGroup bg = new ButtonGroup();
        //把b1，b2放在 同一个 按钮分组对象里 ，这样同一时间，只有一个 按钮 会被选中
        bg.add(b1);
        bg.add(b2);

        f.add(b1);
        f.add(b2);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
} 
