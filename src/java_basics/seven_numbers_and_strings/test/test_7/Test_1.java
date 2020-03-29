package java_basics.seven_numbers_and_strings.test.test_7;


import java_basics.seven_numbers_and_strings.test.mystringbuffer.MyStringBuffer;
import java_basics.seven_numbers_and_strings.test.mystringbuffer.MyStringBuffer_new;

/**
 * String与StringBuffer的性能区别
 **/
public class Test_1 {
    public static void main(String[] args) {
        String str = "";
        StringBuffer sb = new StringBuffer(str);
        MyStringBuffer mb = new MyStringBuffer(str);
        MyStringBuffer_new mn = new MyStringBuffer_new(str);

        int time_stater = (int) System.currentTimeMillis();
        char[] c = new char[10];
        for (int i = 0;i < 10000;i++){
            for (int j = 0;j < c.length;j++){
                c[j] =(char) ((int)(Math.random() * (122 - 48 + 1) + 48));
            }
            str += String.valueOf(c);
        }
        int time_end = (int) System.currentTimeMillis();
        System.out.println("String耗时:" + (time_end - time_stater));


        time_stater = (int) System.currentTimeMillis();
        for (int i = 0;i < 10000;i++){
            for (int j = 0;j < c.length;j++){
                c[j] =(char) ((int)(Math.random() * (122 - 48 + 1) + 48));
            }
            sb.append(String.valueOf(c));
        }
        time_end = (int) System.currentTimeMillis();
        System.out.println("StringBuffer耗时:" + (time_end - time_stater));

        time_stater = (int) System.currentTimeMillis();
        for (int i = 0;i < 10000;i++){
            for (int j = 0;j < c.length;j++){
                c[j] =(char) ((int)(Math.random() * (122 - 48 + 1) + 48));
            }
            mb.append(String.valueOf(c));
        }
        time_end = (int) System.currentTimeMillis();
        System.out.println("MyStringBuffer耗时:" + (time_end - time_stater));

        time_stater = (int) System.currentTimeMillis();
        for (int i = 0;i < 10000;i++){
            for (int j = 0;j < c.length;j++){
                c[j] =(char) ((int)(Math.random() * (122 - 48 + 1) + 48));
            }
            mn.append(String.valueOf(c));
        }
        time_end = (int) System.currentTimeMillis();
        System.out.println("MyStringBuffer_new耗时:" + (time_end - time_stater));
    }
} 
