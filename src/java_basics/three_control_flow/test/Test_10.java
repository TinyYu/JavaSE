package java_basics.three_control_flow.test;

/**
 * 四个数: x,y,i,j
 * x + y = 8,x + i = 14,y + j = 10,i - j = 6
 *
 * x + y = 8
 * +   +
 * i - j = 6
 * =   =
 * 14  10
 */
public class Test_10 {
    public static void main(String[] args) {
        for (int i = 0;;i++){
            int x = 14 - i;
            int y = 8 - x;
            int j = i - 6;
            if (x + y == 8 && x + i ==14 && y + j == 10 && i - j == 6){
                System.out.println("x = " + x + "," + "y = " + y + "," + "i = " + i + "," + "j = " + j + ",");
                break;
            }
        }
    }
}
