package java_MiddleRank.gui.gui_6;

import javax.swing.*;

/**
 * CardLayerout
 */
public class TestGUI_5 {
    public static void main(String[] args) {
        JFrame f = new JFrame("CardLayerout");

        JPanel comboxBoxPane = new JPanel();
        String buttonPanel = "按钮面板";
        String inputPanel = "输入框面板";
        String comboBoxItems[] = {buttonPanel,inputPanel};
        JComboBox<String> cb = new JComboBox<>(comboBoxItems);
        comboxBoxPane.add(cb);


    }
} 
