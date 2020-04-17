package java_MiddleRank.gui.gui_5;

import javax.swing.*;

/**
 * 下拉框 JComboBox
 **/
public class TestGUI_4 {
    public static void main(String[] args) {
        JFrame f = new JFrame("test");
        f.setSize(400,300);
        f.setLocation(200,200);
        f.setLayout(null);

        //下拉框出现的条目
        String[] heros = new String[]{"hero1","hero2"};
        JComboBox comboBox = new JComboBox(heros);
        comboBox.setBounds(50,50,80,30);
        f.add(comboBox);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
