package java_MiddleRank.gui.gui_5;

import javax.swing.*;

/**
 * JCheckBox复选框
 **/
public class TestGUI_2 {
    public static void main(String[] args) {
        JFrame f = new JFrame("test");
        f.setSize(400,300);
        f.setLocation(580,200);
        f.setLayout(null);
        JCheckBox box = new JCheckBox("ADHero");
        //设置为默认被选中
        box.setSelected(true);
        box.setBounds(50,50,130,30);
        JCheckBox box1 = new JCheckBox("APHero");
        box1.setBounds(50,100,130,30);
        //判断是否被选中
        System.out.println(box1.isSelected());

        f.add(box);
        f.add(box1);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
} 
