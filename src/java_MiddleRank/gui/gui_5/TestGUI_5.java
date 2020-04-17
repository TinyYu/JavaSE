package java_MiddleRank.gui.gui_5;

import javax.swing.*;

/**
 * 对话框
 **/
public class TestGUI_5 {
    public static void main(String[] args) {
        JFrame f = new JFrame("test");
        f.setSize(400,300);
        f.setLocation(580,240);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        int option = JOptionPane.showConfirmDialog(f,"是否删除");
        if (JOptionPane.OK_OPTION == option){
            String answer = JOptionPane.showInputDialog(f,"请输入yes");
            if ("yes".equals(answer)){
                JOptionPane.showMessageDialog(f,"删除文件成功");
            }
        }
    }
} 
