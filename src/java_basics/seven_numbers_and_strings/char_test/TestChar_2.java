package java_basics.seven_numbers_and_strings.char_test;

public class TestChar_2 {
    public static void main(String[] args) {
        //判断是否为字母
        Character.isLetter('a');

        //判断是否为数字
        Character.isDigit('a');

        //是否是空白
        Character.isWhitespace(' ');

        //是否是大写
        Character.isUpperCase('a');

        //是否是小写
        Character.isLowerCase('a');

        //转换为大写
        Character.toUpperCase('a');
        //转换为小写
        Character.toLowerCase('A');
        //转换为字符串
        String str = Character.toString('a');
    }
} 
