package java_basics.seven_numbers_and_strings.test.mystringbuffer;

public class MyStringBuffer_new implements IStringBuffer{
    int capacity = 16;//容量
    int length = 0;//长度
    char[] value;//字符数组

    //分配字符数组空间
    public MyStringBuffer_new(){
        value = new char[capacity];
    }

    //有参数构造方法
    public MyStringBuffer_new(String str){
        this();
        if (null == str)
            return;
        if (capacity < str.length()){
            capacity = value.length * 2;//如果容量不够，重新分配容量
            length = value.length;//获取字符串长度
        }
        if (capacity >= str.length()){
            System.arraycopy(str.toCharArray(),0,value,0,str.length());//转换为字符数组
        }
        length = str.length();
    }

    @Override
    public void append(String str) {//追加字符串
        insert(length,str);
    }

    @Override
    public void append(char c) {//追加字符
        append(String.valueOf(c));
    }

    @Override
    public void insert(int pos, char b) {//插入字符
        insert(pos,String.valueOf(b));
    }

    @Override
    public void insert(int pos, String b) {//插入字符串
        //边界条件判断
        //参数边界不能小于0，不能大于字符串长度，字符串不能为空
        if (pos < 0)
            return;
        if (pos > length)
            return;
        if (b == null)
            return;

        //扩容
        //如果原始字符串加上插入字符串长度大于容量需要扩容
        while (length + b.length() > capacity){
            capacity = (int) ((length + b.length()) * 1.5f);

            //重新分配字符数组空间
            char[] newValue = new char[capacity];
            System.arraycopy(value,0,newValue,0,length);//原始数组复制到扩容数组中
            value = newValue;//重新分配空间
        }
        char[] cs = b.toCharArray();//将插入字符串转换为字符数组
        //将原始数据向后移
        System.arraycopy(value,pos,value,pos + cs.length,length - pos);
        //插入指定位置
        System.arraycopy(cs,0,value,pos,cs.length);
        length = length + cs.length;
    }

    @Override
    public void delete(int start) {//删除字符
        delete(start,length);
    }

    @Override
    public void delete(int start, int end) {//删除字符串
        //边界条件判断
        if (start < 0)
            return;
        if (start >= end)
            return;
        if (end < 0)
            return;
        if (start > length)
            return;

        System.arraycopy(value,end,value,start,length - end);
        length -= end - start;
    }

    @Override
    public void reverse() {//反转
        for (int i = 0;i < length / 2;i++){
            char c = value[i];
            value[i] = value[length - i - 1];
            value[length - i - 1] = c;
        }
    }

    @Override
    public int length() {
        return length;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
