package java_MiddleRank.gui.gui_6;

import javax.swing.*;

/**
 * ContentPane
 */
public class TestGUI_2 {
    public static void main(String[] args) {
        JFrame f = new JFrame("test");
        f.setSize(400,300);
        f.setLocation(200,200);
        f.setLayout(null);
        JButton b = new JButton("一键秒");
        b.setBounds(50,50,280,30);
        f.add(b);
        // JFrame上有一层面板，叫做ContentPane
        // 平时通过f.add()向JFrame增加组件，其实是向JFrame上的 ContentPane加东西
        // f.add等同于f.getContentPane().add(b);
        f.getContentPane().add(b);
        // b.getParent()获取按钮b所处于的容器
        // 打印出来可以看到，实际上是ContentPane而非JFrame
        System.out.println(b.getParent());
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
