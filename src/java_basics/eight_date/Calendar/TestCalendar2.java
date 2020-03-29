package java_basics.eight_date.Calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 翻日历
 **/
public class TestCalendar2 {
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        Date now = c.getTime();

        //当前日期
        System.out.println("当前日期:" + format(c.getTime()));

        //add方法，在原日期上增加年/月/日
        //set方法，直接设置年/月/日

        //下个月的今天
        c.setTime(now);
        c.add(Calendar.MONTH,1); //加一个月
        System.out.println("下个月的今天:" + format(c.getTime()));

        //去年的今天
        c.setTime(now);
        c.add(Calendar.YEAR,-1);//减一年
        System.out.println("去年今天:" + format(c.getTime()));

        //上个月的第三天
        c.setTime(now);
        c.add(Calendar.MONTH,-1);//减一个月
        c.set(Calendar.DATE,3);//第三天
        System.out.println("上个月第三天:" + format(c.getTime()));

    }

    private static String format(Date time){
        return sdf.format(time);
    }
} 
