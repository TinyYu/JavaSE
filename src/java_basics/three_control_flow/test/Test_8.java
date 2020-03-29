package java_basics.three_control_flow.test;

/**
 * 寻找某两个数相除，其结果 离黄金分割点 0.618最近
 *
 * 分母和分子不能同时为偶数
 * 分母和分子 取值范围在[1-20]
 */
public class Test_8 {
    public static void main(String[] args) {
        double d = 0.618;//黄金分割点
        double da = 0;
        double x = 0;//分子
        double y = 0;//分母
        for (double i = 1;i <= 20;i++){
            for (double j = 1;j <= 20;j++){
                if (i % 2 == 0 && j % 2 == 0){//不能同时为偶数
                    continue;
                }else{
                    //Math.abs绝对值
                    if (Math.abs(d - (i / j)) < Math.abs(da - d)){
                        da = i / j;
                        x = i;
                        y = j;
                    }
                }
            }
        }
        System.out.println(x + " / " + y + " = " + (x / y));
    }
}
