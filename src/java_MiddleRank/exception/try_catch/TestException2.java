package java_MiddleRank.exception.try_catch;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 多异常捕捉方法2
 **/
public class TestException2 {
    public static void main(String[] args) {
        File f = new File("f:/lol.exe");

        try {
            System.out.println("打开:f:/lol.exe");
            new FileInputStream(f);
            System.out.println("成功打开");
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date d = sdf.parse("2016-03-05");

            /**
             * 多个异常，放在一个catch里统一捕捉
             * 1.好处:
             *     好处是捕捉的代码更紧凑
             * 2.缺点:
             *     不足之处是，一旦发生异常，不能确定到底是哪种异常，
             *     需要通过instanceof 进行判断具体的异常类型
             */
        } catch (FileNotFoundException | ParseException e) {
            if (e instanceof FileNotFoundException)
                System.out.println("f:/lol.exe不存在");
            if (e instanceof ParseException)
                System.out.println("日期格式解析错误");
            e.printStackTrace();
        }
    }
} 
