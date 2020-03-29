package java_basics.three_control_flow.test;

/**
 * 水仙花数定义：
 * 1. 一定是3位数
 * 2. 每一位的立方，加起来恰好是这个数本身，比如153=1*1*1+5*5*5+3*3*3
 * 寻找所有的水仙花数
 */
public class Test_9 {
    public static void main(String[] args) {
        int x = 0;//百位
        int y = 0;//十位
        int z = 0;//个位
        for (int i = 100;i <= 999;i++){
            x = i / 100;
            y = i / 10 % 10;
            z = i % 10;
            if (i == (Math.pow(x,3) + Math.pow(y,3) + Math.pow(z,3))){
                System.out.println(i);
            }
        }
    }
}
