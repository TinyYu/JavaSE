package java_basics.eight_date.test.test_3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 找出下个月的倒数第3天是哪天
 **/
public class Test {
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        Date date = c.getTime();
        System.out.println("当前时间:" + format(date));

        //下个月倒数第3天
        c.setTime(date);
        c.add(Calendar.MONTH,2);//加2个月
        c.set(Calendar.DATE,-2);//下个月倒数第3天
        System.out.println("下个月倒数第3天是:" + format(c.getTime()));
    }

    private static String format(Date date){
        return sdf.format(date);
    }
} 
