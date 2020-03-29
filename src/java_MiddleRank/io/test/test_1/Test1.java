package java_MiddleRank.io.test.test_1;

import java.io.File;

/**
 * 一般说来操作系统都会安装在C盘，所以会有一个 C:\WINDOWS目录。
 * 遍历这个目录下所有的文件(不用遍历子目录)
 * 找出这些文件里，最大的和最小(非0)的那个文件，打印出他们的文件名
 **/
public class Test1 {
    public static void main(String[] args) {
        File f = new File("C:\\Windows");
        if (f.exists()){
            File[] files = f.listFiles();
            long max = files[0].length();
            long min = Long.MAX_VALUE;
            File fmax = null;
            File fmin = null;
            for (int i = 0;i < files.length;i++){
                if (files[i].isDirectory())
                    continue;
                if (files[i].length() > max){
                    max = files[i].length();
                    fmax = files[i];
                }
                if (files[i].length() < min && files[i].length() != 0){
                    System.out.println(files[i].length());
                    min = files[i].length();
                    fmin = files[i];
                }
            }
            System.out.println("最大文件是:" + fmax + " 文件大小是:" + max);
            System.out.println("最小文件是:" + fmin + " 文件大小是:" + min);
        } else {
            System.out.println("未找到文件路径");
        }
    }
} 
