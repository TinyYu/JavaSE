package java_basics.six_interface_and_inheritance.inner_class;

/**
 * 在匿名类中使用外部的局部变量
 */
public abstract class Hero_4 {
    public abstract void attack();

    public static void main(String[] args) {
        //在匿名类中使用外部的局部变量，该变量必须使用final修饰
        final int damage = 5;

        Hero_4 h = new Hero_4() {
            @Override
            public void attack() {
                System.out.printf("造成%d",damage);
            }
        };
        h.attack();
    }
} 
