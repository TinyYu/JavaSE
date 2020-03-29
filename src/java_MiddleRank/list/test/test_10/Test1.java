package java_MiddleRank.list.test.test_10;

/**
 * @author: ly
 * @date: 2020/03/25
 **/
public class Test1 {
    public static void main(String[] args) {
        String[] strings = new String[100];
        String s = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] c = s.toCharArray();
        for (int i = 0;i < strings.length;i++){
            int num = (int)(Math.random() * (10 - 2 + 1) + 2);
            String sbu = "";
            StringBuffer sb = new StringBuffer(sbu);
            for (int j = 0;j < num;j++){
                sb.append(c[(int)(Math.random() * c.length)]);
            }
            strings[i] = String.valueOf(sb);
        }
        int[] is = new int[strings.length];
        for (int i = 0;i < strings.length;i++){
            is[i] = hashcode(strings[i]);
        }

        for (int i = 0;i < is.length;i++){
            System.out.printf("%d\t",is[i]);
            if (i % 10 == 0 && i != 0){
                System.out.println();
            }
        }
    }

    public static int hashcode(String s){
        char[] chars = s.toCharArray();
        int hashcode_int = 0;
        for (int i = 0;i < chars.length;i++){
            hashcode_int += (int) chars[i];
        }
        hashcode_int *= 32;
        if (hashcode_int > 1999){
            hashcode_int = hashcode_int % 2000;
        }
        return hashcode_int;
    }
} 
