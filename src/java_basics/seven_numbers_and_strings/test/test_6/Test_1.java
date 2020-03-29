package java_basics.seven_numbers_and_strings.test.test_6;

/**
 * 创建一个长度是100的字符串数组
 * 使用长度是2的随机字符填充该字符串数组
 * 统计这个字符串数组里重复的字符串有多少种
 **/
public class Test_1 {
    public static void main(String[] args) {

        String[] strs = new String[100];
        for (int i = 0;i <= strs.length / 2;i++){
            char[] c = new char[2];
            for (int j = 0;j < c.length;j++){
                //要产生一个[a,b]之间的整数的方法是(int)(Math.random()*(b-a+1))+a
                //产出48--122之间的随机数
                c[j] = (char)((int)(Math.random() * (122 - 48 + 1) + 48));
            }
            strs[i] = String.valueOf(c);
        }

        int n = 0;
        for (int i = 1;i <= strs.length / 2;i++){
            System.out.printf("%s\t",strs[i]);
            n++;
            if (n % 10 == 0 && n != 0){
                System.out.println();
            }
        }
        int num = 0;
        System.out.printf("相同的值:");
        for (int i = 0;i <= strs.length / 2;i++){
            String s = strs[i];
            for (int j = i;j <= strs.length / 2;j++){
                if (strs[j].equals(s) && i != j){
                    num += 1;
                    System.out.printf("%s\t",s);
                    continue;
                }
            }
        }
        System.out.println();
        System.out.println("相同值有多少个:" + num);
    }
} 
