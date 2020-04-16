package java_MiddleRank.gui.gui_1;


import javax.swing.*;

public class TestGUI_1 {
    public static void main(String[] args) {
        //主窗体
        JFrame f = new JFrame("test");

        //设置主窗体大小(分辨率)
        f.setSize(400,300);

        //设置主窗体位置
        f.setLocation(200,200);

        //主窗体中的组件设置为绝对定位
        f.setLayout(null);

        //按钮组件
        JButton b = new JButton("确定");

        //设置按钮大小和位置
        b.setBounds(50,50,280,30);

        //添加按钮到窗体
        f.add(b);

        //关闭窗体的时候，退出程序
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //窗体可见
        f.setVisible(true);
    }
} 
