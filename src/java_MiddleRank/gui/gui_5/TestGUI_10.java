package java_MiddleRank.gui.gui_5;

import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

/**
 * 文本选择器 JFileChooser
 **/
public class TestGUI_10 {
    public static void main(String[] args) {
        JFrame f = new JFrame("TEST");
        f.setSize(250,150);
        f.setLayout(new FlowLayout());
        JFileChooser fc = new JFileChooser();

        //使用FileFilter用于仅选择.txt文件
        fc.setFileFilter(new FileFilter() {
            @Override
            public boolean accept(File f) {
                return f.getName().toLowerCase().endsWith(".txt");
            }

            @Override
            public String getDescription() {
                return ".txt";
            }
        });

        JButton bOpen = new JButton("打开文件");
        bOpen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //fc.showOpenDialog(); 用于打开文件
                int returnVal = fc.showOpenDialog(f);
                File file = fc.getSelectedFile();
                if (returnVal == JFileChooser.APPROVE_OPTION){
                    JOptionPane.showMessageDialog(f,"打开文件:" + file
                    .getAbsolutePath());
                }
            }
        });
        JButton bSave = new JButton("保存文件");
        bSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //fc.showSaveDialog(); 用于保存文件
                int returnVal = fc.showSaveDialog(f);
                File file = fc.getSelectedFile();
                if (returnVal == JFileChooser.APPROVE_OPTION){
                    JOptionPane.showMessageDialog(f,"打开文件:" + file
                            .getAbsolutePath());
                }
            }
        });
        f.add(bOpen);
        f.add(bSave);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
} 
