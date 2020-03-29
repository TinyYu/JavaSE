package java_basics.three_control_flow.while_and_dowhile;

/**
 * while && do while
 */
public class while_dowhile {
    public static void main(String[] args) {
//        只要while中的表达式成立，就会不断地循环执行
        int i = 0;
        while (i < 5){
            System.out.println(i);
            i++;
        }

//        与while的区别是，无论是否成立，先执行一次，再进行判断
        int i1 = 0;
        do {
            System.out.println(i1);
            i1++;
        }while (i1 < 5);
    }
}
