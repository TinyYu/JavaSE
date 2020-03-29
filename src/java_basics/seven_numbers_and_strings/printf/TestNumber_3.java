package java_basics.seven_numbers_and_strings.printf;

import java.util.Locale;

/**
 * 总长度，左对齐，补0，千位分隔符，小数点位数，本地化表达
 **/
public class TestNumber_3 {
    public static void main(String[] args) {
        int year = 2020;

        //直接打印数字
        System.out.format("%d%n",year);
        //总长度是8，默认右对齐
        System.out.format("%8d%n",year);
        //总长度是8，左对齐
        System.out.format("%-8d%n",year);
        //总长度是8，不够补0
        System.out.format("%08d%n",year);
        //千位分隔符
        System.out.format("%,8d%n",year * 1000);

        //小数点位数
        System.out.format("%.2f%n",Math.PI);

        //不同国家分隔符
        //Locale地区类
        System.out.format(Locale.FRANCE,"%,.2f%n",Math.PI * 10000);
    }

} 
