package java_basics.seven_numbers_and_strings.test.mystringbuffer;

/**
 * @author: ly
 * @date: 2020/03/10
 **/
public class MyStringBuffer implements IStringBuffer {
    String string;

    public MyStringBuffer(String string) {
        this.string = string;
    }

    @Override
    public void append(String str) {//追加字符串
        this.string += str;
    }

    @Override
    public void append(char c) {//追加字符
        this.string += String.valueOf(c);
    }

    @Override
    public void insert(int pos, char b) {//指定位置插入字符
        String str1 = string.substring(0,pos - 1);
        String str2 = string.substring(pos - 1);
        string = str1 + String.valueOf(b) + str2;
    }

    @Override
    public void insert(int pos, String b) {//指定位置插入字符串
        String str1 = string.substring(0,pos - 1);
        String str2 = string.substring(pos - 1);
        string = str1 + b + str2;
    }

    @Override
    public void delete(int start) {//从开始位置删除剩下的
        String str1 = string.substring(0,start);
        string = str1;
    }

    @Override
    public void delete(int start, int end) {
        String str1 = string.substring(0,start);
        String str2 = string.substring(end - 1);
        string = str1 + str2;
    }

    @Override
    public void reverse() {//反转
        char[] chars = string.toCharArray();
        for (int i = 0;i < chars.length / 2;i++){
            char n = chars[i];
            chars[i] = chars[chars.length - i - 1];
            chars[chars.length - i - 1] = n;
        }
        string = String.valueOf(chars);
    }

    @Override
    public int length() {//返回字符串长度
        char[] c = string.toCharArray();
        return c.length;
    }

    @Override
    public String toString() {
        return string;
    }
}
