package java_MiddleRank.exception.test.test_3;

public interface IStringBuffer {
    public void append(String str) throws IndexlsNagetiveException,IndexlsOutofRangeException;//追加字符串
    public void append(char c) throws IndexlsNagetiveException,IndexlsOutofRangeException;//追加字符
    public void insert(int pos, char b) throws IndexlsNagetiveException,IndexlsOutofRangeException;//指定位置插入字符
    public void insert(int pos, String b) throws IndexlsNagetiveException,IndexlsOutofRangeException;//指定位置插入字符串
    public void delete(int start) throws IndexlsNagetiveException;//从开始位置删除剩下的
    public void delete(int start, int end) throws IndexlsNagetiveException;//从开始位置删除结束位置-1
    public void reverse();//反转
    public int length();//返回长度
}
