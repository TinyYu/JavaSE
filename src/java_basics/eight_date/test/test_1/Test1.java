package java_basics.eight_date.test.test_1;

import java.util.Date;

/**
 * 借助随机数，创建一个从1995.1.1 00:00:00 到 1995.12.31 23:59:59 之间的随机日期
 **/
public class Test1 {
    public static void main(String[] args) {
        Date d1 = new Date(95,1,1,0,0,0);
        Date d2 = new Date(95,12,31,23,59,59);
        long time1 = d1.getTime();
        long time2 = d2.getTime();
        long time3 = (long)(Math.random() * (time2 - time1) + time1);
        Date d3 = new Date(time3);
        System.out.println(d3);
    }
} 
