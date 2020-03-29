package java_basics.three_control_flow.external_loop;

/**
 * 外部循环
 */
public class External_loop {
    public static void main(String[] args) {
        /**
         * 使用boolean结束外部循环
         */
        boolean l = false;//是否终止外部循环的标及
        for (int i = 0;i < 10;i++){
            for (int j = 0;j < 10;j++){
                System.out.println(i + ":" + j);
                if (j % 2 == 0){
                    l = true;//终止外部循环标记
                    break;
                }
            }
            if (l){
                break;//判断是否终止外部循环
            }
        }

        /**
         * 使用标签结束外部循环
         */
        //打印单数
        outloop:
        for (int i = 0;i < 10;i++){
            for (int j = 0;j < 10;j++){
                System.out.println(i + ":" + j);
                if (j % 2 == 0){
                    break outloop;//如果是双数，结束外部循环
                }
            }
        }
    }
}
