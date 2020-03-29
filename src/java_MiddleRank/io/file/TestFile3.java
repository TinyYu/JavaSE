package java_MiddleRank.io.file;

import java.io.File;
import java.io.IOException;

/**
 * @author: ly
 * @date: 2020/03/13
 **/
public class TestFile3 {
    public static void main(String[] args) {
        File f = new File("f:/LOLFolder/skin/garen.ski");

        //以字符串数组的形式，返回当前文件夹下所有文件（不包含子文件夹及子文件）
        f.list();

        //以文件数组的形式，返回当前文件夹下的所有文件（不抱哈子文件夹及子文件）
        File[] fs = f.listFiles();

        //以字符串形式返回获取所在文件夹
        f.getParent();
        System.out.println(f.getParent());

        //创建文件夹，如果父文件夹skin不存在，创建无效
        File f1 = new File("f:/LOLFolder/skin/lol");
        f1.mkdir();

        //创建文件夹，如果父文件夹skin不存在，就会创建父文件夹skin
        File f2 = new File("F:/LOLFolder/sk/data.exe");
        f2.mkdirs();

        //创建一个空文件，如果父文件夹skin不存在，就会抛出异常
        File f3 = new File("f:/LOLFolder/sk/ss.txt");
        try {
            f3.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //所以创建一个空文件之前，通常都会创建父目录
        f3.getParentFile().mkdirs();

        //列出所有盘符
        f.listRoots();

        //删除文件
        f.delete();

        //JVM结束的时候，删除文件，常用于临时文件的删除
        f.deleteOnExit();
    }
} 
