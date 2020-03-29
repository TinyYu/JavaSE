package java_basics.eight_date.Date_Format;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期转字符串
 **/
public class TestTime1 {
    public static void main(String[] args) {
        //y(年)、M(月)、d(日)、H（24进制的小时）、h（12进制的小时）、m(分)、s(秒)、S(毫秒)
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        Date d = new Date();
        //格式化(日期转字符串)
        String str = sdf.format(d);
        System.out.println(str);

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        String str1 = sdf1.format(d);
        System.out.println(str1);
    }
} 
