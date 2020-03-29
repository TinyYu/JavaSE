package java_basics.seven_numbers_and_strings.stringbuffer;

/**
 * 追加 删除 插入 反转
 **/
public class Test_1 {
    public static void main(String[] args) {
        String str = "let there";

        StringBuffer sb = new StringBuffer(str);//根据str创建一个StringBuffer对象

        //追加
        sb.append(" be light");//在最后追加
        System.out.println(sb);

        //删除字符
        sb.delete(4,10);//删除4-10之间的字符
        System.out.println(sb);

        //插入
        sb.insert(4,"there ");//在4位置插入there
        System.out.println(sb);

        //反转
        sb.reverse();
        System.out.println(sb);
    }
} 
