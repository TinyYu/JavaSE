package java_MiddleRank.io.test.test_1;

import java.io.File;

/**
 * 一般说来操作系统都会安装在C盘，所以会有一个 C:\WINDOWS目录。
 *  * 遍历这个目录下所有的文件
 *  * 找出这些文件里，最大的和最小(非0)的那个文件，打印出他们的文件名
 **/
public class Test2 {
    public static void main(String[] args) {
        File f = new File("C:\\Windows");
        File_test(f);
    }

    public static void File_test(File file){
        if (file.exists()){
            File[] fise1 = file.listFiles();
            for (int i = 0;i < fise1.length;i++){
                if (fise1[i].isDirectory()){
                    File file1 = fise1[i];
                    File_test(file);
                } else {
                    System.out.println(fise1[i]);
                    return;
                }
            }
        }
    }
} 
