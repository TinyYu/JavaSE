package java_basics.three_control_flow.if_else;

/**
 * if_else
 */
public class if_else {
    public static void main(String[] args) {
        boolean b = true;

        /**
         * if
         */
        //如果为真，打印yes
        if (b){
            System.out.println("yes");
        }

        /**
         * if_else
         */
        //如果为真打印yes，否则打印no
        if (!b){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        /**
         * else_if
         */
        //如果只使用 if,会执行4次判断
        int i = 2;
        if (i==1)
            System.out.println(1);
        if (i==2)
            System.out.println(2);
        if (i==3)
            System.out.println(3);
        if (i==4)
            System.out.println(4);
        //如果使用else if, 一旦在18行，判断成立， 20行和22行的判断就不会执行了，节约了运算资源
        if (i==1)
            System.out.println(1);
        else if (i==2)
            System.out.println(2);
        else if (i==3)
            System.out.println(3);
        else if (i==4)
            System.out.println(4);
    }
}
