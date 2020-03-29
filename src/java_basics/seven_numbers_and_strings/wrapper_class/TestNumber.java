package java_basics.seven_numbers_and_strings.wrapper_class;

public class TestNumber {
    public static void main(String[] args) {
        int i = 5;
        Integer it = new Integer(i);
        //Integer是Number的子类，所以打印true
        System.out.println(it instanceof Number);
    }
} 
