package java_basics.seven_numbers_and_strings.stringbuffer;

/**
 * 长度 容量
 **/
public class Test_2 {
    public static void main(String[] args) {
        String str1 = "the";
        StringBuffer sb = new StringBuffer(str1);
        System.out.println(sb.length());//内容长度
        System.out.println(sb.capacity());//总长度
    }
} 
