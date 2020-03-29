package java_basics.eight_date.Date_Format;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 字符串转日期
 **/
public class TestTime2 {
    public static void main(String[] args) {
        String str = "2020/3/11 12:12:12";
        //必须和字符串格式保持一致
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

        try {
            Date d = sdf.parse(str);
            System.out.println(d);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
} 
