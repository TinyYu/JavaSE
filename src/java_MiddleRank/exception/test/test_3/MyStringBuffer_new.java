package java_MiddleRank.exception.test.test_3;

/**
 * @author: ly
 * @date: 2020/03/11
 **/
public class MyStringBuffer_new implements IStringBuffer{

    int capacity = 16;//容量
    int length = 0;
    char[] value;//存放字符数组

    //根据容量初始化value
    public MyStringBuffer_new(){
        value = new char[capacity];
    }

    //有参构造方法
    public MyStringBuffer_new(String str){
        this();
        if (null == str)
            return;
        if (capacity < str.length()){
            capacity = value.length * 2;
            value = new char[capacity];
        }
        if (capacity >= str.length()){
            System.arraycopy(str.toCharArray(),0,value,0,str.length());
        }
        length = str.length();
    }

    @Override
    public void append(String str) throws IndexlsNagetiveException,IndexlsOutofRangeException {
        insert(length,str);
    }

    @Override
    public void append(char c) throws IndexlsNagetiveException,IndexlsOutofRangeException {
        append(String.valueOf(c));
    }

    @Override
    public void insert(int pos, char b) throws IndexlsNagetiveException,IndexlsOutofRangeException{//指定位置，插入字符
        insert(pos,String.valueOf(b));
    }

    @Override
    public void insert(int pos, String b) throws IndexlsNagetiveException,IndexlsOutofRangeException {//指定位置,插入字符串
        //边界条件判断，不能为负数，不能大于原始字符串长度,字符串参数不能为空
        if (pos < 0)
            throw new IndexlsNagetiveException("指定位置不能为负数");
        if (pos > length)
            throw new IndexlsNagetiveException("指定位置不能大于原始字符串长度");
        if (b == null)
            throw new IndexlsOutofRangeException("需要插入的字符串不能为空");

        //扩容
        while(length + b.length() > capacity){
            capacity = (int) ((length + b.length()) * 1.5f);
            char[] newValue = new char[capacity];
            //复制原数组的所有内容到新数组
            System.arraycopy(value,0,newValue,0,length);
            //扩容原数组的长度
            value = newValue;
            System.out.println(value.length);
        }
        char[] cs = b.toCharArray();
        //已存在数据向后移
        System.arraycopy(value,pos,value,pos + cs.length,length - pos);
        //插入数据
        System.arraycopy(cs,0,value,pos,cs.length);

        length += cs.length;


    }

    @Override
    public void delete(int start) throws IndexlsNagetiveException {
        delete(start,length);
    }

    @Override
    public void delete(int start, int end) throws IndexlsNagetiveException{
        //边界条件判断
        if (start < 0)
            throw new IndexlsNagetiveException("指定位置不能为负数");
        if (start >= end)
            throw new IndexlsNagetiveException("指定起点位置不能大于终点");
        if (end > length)
            throw new IndexlsNagetiveException("指定位置不能大于原始字符串长度");
        if (end < 0)
            throw new IndexlsNagetiveException("指定位置不能为负数");
        System.arraycopy(value,end,value,start,length - end);
        length -= end - start;
    }

    @Override
    public void reverse() {//反转
        for (int i = 0;i < value.length / 2;i++){
            char n = value[i];
            value[i] = value[value.length - i - 1];
            value[value.length - i - 1] = n;
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
