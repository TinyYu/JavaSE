package java_MiddleRank.io.file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: ly
 * @date: 2020/03/12
 **/
public class TestFile2 {
    public static void main(String[] args) {
        File f = new File("f:/LOLFolder/lol.exe");
        System.out.println("当前文件是:" + f);

        //文件是否存在
        System.out.println("判断文件是否存在:" + f.exists());

        //判断是否是文件夹
        System.out.println("判断是否是文件夹:" + f.isDirectory());

        //判断是否是文件
        System.out.println("判断是否是文件:" + f.isFile());

        //文件长度
        System.out.println("获取文件长度:" + f.length());

        //文件最后修改时间
        long time = f.lastModified();
        Date d = new Date(time);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(d));

        //设置文件修改时建为1970.1.1 08:00:00
        f.setLastModified(0);

        //文件重命名
        File f2 = new File("f:/LOLFolder/data.exe");
        f.renameTo(f2);
    }
} 
