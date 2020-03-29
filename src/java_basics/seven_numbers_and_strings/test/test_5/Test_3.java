package java_basics.seven_numbers_and_strings.test.test_5;

/**
 * 把 lengendary 改成间隔大写小写模式，即 LeNgEnDaRy
 **/
public class Test_3 {
    public static void main(String[] args) {
        String str = "lengendary";
        char[] chars = str.toCharArray();
        for (int i = 0;i < chars.length;i++){
            if (i % 2 == 0){
                chars[i] -= 32;
            }
        }
        String str_new = String.valueOf(chars);
        System.out.println(str_new);
    }
} 
