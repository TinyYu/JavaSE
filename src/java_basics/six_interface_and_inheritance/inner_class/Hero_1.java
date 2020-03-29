package java_basics.six_interface_and_inheritance.inner_class;

/**
 * 静态内部类
 */
public class Hero_1 {
    String name;

    //外部类私有静态成员
    private static void battleWin(){
        System.out.println("battle win");
    }

    //静态内部类
    //敌方水晶
    static class EnemyCrystal{
        int hp = 555;

        public void checkIfvictory(){
            if (hp == 0){
                //可以访问外部类的私有静态成员
                Hero_1.battleWin();

                //静态内部类不能直接访问外部类的对象属性
//                System.out.println(name);
            }
        }
    }

    public static void main(String[] args) {
        //与非静态内部类不同，静态内部类水晶类的实例化 不需要一个外部类的实例为基础，可以直接实例化
        //实例化静态内部类
        EnemyCrystal crystal = new EnemyCrystal();
        crystal.checkIfvictory();
    }
} 
