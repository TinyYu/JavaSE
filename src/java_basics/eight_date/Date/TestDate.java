package java_basics.eight_date.Date;

import java.util.Date;

/**
 * 创建日期对象
 **/
public class TestDate {
    public static void main(String[] args) {
        //当前时间
        Date d1 = new Date();
        System.out.println("当前时间:" + d1);

        //从1970年1月1日 早上8点0分0秒 开始经历的毫秒数
        Date d2 = new Date(5000);
        System.out.println("从1970年1月1日，早8时0分0秒，开始经历5秒的时间");
        System.out.println(d2);
    }
} 
