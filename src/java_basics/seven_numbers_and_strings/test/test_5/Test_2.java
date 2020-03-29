package java_basics.seven_numbers_and_strings.test.test_5;

/**
 * peter piper picked a peck of pickled peppers
 * 统计这段绕口令有多少个以p开头的单词
 **/
public class Test_2 {
    public static void main(String[] args) {
        String str = "peter piper picked a peck of pickled peppers";
        String[] strs = str.split(" ");
        int num = 0;
        for (int i = 0;i < strs.length;i++){
            char a = strs[i].charAt(0);
            if (a == 'p'){
                num += 1;
            }
        }
        System.out.println(num);
    }
} 
