package java_basics.eight_date.Calendar;

import java.util.Calendar;
import java.util.Date;

/**
 * Calendar与Date进行转换
 **/
public class TestCalendar1 {
    public static void main(String[] args) {
        //采用单例模式获取日期对象Calendar.getInstance()
        Calendar c = Calendar.getInstance();

        //通过日历对象得到日期对象
        Date d = c.getTime();

        Date d2 = new Date(0);
        c.setTime(d2);//把日历调成日期:1970.1.1 08:00:00
    }
} 
