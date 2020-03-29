package java_basics.seven_numbers_and_strings.string;

/**
 * 字符串格式化
 */
public class TestString_2 {
    public static void main(String[] args) {
        String name = "zz";
        int kill = 8;
        String title = "cz";

        //格式化字符串
        String sentenceFormat = "%s 在进行了连续 %d 次击杀后，获得了 %s 的称号%n";
        String sentence2 = String.format(sentenceFormat,name,kill,title);
        System.out.println(sentence2);
    }
} 
