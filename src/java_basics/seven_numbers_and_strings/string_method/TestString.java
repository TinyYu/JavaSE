package java_basics.seven_numbers_and_strings.string_method;

/**
 * @author: ly
 * @date: 2020/03/10
 **/
public class TestString {
    public static void main(String[] args) {
        String sentence = "盖伦,在进行了连续8次击杀后,获得了 超神 的称号";

        //获取字符
        char c = sentence.charAt(0);

        //获取对应的字符数组
        char[] cs = sentence.toCharArray();

        //截取字符串
        //截取从第3个开始的字符串（基0）
        String str1 = sentence.substring(3);
        System.out.println(str1);
        //截取从第3个开始的字符至第5-1结束的字符串
        //左闭右开
        String str2 = sentence.substring(3,5);
        System.out.println(str2);

        //分隔
        //根据,进行分隔，得到3个字符串
        String subSentences[] = sentence.split(",");
        for (String s : subSentences){
            System.out.println(s);
        }

        //去除首尾空格
        sentence.trim();

        //全部转换为小写
        sentence.toLowerCase();
        //全部转换为大写
        sentence.toUpperCase();

        //定位
        //定位字符第一次出现的位置
        sentence.indexOf('c');
        //定位字符串第一次出现的位置
        sentence.indexOf("sc");
        //定位字符串最后出现的位置
        sentence.lastIndexOf("sc");
        //从位置5开始，定位c出现第一次的位置
        sentence.indexOf('c',5);

        //是否包含字符串ac
        sentence.contains("ac");


        //替换
        //字符串中所有cs替换为as
        sentence.replaceAll("cs","as");
        //只替换第一个cs为as
        sentence.replaceFirst("cs","as");
    }
} 
