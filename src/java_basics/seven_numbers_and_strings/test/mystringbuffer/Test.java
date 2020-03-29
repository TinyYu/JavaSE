package java_basics.seven_numbers_and_strings.test.mystringbuffer;

/**
 * @author: ly
 * @date: 2020/03/10
 **/
public class Test {
    public static void main(String[] args) {
        String string = "this";
        MyStringBuffer ms = new MyStringBuffer(string);
        MyStringBuffer_new mn = new MyStringBuffer_new(string);
        ms.append("ttt");
        System.out.println(ms);

        ms.insert(4,"sss");
        System.out.println(ms);


        ms.delete(2,6);
        System.out.println(ms);

        ms.reverse();
        System.out.println(ms);

        System.out.println(ms.length());

        mn.insert(2,string);
        System.out.println(mn);
    }
} 
