package java_basics.eight_date.test.test_2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 准备一个长度是9的日期数组
 * 使用1970年-2000年之间的随机日期初始化该数组
 * 按照这些日期的时间进行升序排序
 * 比如 1988-1-21 12:33:22 就会排在 1978-4-21 19:07:23 前面，因为它的时间更小，虽然日期更大
 **/
public class Test1 {
    public static void main(String[] args) {
        Date[] dates = new Date[9];

        String str1 = "1970/01/01";
        String str2 = "2000/12/31";
        //必须和字符串格式保持一致
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd");

        Date d1 = null;
        Date d2 = null;
        try {
            d1 = sdf1.parse(str1);
            d2 = sdf1.parse(str2);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        long time1 = d1.getTime();
        long time2 = d2.getTime();

        for (int i = 0;i < dates.length;i++){
            long time = (long)(Math.random() * (time2 - time1) + time1);
            Date date = new Date(time);
            dates[i] = date;
        }

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        for (Date d : dates){
            String s = sdf.format(d);
            System.out.println(s);
        }

        for (int i = 0;i < dates.length;i++){
            for (int j = 0;j < dates.length - i - 1;j++){
                //小时*60*60 + 分钟 * 60 + 秒
                long time3 = dates[j].getHours() * 60 * 60 + dates[j].getMinutes() * 60 + dates[j].getSeconds();
                long time4 = dates[j + 1].getHours() * 60 * 60 + dates[j + 1].getMinutes() * 60 + dates[j + 1].getSeconds();
                if (time3 > time4){
                    Date dtim = dates[j];
                    dates[j] = dates[j + 1];
                    dates[j + 1] = dtim;
                }
            }
        }

        System.out.println("排序后：");
        for (Date date : dates){
            String s = sdf.format(date);
            System.out.println(s);
        }
    }
} 
