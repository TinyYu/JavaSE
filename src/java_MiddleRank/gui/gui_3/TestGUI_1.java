package java_MiddleRank.gui.gui_3;

import javax.swing.*;

/**
 * java的图形界面中，容器是用来存放 按钮，输入框等组件的。
 *
 * 窗体型容器有两个，一个是JFrame,一个是JDialog
 *
 * JFrame是最常用的窗体型容器，默认情况下，在右上角有最大化最小化按钮
 * JDialog也是窗体型容器，右上角没有最大和最小化按钮
 **/
public class TestGUI_1 {
    public static void main(String[] args) {
        //父窗体
        JFrame f = new JFrame("外部窗体");
        f.setSize(800,600);
        f.setLocation(100,100);

        //根据外部窗体实例化JDialog
        JDialog d = new JDialog(f);
        //设置为模态：其背后的父窗体，是不能被激活的，除非该对话框被关闭
        d.setModal(true);

        d.setTitle("模态的对话框");
        d.setSize(400,300);
        d.setLocation(200,200);
        d.setLayout(null);
        JButton b = new JButton("按钮");
        b.setBounds(50,50,280,30);
        d.add(b);

        //窗口大小不可变
        f.setResizable(false);
        f.setVisible(true);
        d.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
} 
