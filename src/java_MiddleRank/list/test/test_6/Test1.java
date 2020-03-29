package java_MiddleRank.list.test.test_6;


import java.util.HashSet;

/**
 * @author: ly
 * @date: 2020/03/19
 **/
public class Test1 {
    public static void main(String[] args) {
        String[] strings = new String[100];
        for (int i = 0;i < strings.length;i++){
            strings[i] = RandomStr();
        }
        HashSet<String> hashSet = new HashSet<>();
        HashSet<String> hashSet1 = new HashSet<>();
        for (String s : strings){
            if (!hashSet.add(s)){
                hashSet1.add(s);
            }
        }
        int i = 1;
        for (String s : strings){
            if (i % 10 == 0){
                System.out.println();
            }
            System.out.printf("%s ",s);
            i++;
        }
        System.out.println("重复值:" + hashSet1.size() + "个");
        for (String s : hashSet1){
            System.out.println(s);
        }

    }

    public static String RandomStr() {
        String s = "0123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
        char[] c = s.toCharArray();
        String cs = String.valueOf(c[(int) (Math.random() * c.length)]) +
                String.valueOf(c[(int) (Math.random() * c.length)]);
        return cs;
    }
} 
