package java_MiddleRank.exception.try_catch;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 多异常捕捉1
 **/
public class TestException1 {
    public static void main(String[] args) {
        File f = new File("f:/lol.exe");


        try {
            System.out.println("打开f:/lol.exe");
            new FileInputStream(f);
            System.out.println("成功打开");
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date d = sdf.parse("2016-05-04");
        } catch (FileNotFoundException e) {
            System.out.println("f:/lol.exe不存在");
            e.printStackTrace();
        } catch (ParseException e) {
            System.out.println("日期格式错误");
            e.printStackTrace();
        }
    }
} 
