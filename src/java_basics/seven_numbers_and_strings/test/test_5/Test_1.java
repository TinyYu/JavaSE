package java_basics.seven_numbers_and_strings.test.test_5;

/**
 * 给出一句英文句子： "let there be light"
 * 得到一个新的字符串，每个单词的首字母都转换为大写
 **/
public class Test_1 {
    public static void main(String[] args) {
        String str_old = "let there be light";
        String[] strs = str_old.split(" ");
        String str_new = "";
        for (int i = 0;i < strs.length;i++){
            char a = strs[i].charAt(0);
            char a_new = (char) (a - 32);
            str_new =str_new + strs[i].replaceFirst(String.valueOf(a),String.valueOf(a_new)) + " ";
        }
        System.out.println(str_new);
    }
} 
